package Auto_IT;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.steadystate.css.util.Output;

public class Auto_It {
	WebDriver d;
	
	@BeforeClass
	public void mahesh()
	{
		d=new FirefoxDriver();
		d.manage().window().maximize();
		
		//WebDriverWait wait=new WebDriverWait(d,100);
		//WebElement e=wait.until(ExpectedConditions.elementToBeClickable(d.findElement(By.id(""))));
		
	}
	
	@Test
	public void mah() throws Exception
	
	{
		d.get("http://www.gmail.co.in/");
	   // d.findElement(By.xpath("//a[contains(text(),'Sign In')]]")).click();	
	    d.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("maheshsnn");
	    d.findElement(By.xpath("//div[@id='identifierNext']/content/span")).click();
	    Thread.sleep(5000);
	    d.findElement(By.cssSelector("input[name='password']")).sendKeys("Hello2D4y#");
	    Thread.sleep(5000);
	    d.findElement(By.xpath("//div[2]/div/div/content/span")).click();
	    Thread.sleep(5000);
	    d.findElement(By.xpath("//div[2]/div/div/div/div[2]/div/div/div/div/div/div")).click();
	    Thread.sleep(5000);
	    d.findElement(By.xpath("//td[4]/div/div/div/div/div")).click();
	    //Thread.sleep(5000);
	    Process p=new ProcessBuilder("G:\\AUTOMATION WORKSPACE\\AUTOIT\\Upload.exe").start();
	
	}
		
	
	}
		





