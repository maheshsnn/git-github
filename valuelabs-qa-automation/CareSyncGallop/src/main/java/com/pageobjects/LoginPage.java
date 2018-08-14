package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class LoginPage {

	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for LoginScreen
	 * @Function for Login
	 */
	By username = By.id("_username");
	By password = By.id("_password");
	By signin = By.id("sign_in_button");

	/**
	 * @param uname
	 * @param pasword
	 * @throws Exception
	 */
	public void loginpage(String uname, String pasword) throws Exception {
		try {

			performAction = new ActionKeywords(driver);
			performAction.enter(username, uname, "Entering Username");
			performAction.enter(password, pasword, "Entering password");
			performAction.click(signin, "cliked on sign in");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("loginpage exception");
		}

	}

}
