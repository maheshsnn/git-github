package Css_Locators;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.Test;

	public class CSS_Locators

	{
		
		WebDriver d;
	@Test
	public void mahesh()
	{
		d=new FirefoxDriver();
		d.get("https://www.facebook.com");
		d.findElement(By.cssSelector("#email")).sendKeys("maheshsnn");//css=#value
		d.findElement(By.cssSelector("input#pass")).sendKeys("Hello2D4y#");//css=tagname#value
		d.findElement(By.cssSelector("input[id='u_0_2']")).click();//css=tagname[attribute='value']
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		d.findElement(By.cssSelector("a[class='_2s25']")).click();//css=tagname[attribute='value']
		//d.findElement(By.cssSelector("a._2s25")).click();//css=tagname.classvalue ex: a._2s25
		System.out.println("clicked on home button");
		
		
		}
	@AfterClass
	public void af()
	{
	d.close();	
	}
		

	}



