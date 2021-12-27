package com.sdet2.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInVtiger {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://localhost:8888/");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("12345");
		driver.findElement(By.id("submitButton")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElements(null)
		         
		driver.findElement(By.xpath("//a[text()='SUDHA12']/parent::td/parent::tr/td/input")).click();
		
		
		
		driver.findElement(By.xpath("//input[@name='selectall']")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		driver.close();
		
		
		
	}

}
