package com.Vtiger.POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Vtiger.genericUtil.ExcelUtil;
import com.Vtiger.genericUtil.JavaUtil;

public class CreateOrgPage {

	WebDriver driver;

	@FindBy(name="accountname")
	private WebElement createorgname;

	@FindBy(xpath="//img[@title='Select'])[1]")
	private WebElement addMemeber;

	@FindBy(name="industry")
	private WebElement selectindustry;

	@FindBy(name="rating")
	private WebElement selectrating;

	@FindBy(name="accounttype")
	private WebElement selecttype;
	
	

	
	public CreateOrgPage(WebDriver driver) 
	{ 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCreateorgname() {
		return createorgname;
	}

	public WebElement getAddMemeber() {
		return addMemeber;
	}

	public WebElement getSelectindustry() {
		return selectindustry;
	}

	public WebElement getSelectrating() {
		return selectrating;
	}

	public WebElement getSelecttype() {
		return selecttype;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public void createOrg() throws Throwable{
		selectindustry.sendKeys(ExcelUtil.objforExcelUtil().readDatafromExcel("Sheet1", 0, 1));
		selectrating.sendKeys(ExcelUtil.objforExcelUtil().readDatafromExcel("Sheet1", 0, 2));
		selecttype.sendKeys(ExcelUtil.objforExcelUtil().readDatafromExcel("Sheet1", 0, 3));
		saveBtn.click();
	}


}
