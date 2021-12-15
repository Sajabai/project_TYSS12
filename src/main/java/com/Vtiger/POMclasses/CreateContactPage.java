package com.Vtiger.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.genericUtil.JavaUtil;
import com.Vtiger.genericUtil.WebdriverUtil;

public class CreateContactPage {

	WebDriver driver;
	
	@FindBy(name="salutationtype")
	private WebElement salutationdd;
	
	@FindBy(name="firstname")
	private WebElement firstnametxt;
	
	@FindBy(name="lastname")
	private WebElement lastnametxt;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savebtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSalutationdd() {
		return salutationdd;
	}

	public WebElement getFirstnametxt() {
		return firstnametxt;
	}

	public WebElement getLastnametxt() {
		return lastnametxt;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public CreateContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createcontactpage(){
		WebdriverUtil util= new WebdriverUtil(driver);
        util.selectvalueFromDD(salutationdd,2);
        
       JavaUtil js=new JavaUtil();
       firstnametxt.sendKeys(js.getFirstName());
       lastnametxt.sendKeys(js.getLastName());
	}
      
       

}	
	

