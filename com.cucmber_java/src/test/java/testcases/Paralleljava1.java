package testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;

public class Paralleljava1 {
	
	WebDriver driver;
	
	
	
	@Given("^Open anymail and launch url$")
	public void open_anymail_and_launch_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "G:\\Photon_Automation\\lib\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		 
		 driver.get("https://www.facebook.com");
		 driver.close();
	    System.out.println("parallel 1");
	}
	

	
	
}
