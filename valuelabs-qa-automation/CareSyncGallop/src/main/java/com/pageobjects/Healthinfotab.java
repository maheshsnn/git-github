package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class Healthinfotab {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public Healthinfotab(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for LoginScreen
	 * @Function for Login
	 */
	By healthinfotab = By.xpath("//a[contains(text(),'Health Info')]");
	By Summary = By.xpath("//a[contains(text(),'Summary')]");
	By Providers = By.xpath("//a[contains(text(),'Providers')]");
	By HealthConditions = By.xpath("//a[contains(text(),'Health Conditions')]");
	By Medications = By.xpath("//a[contains(text(),'Medications')]");
	By Allergies = By.xpath("//a[contains(text(),'Allergies')]");
	By Measurements = By.xpath("//a[contains(text(),'Measurements')]");
	By Documents = By.xpath("//a[contains(text(),'Documents')]");

	/**
	 * @param uname
	 * @param pasword
	 */
	public void Healthinfo() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(healthinfotab, "healthinfotab is clicked");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("exception at Healthinfotab");
		}

	}

	public void Summary() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Summary, "Summary is clicked");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("exception at Healthinfotab");
		}

	}

	public void Providers() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Providers, "Providers is clicked");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("exception at Healthinfotab");
		}

	}

	public void HealthConditions() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(HealthConditions, "HealthConditions is clicked");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("exception at Healthinfotab");
		}

	}

	public void Medications() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Medications, "Medications is clicked");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("exception at Medications");
		}

	}

	public void Allergies() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Allergies, "Allergies is clicked");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("exception at Allergies");
		}

	}

	public void Measurements() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Measurements, "Measurements is clicked");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("exception at Measurements");
		}

	}

	public void Documents() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Documents, "Medications is clicked");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("exception at Documents");
		}

	}
}