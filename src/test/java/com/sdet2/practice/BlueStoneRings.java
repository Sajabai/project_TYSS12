package com.sdet2.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneRings {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.bluestone.com/");
		//driver.navigate().refresh();
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("Rings");
		driver.findElement(By.name("submit_search")).click();
		
	
		Actions ac= new Actions(driver);
		WebElement ele =driver.findElement(By.id("Price-form"));
		ac.moveToElement(ele).build().perform();
		
		
		driver.findElement(By.xpath("//span[@data-displayname='below rs 10000']")).click();
		
		String ele1=driver.findElement(By.id("page-title")).getText();
		System.out.println(ele1);
		
		By each1=By.className("link-overlay");
		List<WebElement> matchingelement =driver.findElements(each1);
		int howManyElements = matchingelement.size();
		System.out.println(howManyElements);
		//driver.close();
		
		



	}

}
