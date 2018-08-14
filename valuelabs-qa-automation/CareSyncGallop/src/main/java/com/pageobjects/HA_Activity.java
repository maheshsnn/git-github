package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;

public class HA_Activity {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public HA_Activity(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for Activitytab
	 */
	By Activitytab = By.xpath("//a[contains(text(),'Activity')]");

	/**
	 * @param Activitytab
	 */
	public void Activity() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Activitytab, "cliked on Activitytab");
		} catch (Exception e) {
			throw new RuntimeException(" exception at Activity");
		}

	}

}