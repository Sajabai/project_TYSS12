package com.sdet2.practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableICC2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		String Countryname ="India";
		List<WebElement>teamname=driver.findElements(By.xpath("//tr[*]/td/span[@class='u-hide-phablet']"));
		System.out.println(" CLASS  Elements size " + teamname.size());

		for(int i=1;i<teamname.size();i++) {
			
			System.out.println(teamname.get(i).getText());
			if(teamname.get(i).getText().equalsIgnoreCase(Countryname)) {
				
				
				
				      WebElement teampoints=findElement(By.xpath("//td[text()='"+teamname+"']/../td[4]"));
				System.out.println(teampoints.getText());
				
			}
		}
		
		
		
		
	}

	private static WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

}
