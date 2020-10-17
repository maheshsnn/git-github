package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.ManageBrowser;
import PageObjects.Login;

public class Second_Testas{
	
	 WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","URL"})
	public void setup(String browser,String URL) throws Exception
	{
		driver=ManageBrowser.browserInstances(browser).getdriver();
		driver.get(URL);
	}
	
	@Test
	public void nu() throws Exception
	{
		System.out.println("*************");
		Login.Loginto(driver);
	}
	

	@AfterClass
	public void mm(ITestResult result)
	{
		driver.close();
	}

}
