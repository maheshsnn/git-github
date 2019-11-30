package Handling_Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Alerts {
	
	WebDriver d ;
	
	@BeforeClass
	public void bef()
	{
		System.setProperty("webdriver.chrome.driver","G:\\lib\\chromedriver.exe");
		d=new ChromeDriver();
		// d=new FirefoxDriver();
		 d.manage().window().maximize();
	}
	@Test
	public void tes() throws Exception
	{
		 d.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		 d.findElement(By.cssSelector("#usernameId")).sendKeys("maheshsnn");
		 //d.findElement(By.cssSelector("input[name='j_password']")).sendKeys("bijili");
		 d.findElement(By.cssSelector("#loginbutton")).click();
		 d.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
		 Thread.sleep(5000);
		 
		 Alert al=d.switchTo().alert();
		System.out.println(al.getText());
	//System.out.println(al);
		 al.accept();
		 
	}

}
