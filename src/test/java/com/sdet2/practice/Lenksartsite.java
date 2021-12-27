package com.sdet2.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lenksartsite {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.lenskart.com/");
		Actions ac= new Actions(driver);
		//WebElement e1=
				driver.findElement(By.xpath("//input[@name='q']")).click();
			List<WebElement> suggestions=driver.findElements(By.xpath("//ul[@class='trending_list menu-link']/li[*]"));
			System.out.println(" CLASS  Elements size " + suggestions.size());

			for(int i=0;i<=suggestions.size()+2;i++) {
				
				System.out.println(suggestions.get(i).getText());
			}
			


			//for (WebElement option : suggestions) {


			//if("Str".equals(option.getText())){
			   // option.click();  
			  // break();

			
		//ac.contextClick(e1);
		//String textname=driver.findElement(By.partialLinkText("lenkart")).getText();
		//System.out.println(textname);
		//List<WebElement> textfield=driver.findElements(By.partialLinkText("lenskart.com"));
		

		
		
		
	String nameofhiddentable =driver.findElement(By.xpath("//img[@title='Lenskart']")).getAttribute("title");
	System.out.println(nameofhiddentable);

	}


	}

