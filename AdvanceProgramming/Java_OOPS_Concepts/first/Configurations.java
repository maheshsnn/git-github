package first;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Configurations {
	 static WebDriver  d;
	 


	 public class secondclass {
	 	
	 	WebDriver d;
	 	@BeforeMethod()
	 	@Parameters("browser")
	 	public void mh(String browser)
	 	{
	 		if(browser.equalsIgnoreCase("ff"))
	 		{
	 			d=new FirefoxDriver();
	 		}
	 		else if(browser.equalsIgnoreCase("chrome"))
	 		{
	 			System.setProperty("webdriver.chrome.driver", "G:\\AUTOMATION WORKSPACE\\lib\\chromedriver.exe");
	 			 d=new ChromeDriver();
	 		}
	 			}
	 	
	 	@Test
	 	public void mm()
	 	{
	 			d.get("http://facebook.com");
	 		
	 	}

	 
	 }
	
//	Reporter report=new Reporter();
//	
//
//	@Test(priority=1)
//	public void m2()
//	{
//	report.log("this is for verifying three");
//	//d=new FirefoxDriver();
//	System.setProperty("webdriver.chrome.driver", "G:\\AUTOMATION WORKSPACE\\lib\\chromedriver.exe");
//	WebDriver d=new ChromeDriver();
//	d.get("http://google.com");
//
//Assert.assertEquals("Test", "Test123");
//	d.close();
//}
//
//	@Test(priority=2)
//	public void m() 
//	{
//	report.log("this is for verifying");
//	d.findElement(By.id("q")).sendKeys("selenium");
//		Assert.assertEquals("Test", "Test123");
//
//		
//	
//	
//	}
	
}