package Environment_parameterisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Parameters {

	WebDriver driver;
	


	@org.testng.annotations.Parameters({ "browser", "Env" })
	@BeforeClass
	public void beforeeveryclass(String browser, String Env) {

		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "G:\\lib\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:\\lib\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("Webdriver.edge.driver", "G:\\lib\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);

		
			
		if (Env.equalsIgnoreCase("Prod")) {
			System.out.println("pass");
			driver.get("https://www.facebook.com");
		} 
		else if (Env.equalsIgnoreCase("QA")) {
			System.out.println("pass2");
			driver.get("https://www.gmail.com");
		}

	}

	

	@AfterClass
	public void tearup() {
		driver.close();
	}

}
