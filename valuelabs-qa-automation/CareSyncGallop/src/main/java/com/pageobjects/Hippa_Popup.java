package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class Hippa_Popup {

	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public Hippa_Popup(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for LoginScreen
	 * @Function for Login
	 */
	By HippaCertificate = By.xpath("//button[@class='bw_button js-close']");

	/**
	 * @param uname
	 * @param pasword
	 */
	public void hippacert() {
		try {

			performAction = new ActionKeywords(driver);
			CommonMethods.pageload(driver);
			CommonMethods.pageload(driver);
			performAction.clickandwait(HippaCertificate, "HippaCertificate pop up is handeled");

		} catch (Exception e) {
			throw new RuntimeException("exception at Hippa_Popup");
		}

	}

}