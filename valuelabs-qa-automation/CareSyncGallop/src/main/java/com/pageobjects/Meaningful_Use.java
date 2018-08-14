package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class Meaningful_Use {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public Meaningful_Use(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for Meaningful_use
	 */
	By Meaningful_Use = By.xpath("//button[contains(text(),'Meaningful Use')]");
	By Meaningful_providerlist = By.xpath("//select[@id='provider_dropdown']");
	By Startdate = By.xpath("//input[@id='mur_start_date']");
	By Enddate = By.xpath("//input[@id='mur_end_date']");
	By CountOfPatients = By.xpath("//input[@id='mur_qualified_patients_count']");
	By Runreport = By.xpath("//input[@id='mur_run_report_btn']");

	/**
	 * @param Meaningful
	 *            use report
	 * @throws Exception
	 */

	public void Meaningful_Use_Report() throws Exception {
		try {

			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Meaningful_Use, "Meaningful use button is clicked");
			performAction.select(Meaningful_providerlist, "Provider, SaaS", "Provider is selected");
			performAction.clear(Startdate, "Startdate is cleared");
			performAction.enterandwait(Startdate, "01/03/2018", "Startdate is entered");
			performAction.clear(Enddate, "Enddate is cleared");
			performAction.enterandwait(Enddate, "04/03/2018", "End date is entered");
			performAction.clear(CountOfPatients, "Count of patients is cleared");
			performAction.enterandwait(CountOfPatients, "4", "Countofpatients is entered");
			CommonMethods.pageload(driver);
			performAction.clickandwait(Runreport, "RunReport is clicked");
		} catch (Exception e) {
			throw new RuntimeException("Meaningful_Use_Report exception");
		}

	}

}
