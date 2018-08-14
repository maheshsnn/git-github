package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.base.ActionKeywords;

public class Back_Button {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public Back_Button(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for view and share
	 */
	By Backbutton = By.xpath("//input[@id='backToPage']");

	/**
	 * @param view
	 *            and share is clicked
	 * @throws Exception
	 */
	public void backbtn() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Backbutton, "Backbutton is clicked");
		} catch (Exception e) {
			System.out.println("Exception at backnutton");
			throw new RuntimeException("enrollMember_Without_Email exception");
		}
	}
}
