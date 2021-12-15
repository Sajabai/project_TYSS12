package com.Vtiger.genericUtil;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtil {

	WebDriver driver;


	public WebdriverUtil(WebDriver driver) {
		this.driver=driver;

	}
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	public void close() {
		driver.close();
	}


	public void pageLoadTime() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	public void selectvalueFromDD(WebElement element,String value) {

		Select select=new Select(element);
		select.selectByValue(value);
	}

	public void selectvalueFromDD(WebElement element,int i) {
		Select select =new Select(element);
		select.selectByIndex(i);
	}
	public void selectvalueFromDD(String value,WebElement element) {
		Select select=new Select(element);
		select.selectByVisibleText(value);


	}
	public void movetoElemnt(WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	public void rightClick(WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element);

	}
	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}
public void switchToFrame(int index) {
	driver.switchTo().frame(index);
}

public void switchToFrame(WebElement element) {
	driver.switchTo().frame(element);
	
}
public void switchToFrame(String text) {
	driver.switchTo().frame(text);
}
public void scrollToElement(WebElement element) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scroll", element);

	}

	public void scrollby(int x,int y) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("+window.scrollBy( "+x+","+y+")");
	}

	public void offset(WebElement element,int x ,int y ) {
		Actions act=new Actions(driver);
		act.moveByOffset(x,y).click();
	}
		
		public void getTextAlert() {
			
			driver.switchTo().alert().getText();
		}
			
		public void refreshPage() {
			driver.navigate().refresh();
		}


	public void switchToWindow(String title,String id) {
		Set<String>allwhs=driver.getWindowHandles();
		for(String a:allwhs)
		{

			String currenttitle=driver.switchTo().window(a).getTitle();
			System.out.println(currenttitle);

			if(currenttitle.contains(title)) 
			{
				break;
			}

		}
	}
}

