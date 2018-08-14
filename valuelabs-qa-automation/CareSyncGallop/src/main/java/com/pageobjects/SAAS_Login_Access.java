package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;

public class SAAS_Login_Access {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param SaaS_Login
	 *            access page
	 */
	public SAAS_Login_Access(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for LoginScreen
	 * @Function for Login
	 */
	By checkbox = By.xpath("(//div[@class='checkbox  '])[2]");
	By Temporaryloginlink = By.xpath("//span[contains(text(),'Need a temporary login? Click here')]");
	By Save = By.xpath("//*[@id='save']");

	/**
	 * @param Loginaccess_Temporary
	 * @throws Exception
	 */
	public void LoginAccess_Page() throws Exception {
		try {

			performAction = new ActionKeywords(driver);
			performAction.clickandwait(checkbox, "Checkbox is clicked");
			performAction.clickandwait(Temporaryloginlink, "Temporary login link is clicked");
			performAction.clickandwait(Save, "Save button is clicked");

		} catch (Exception e) {
			throw new RuntimeException("LoginAccess_Page exception");
		}

	}

}
