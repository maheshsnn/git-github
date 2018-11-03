
package com.base;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.utility.Propertiesfile;
import com.utility.ReadMandatoryFields;

public class ManageBrowser {
	public static ExtentReports reports;
	public static ExtentTest logger;
	public static Propertiesfile pro;
	public static ReadMandatoryFields rd;
	
	WebDriver driver;

	/**
	 * @browser Initialisaiton
	 * @param browser
	 * @return
	 * @throws Exception
	 */
	public WebDriver getdriver(String browser) throws Exception {
		System.out.println("Before method executing");
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", pro.geckodriver());
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", pro.chrome());
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("Webdriver.ie.driver", pro.IE());
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
		driver.get("https://csdev.caresync.com/login");
		return driver;
	}

	/**
	 * 
	 * @throws Exception
	 */
	@BeforeSuite
	public void setup() throws Exception {
		/*pro = new Propertiesfile();
		reports = new ExtentReports(pro.ExtentPath());
		rd = new ReadMandatoryFields();
		rd.getFields();
		System.out.println("Before Suite Executed");*/
		
		new SimpleDateFormat("ddMMyyyyHHmmss");
		new Date();
		
		pro = new Propertiesfile();
		String path = System.getProperty("user.dir")+System.getProperty("file.separator")+pro.ExtentPath();
		System.out.println("report path : "+ path);
		reports = new ExtentReports(path);
		rd = new ReadMandatoryFields();
		rd.getFields();
		System.out.println("Before Suite Executed");
	}

	/**
	 * 
	 */
	@AfterSuite
	public void tearup() {

		reports.flush();
		System.out.println("After suite executed");
	}
}
