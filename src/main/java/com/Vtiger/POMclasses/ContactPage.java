package com.Vtiger.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.genericUtil.WebdriverUtil;

public class ContactPage {
	
	
	WebDriver driver;
	
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createcontactpage;
	
	public ContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}


	@FindBy(name="search_text")
	private WebElement searchtxt;
	
	@FindBy(id="bas_searchfield")
	private WebElement dropdowncontact;
	
	
    @FindBy(name="button")
	private WebElement clickserachNwbtn;


	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getCreatecontactpage() {
		return createcontactpage;
	}


	public WebElement getSearchtxt() {
		return searchtxt;
	}


	public WebElement getDropdowncontact() {
		return dropdowncontact;
	}


	public WebElement getClickserachNwbtn() {
		return clickserachNwbtn;
	}
}
