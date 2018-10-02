package Page_factory_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Pob {

	final WebDriver driver;

	public Pob(WebDriver driver) {

		this.driver = driver;

	}

//cache lookup will first look into cahce if not found then it will look into pagesource
	@CacheLookup
	@FindBy(name = "email")
	WebElement username;

	@FindBy(how = How.NAME, using = "pass")
	WebElement password;

	public void Login() {
		username.sendKeys("maheshsnn");
		password.sendKeys("Hello2D4y#");
	}

}
