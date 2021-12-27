package com.sdet2.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By; 
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICCworldCup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		List<WebElement> countryname =driver.findElements(By.xpath("//tr[*/td[2][/span[@class=class='u-hide-phablet']"));
		
		for(int i=1;i<=countryname.size();i++) {
			
		}
	}

}
