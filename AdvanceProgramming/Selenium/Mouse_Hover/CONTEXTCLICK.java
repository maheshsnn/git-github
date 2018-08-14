package Mouse_Hover;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CONTEXTCLICK {
	WebDriver d;
	@BeforeMethod
	public void meth1()
	{
		
		d=new FirefoxDriver();
		d.manage().window().maximize();
	}
	@AfterMethod
	public void meth2() 
	{
		d.quit();
		
	}
	@Test
	public void meth3() throws InterruptedException   
	{
		d.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		d.get("http://www.policybazaar.com/");	
		Actions a=new Actions(d);
		a.moveToElement(d.findElement(By.className("ins"))).click(d.findElement(By.linkText("Life Insurance"))).build().perform();
		Thread.sleep(5000);
		assertEquals("About Product",d.findElement(By.xpath("//html/body/section[1]/div[1]/section[2]/section[1]/div/h3")).getText());
		a.contextClick(d.findElement(By.xpath("//html/body/section[1]/div[1]/section[2]/section[1]/div/h3")));
		Thread.sleep(5000);
	}

}
