package com.Vtiger.genericUtil;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Vtiger.POMclasses.HomePage;
import com.Vtiger.POMclasses.LoginPage;

public class BaseTest {
	 public  WebDriver driver;
	 public static  WebDriver sdriver;
	 
	 
	 @BeforeSuite(groups={"SmokeTest","RegressionTest"})
	 public void setUp() {
		 System.out.println("Connect to DB");
	 }
	 
     @BeforeClass(groups={"SmokeTest","RegressionTest"})
     public void lauchBrowser_URL() throws Throwable {
 		FileUtil prop=FileUtil.objForFileUtil();
 		String browser=prop.readDataFromPropfile("browser");

 		if(browser.equalsIgnoreCase("Chrome")) 
 		{
 			driver=new ChromeDriver();
 		}
 		else if(browser.equalsIgnoreCase("firefox"))
 		{
 			driver=new FirefoxDriver();
 		}
 		else if(browser.equalsIgnoreCase("Safari")) {
 			driver=new SafariDriver();
 		}


 		//get url
 		driver.get(prop.readDataFromPropfile("url"));

 		//maximize and wait
 		 WebdriverUtil util=new WebdriverUtil(driver);
 		 util.maximizeWindow();
 		 util.pageLoadTime();
 		 sdriver=driver;
 		 
 		 
     }
     
     @BeforeMethod(groups={"SmokeTest","RegressionTest"})
     public void loginToApp() throws Throwable {
    	 
    	 LoginPage pg=new LoginPage(driver);
		 pg.loginToApp();

     }
      @AfterMethod(groups={"SmokeTest","RegressionTest"})
      public void signoutApp() {
    	  HomePage hp=new HomePage(driver);
    		hp.getLogoutimg();
    		hp.getSignoutlink();
      }
      
      @AfterSuite(groups={"SmokeTest","RegressionTest"})
      public void closetheApp() throws InterruptedException {
         Thread.sleep(3000);
         WebdriverUtil util=new WebdriverUtil(driver);
  		 util.close();
      }
      
      public static void takescreenshot(String name) throws IOException {
    	  File srcfile=((TakesScreenshot)sdriver).getScreenshotAs(OutputType.FILE);
    	  String destfile=System.getProperty("user.dir")+"/Screenshots/"+name+".png";
    	  File finaldest=new File(destfile);
    	  FileUtils.copyFile(srcfile, finaldest);
      }

    	  
    	  
   
}

