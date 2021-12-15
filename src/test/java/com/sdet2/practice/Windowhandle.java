package com.sdet2.practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();


		Set<String> allwhs=driver.getWindowHandles();

		for(String a:allwhs) 
		{

			String title=driver.switchTo().window(a).getTitle();
			System.out.println(title);


			if(title.equalsIgnoreCase("Cognizant"))
			{
				break;				

			}
		}
	}}
	










