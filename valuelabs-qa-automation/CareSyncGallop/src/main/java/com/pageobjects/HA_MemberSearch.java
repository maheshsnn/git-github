package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;

public class HA_MemberSearch {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public HA_MemberSearch(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for Healt_Assistant_member search
	 */
	By Firstname = By.xpath("//input[@id='search_first_name']");
	By Search = By.xpath("(//*[contains(text(),'Search')])[2]");
	By Image = By.xpath("//img[@title='Member ID: 19865']");

	/**
	 * @param Member
	 *            name
	 * @param search
	 *            button
	 */
	public void Membersearch() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.enterandwait(Firstname, "Micro", "Firstname is entered");
			performAction.clickandwait(Search, "Seach button is clicked");
		} catch (Exception e) {
			throw new RuntimeException("exception in Membersearch");
		}
	}

	public void Memberimage() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Image, "Image is clicked");
		} catch (Exception e) {
			throw new RuntimeException("exception in Memberimage");
		}
	}
}