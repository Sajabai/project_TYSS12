package com.Vtiger.TC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Vtiger.POMclasses.HomePage;
import com.Vtiger.POMclasses.OrgInfoPage;
import com.Vtiger.genericUtil.BaseTest;
import com.Vtiger.genericUtil.JavaUtil;
import com.Vtiger.genericUtil.WebdriverUtil;
@Listeners(com.Vtiger.genericUtil.ListenersImplementation.class)
public class TC001_CreateOrganisationTest extends BaseTest
{
	
@Test(groups={"SmokeTest","RegressionTest"},retryAnalyzer = com.Vtiger.genericUtil.RetryAnalyzer.class)
public void CreateOrganisationTest() throws InterruptedException {

		 HomePage hp=new HomePage(driver);
		 hp.getOrglink().click();
		 
		 WebdriverUtil util=new WebdriverUtil(driver);
		 
		 OrgInfoPage op=new OrgInfoPage(driver);
		 op.getCreateorgimg().click();
		 
		

		String organame=JavaUtil.objForJavaUtil().getFirstName()+JavaUtil.objForJavaUtil().generateRandomNumber();
		driver.findElement(By.name("accountname")).sendKeys(organame);

		//save org
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		util.refreshPage();

		hp.getOrglink().click();

		//validating
		op.searchforog(organame, "Organization Name");
		
		
        //util.selectvalueFromDD(ExcelUtil.objforExcelUtil().readDatafromExcel("Sheet1", 2, 0),dd);
	
		
		Thread.sleep(3000);
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
}

        //util.refreshPage();
		//Sign Out
@Test(groups="SmokeTest",retryAnalyzer = com.Vtiger.genericUtil.RetryAnalyzer.class)
public void createOrganisationwithPhonenumber() throws InterruptedException {


	 HomePage hp=new HomePage(driver);
	 hp.getOrglink().click();
	 
	 WebdriverUtil util=new WebdriverUtil(driver);
	 
	 OrgInfoPage op=new OrgInfoPage(driver);
	 op.getCreateorgimg().click();
	 
	

	String organame=JavaUtil.objForJavaUtil().getFirstName()+JavaUtil.objForJavaUtil().generateRandomNumber();
	driver.findElement(By.name("accountname")).sendKeys(organame);
	
	op.createPhoneNumber();
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	util.refreshPage();

	hp.getOrglink().click();

	//validating
	op.searchforog(organame, "Organization Name");
	
	
    //util.selectvalueFromDD(ExcelUtil.objforExcelUtil().readDatafromExcel("Sheet1", 2, 0),dd);

	
	Thread.sleep(3000);
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










