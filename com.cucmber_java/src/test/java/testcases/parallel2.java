package testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;

public class parallel2 {
	

	WebDriver driver;
	

	

	@Given("^Open faced$")
	public void open_faced() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("print");
	    System.setProperty("webdriver.chrome.driver", "G:\\Photon_Automation\\lib\\chromedriver.exe");
		
		 driver= new ChromeDriver();
		 
		 driver.get("https://www.facebook.com");
	}

}
