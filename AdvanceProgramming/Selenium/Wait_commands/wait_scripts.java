package Wait_commands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait_scripts {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		
		
		
		
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
		
		WebDriverWait wait=new WebDriverWait(driver,600);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
		
		Wait<WebDriver> waits=new FluentWait<WebDriver>(driver).withTimeout(200, TimeUnit.SECONDS).ignoring(Exception.class).pollingEvery(5, TimeUnit.SECONDS);
		
		
		
		
		
		
	}

}
