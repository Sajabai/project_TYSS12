package com.Vtiger.TC;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Vtiger.POMclasses.ContactPage;
import com.Vtiger.POMclasses.CreateContactPage;
import com.Vtiger.POMclasses.HomePage;
import com.Vtiger.genericUtil.BaseTest;
import com.Vtiger.genericUtil.JavaUtil;
import com.Vtiger.genericUtil.WebdriverUtil;



public class TC003_CreateContactwithOrgnisationTest extends BaseTest {
@Test(groups="SmokeTest")
	public  void CreateContactwithOrgnisationTest() throws Throwable {

	
		WebdriverUtil util=new WebdriverUtil(driver);
				HomePage hp=new HomePage(driver);

		hp.getContactlink().click();
		
		ContactPage cp= new ContactPage(driver);
		cp.getCreatecontactpage().click();

		CreateContactPage ccp=new CreateContactPage(driver);
		ccp.createcontactpage();
		ccp.getSavebtn().click();
		
		util.refreshPage();
		hp.getContactlink().click();

		String organame=JavaUtil.objForJavaUtil().getFirstName()+JavaUtil.objForJavaUtil().generateRandomNumber();

		cp.getSearchtxt().sendKeys(organame);
		Thread.sleep(2000);
		
		//cp.getClickserachNwbtn().click();
		//util.refreshPage();


		//signout
		


	}

@Test(groups="SmokeTest")

public void contactCreation() throws InterruptedException{
	WebdriverUtil util=new WebdriverUtil(driver);
	
	//navigate to contact
	HomePage hp=new HomePage(driver);

hp.getContactlink().click();

ContactPage cp= new ContactPage(driver);
cp.getCreatecontactpage().click();

CreateContactPage ccp=new CreateContactPage(driver);
ccp.createcontactpage();
ccp.getSavebtn().click();


}
}
	







