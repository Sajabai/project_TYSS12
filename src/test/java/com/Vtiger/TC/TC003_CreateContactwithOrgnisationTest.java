package com.Vtiger.TC;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Vtiger.POMclasses.ContactPage;
import com.Vtiger.POMclasses.CreateContactPage;
import com.Vtiger.POMclasses.HomePage;
import com.Vtiger.POMclasses.LoginPage;
import com.Vtiger.genericUtil.BaseTest;
import com.Vtiger.genericUtil.FileUtil;
import com.Vtiger.genericUtil.JavaUtil;
import com.Vtiger.genericUtil.WebdriverUtil;

public class TC003_CreateContactwithOrgnisationTest extends BaseTest {
@Test(groups={"SmokeTest","RegressionTest"})
	public  void CreateContactwithOrgnisationTest() throws Throwable {

	
		WebdriverUtil util=new WebdriverUtil(driver);
				HomePage hp=new HomePage(driver);

		hp.getContactlink().click();
		
		ContactPage cp= new ContactPage(driver);
		cp.getCreatecontactpage().click();

		CreateContactPage ccp=new CreateContactPage(driver);
		ccp.createcontactpage();
		ccp.getSavebtn().click();
		

		String organame=JavaUtil.objForJavaUtil().getFirstName()+JavaUtil.objForJavaUtil().generateRandomNumber();

		cp.getSearchtxt().sendKeys(organame);
		driver.findElement(By.name("search")).click();
		
		util.close();
		driver.findElement(By.name("button")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		driver.findElement(By.name("search_text")).sendKeys(organame);
		util.refreshPage();


		//signout
		hp.logOutfromApp();
		


	}

@Test(groups="RegressionTest")

public void contactCreation() {
	WebdriverUtil util=new WebdriverUtil(driver);
	HomePage hp=new HomePage(driver);

hp.getContactlink().click();

ContactPage cp= new ContactPage(driver);
cp.getCreatecontactpage().click();

CreateContactPage ccp=new CreateContactPage(driver);
ccp.createcontactpage();
ccp.getSavebtn().click();

}
}
	







