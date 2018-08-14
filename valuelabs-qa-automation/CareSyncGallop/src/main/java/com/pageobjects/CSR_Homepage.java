package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class CSR_Homepage {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public CSR_Homepage(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for CSR homepage
	 */
	By Searchmembers = By.xpath("//button[@id='search-members']");
	By ServicesReport = By.xpath("//button[@id='ccm_report']");
	By CSREnrollSourcelist = By.xpath("//select[@id='enrollment_list']");
	By Savebutton = By.xpath("//input[@id='btnSave']");
	By LoginInfoMailId = By.xpath("//input[@id='personal_info_login_username']");

	/**
	 * @param Searchmember
	 */
	public void Searchmember() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.browserScroll(500, "Window is scrolled");
			performAction.clickandwait(Searchmembers, "Search member is clicked");

		} catch (Exception e) {
			throw new RuntimeException("Exception at Searchmember");
		}

	}

	/**
	 * @param ServiceReport
	 */
	public void ServiceReport() {
		try {

			performAction = new ActionKeywords(driver);
			performAction.browserScroll(500, "Window is scrolled");
			performAction.clickandwait(ServicesReport, "ServicesReportis clicked");

		} catch (Exception e) {
			throw new RuntimeException("Exception at ServiceReport");
		}

	}

	public void CSR_enrollmentsourcelist() {
		try {

			performAction = new ActionKeywords(driver);
			performAction.browserScroll(2500, "Window is scrolled");
			performAction.wait(3000, "wait time added");
			performAction.clear(LoginInfoMailId, "mail id is cleared");
			performAction.enterandwait(LoginInfoMailId,
					"mahesh.bethi09+" + CommonMethods.randaomstring(15) + "@gmail.com",
					"enterandwaiting the LoginInfoMailId ");
			performAction.selectandwait(CSREnrollSourcelist, "Phone", "Sourcelist is selected");
			performAction.clickandwait(Savebutton, "Save button is clicked");
			performAction.wait(3000, "wait time added");
		} catch (Exception e) {
			throw new RuntimeException("Exception at CSR_enrollmentsourcelist");
		}

	}

}