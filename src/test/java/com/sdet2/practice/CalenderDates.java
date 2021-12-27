package com.sdet2.practice;

import java.time.Duration;
import java.util.Date;

import org.apache.commons.math3.geometry.spherical.oned.ArcsSet.Split;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class CalenderDates {

	public static void main(String[] args) throws InterruptedException {



		Date d1= new Date();
		String todayDate=d1.toString();
		System.out.println(todayDate);

		String[] arr=todayDate.split(" ");
		//Tue Dec 21 12:38:41 IST 2021

		String Day=arr[0];
		String Month=arr[1];
		String Date=arr[2];
		String Year=arr[5];
		String currentDate=Day+" "+Month+" "+Date+" "+Year;
		System.out.println(currentDate);






		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.makemytrip.com");



		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();

		Actions ac= new Actions(driver);
		ac.moveByOffset(10,10).click();


		driver.findElement(By.id("fromCity")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//div[text()='BOM']")).click();


		Thread.sleep(2000);		


		driver.findElement(By.id("toCity")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//div[text()='BOM']")).click();


		ac.moveByOffset(20,30).click();

		driver.findElement(By.xpath("//span[.='DEPARTURE')")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='"+currentDate+"']"));


		for(int i=0;i<11;i++) { try {
			driver.findElement(By.xpath("//div[@aria-label='Fri Dec 31 2021']")).click();
			break;
		}

		catch (Exception e) {
			driver.findElement(By.xpath("//div[@aria-label='Next month']")).click();
		} 

		}
	}}

