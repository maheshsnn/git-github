package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class SAAS_ServicesReport {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public SAAS_ServicesReport(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for Services Report
	 */
	By ServicesReport = By.xpath("//button[@id='ccm_report']");
	By ServicesProvider = By.xpath("//select[@id='ccm_provider_dropdown']");
	By ServiceReportrunbutton = By.xpath("//input[@id='search_btn']");
	By ReportOptions = By.xpath("(//span[@class='js-chevron chevron down'])");
	By ActiveCheckbutton = By.xpath("//div[@id='active']/div[1]");
	By ReportoptionsBillingstatusup = By.xpath("(//span[@class='js-chevron chevron'])");
	By CCMbillablecheckbox = By.xpath("//div[@id='ccm_billable']");
	By Billingstatusdropdown = By.xpath("(//span[@class='js-chevron chevron down'])[2]");
	By ShowdxToggle = By.xpath("//input[@value='Show Dx']");

	/**
	 * @param Services
	 *            report
	 */
	public void Servicesreport_button() {
		try {

			performAction = new ActionKeywords(driver);
			performAction.clickandwait(ServicesReport, "Services report is clicked");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("Servicesreport_button exception");
		}

	}

	/**
	 * @param Services
	 *            report function
	 * @throws Exception
	 */
	public void ServicesReport_Function() throws Exception {
		try {

			performAction = new ActionKeywords(driver);
			performAction.selectandwait(ServicesProvider, "Test, Provider", "Provider is selected");
			performAction.clickandwait(ServiceReportrunbutton, "ServiceReportrunbutton is clicked");
			performAction.clickandwait(ReportOptions, "ReportOptions is clicked");
			performAction.clickandwait(ActiveCheckbutton, "ActiveCheckbutton is clicked");
			performAction.clickandwait(ReportoptionsBillingstatusup, "ReportoptionsBillingstatusup is clicked");
			performAction.clickandwait(ServiceReportrunbutton, "ServiceReportrunbutton is clicked");
			performAction.clickandwait(ReportoptionsBillingstatusup, "ReportoptionsBillingstatusup is clicked");
			performAction.clickandwait(CCMbillablecheckbox, "CCMbillablecheckbox is clicked");
			performAction.clickandwait(Billingstatusdropdown, "Billingstatusdropdown is clicked");
			performAction.clickandwait(ServiceReportrunbutton, "ServiceReportrunbutton is clicked");
			performAction.clickandwait(ShowdxToggle, "Toggle is clicked");
			performAction.clickandwait(ServiceReportrunbutton, "ServiceReportrunbutton is clicked");
			CommonMethods.pageload(driver);

		} catch (Exception e) {
			throw new RuntimeException("enrollMember_Without_Email exception");
		}

	}

}