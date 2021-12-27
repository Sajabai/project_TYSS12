package com.Vtiger.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;

import com.Vtiger.genericUtil.WebdriverUtil;

public class HomePage  //Rule 1
{
	
	WebDriver driver;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutlink;
	
	
	 @FindBy(xpath="//a[text()='Organizations']")//Rule 2
	 private WebElement orglink;
	 
	 @FindBy(xpath="//a[text()='Contacts']")
	 private WebElement contactlink;
	 
	 @FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	 private WebElement logoutimg;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSignoutlink() {
		return signoutlink;
	}

	public WebElement getOrglink() {
		return orglink;
	}

	public WebElement getContactlink() {
		return contactlink;
	}

	public WebElement getLogoutimg() {
		return logoutimg;
	}

	public HomePage(WebDriver driver) {
     this.driver=driver;
     PageFactory.initElements(driver, this);

	}
	@AfterClass
	public void logOutfromApp() {
		WebdriverUtil webutil=new WebdriverUtil(driver);
		webutil.movetoElemnt(logoutimg);
		signoutlink.click();
}
	 
	 
	 

}
