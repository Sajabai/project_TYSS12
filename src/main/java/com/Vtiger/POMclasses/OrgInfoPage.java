package com.Vtiger.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.genericUtil.JavaUtil;
import com.Vtiger.genericUtil.WebdriverUtil;

public class OrgInfoPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement createorgimg;

	
	@FindBy(name="search_text")
	private WebElement searchfororgtxtfield;
	
	@FindBy(id="bas_searchfield")
	private WebElement searchfrorgDD;
	
	@FindBy(name="submit")
	private WebElement searchNowbtn;
	
	@FindBy(id="phone")
	private WebElement phonenumber;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCreateorgimg() {
		return createorgimg;
	}

	public WebElement getSearchfororgtxtfield() {
		return searchfororgtxtfield;
	}

	public WebElement getSearchfrorgDD() {
		return searchfrorgDD;
	}

	public WebElement getSearchNowbtn() {
		return searchNowbtn;
	}
	public WebElement getPhonenumber() {
		return Phonenumber();
	}


	private WebElement Phonenumber() {
		// TODO Auto-generated method stub
		return null;
	}

	public OrgInfoPage(WebDriver driver) {
     this.driver=driver;
    PageFactory.initElements(driver, this);
}
	
	public void searchforog(String orgnamesearchfor,String text) {
		searchfororgtxtfield.sendKeys(orgnamesearchfor);
		WebdriverUtil util= new WebdriverUtil(driver);
		util.selectvalueFromDD(text,searchfrorgDD);
		searchNowbtn.click();
		
	}
	public void createPhoneNumber() {
		
		 getPhonenumber().sendKeys(JavaUtil.objForJavaUtil().PhoneNumber());
	}
	
	
	
	

}
