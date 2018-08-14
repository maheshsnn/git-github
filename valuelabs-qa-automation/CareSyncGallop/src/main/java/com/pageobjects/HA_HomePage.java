package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;

public class HA_HomePage {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public HA_HomePage(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for LoginScreen
	 * @Function for Login
	 */
	By HAimage = By.xpath("//img[@title='Member ID: 18715']");
	By PersonalTab = By.xpath("//a[@class='menu-link menu-link-personal font_bold']");
	By HealthInfotab = By.xpath("//a[@class='menu-link menu-link-health-profile font_bold']");
	By Caremanagertab = By.xpath("//a[@class='menu-link menu-link-care-manager font_bold']");

	/**
	 * @param uname
	 * @param pasword
	 */
	public void memberimage() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(HAimage, "cliked on HA member image");
		} catch (Exception e) {
			throw new RuntimeException("exception in memberimage");
		}
	}

	public void PersonalTab() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(PersonalTab, "cliked on HA member image");
		} catch (Exception e) {
			throw new RuntimeException("exception in PersonalTab");
		}
	}

	public void HealthInfotab() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(HealthInfotab, "cliked on HA member image");
		} catch (Exception e) {
			throw new RuntimeException("exception in HealthInfotab");
		}

	}

	public void Caremanagertab() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Caremanagertab, "cliked on HA member image");
		} catch (Exception e) {
			throw new RuntimeException("exception in Caremanagertab");
		}
	}
}
