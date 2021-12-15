package com.Vtiger.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.genericUtil.FileUtil;

public class LoginPage //Rule 1
{
	WebDriver driver;

	@FindBy(name="user_name")//Rule 2
	private WebElement username;//Rule 3

	@FindBy(name="user_password")//Rule 2
	private WebElement password;//Rule 3


	@FindBy(id="submitButton")
	private WebElement submitbtn;


	public WebElement getUsername()//Rule 4
	{
		return username;
	}


	public LoginPage(WebDriver driver)//Rule 5
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void loginToApp() throws Throwable {
		username.sendKeys(FileUtil.objForFileUtil().readDataFromPropfile("username"));
		password.sendKeys(FileUtil.objForFileUtil().readDataFromPropfile("password"));
		submitbtn.click();
	}

	public void loginToApp(String newusername,String newpassword ) {
		username.sendKeys(newusername);
		password.sendKeys(newpassword);
		submitbtn.click();
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}


}
