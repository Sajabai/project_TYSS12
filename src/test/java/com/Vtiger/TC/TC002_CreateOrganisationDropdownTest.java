package com.Vtiger.TC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Vtiger.POMclasses.CreateContactPage;
import com.Vtiger.POMclasses.CreateOrgPage;
import com.Vtiger.POMclasses.HomePage;
import com.Vtiger.POMclasses.LoginPage;
import com.Vtiger.POMclasses.OrgInfoPage;
import com.Vtiger.genericUtil.BaseTest;
import com.Vtiger.genericUtil.FileUtil;
import com.Vtiger.genericUtil.JavaUtil;
import com.Vtiger.genericUtil.WebdriverUtil;

public class TC002_CreateOrganisationDropdownTest extends BaseTest {
@Test(groups={"SmokeTesting","RegressionTest"})
	public void CreateOrganisationDropdownTest() throws Throwable {
	 WebdriverUtil util=new WebdriverUtil(driver);


		HomePage hp=new HomePage(driver);
		hp.getOrglink().click();

		OrgInfoPage op=new OrgInfoPage(driver);
		op.getCreateorgimg().click();
		

		String organame=JavaUtil.objForJavaUtil().getFirstName()+JavaUtil.objForJavaUtil().generateRandomNumber();
		CreateOrgPage opage= new CreateOrgPage(driver);
		opage.getCreateorgname().sendKeys(organame);
		opage.createOrg();
        util.refreshPage();

		hp.getOrglink().click();
		op.searchforog(organame, "Organization Name");
       
       
	 WebElement value=driver.findElement(By.xpath("//a[@title='Organizations' and text()='"+organame+"']"));
	  System.out.println(value.isDisplayed());



	if(value.getText().equalsIgnoreCase(organame))
	{
		System.out.println(true);
	}
	else
	{

		System.out.println(false);
	}
		

		util.close();















	}
}


