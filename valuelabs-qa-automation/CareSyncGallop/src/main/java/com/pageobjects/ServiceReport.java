package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class ServiceReport {

	WebDriver driver;
	ActionKeywords performAction;

	public ServiceReport(WebDriver driver) {
		this.driver = driver;
	}

	By CS_Servicereport = By.id("org-muReport");
	By providerDropdown = By.id("provider_dropdown");
	By PatientsCount = By.id("mur_qualified_patients_count");
	By RunReport = By.id("mur_run_report_btn");

	public void service_Report() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.click(CS_Servicereport, "Clicked on Service report");
			performAction.select(providerDropdown, 3, "Selected providers dropdown");
			performAction.clear(PatientsCount, "Cleared patient count");
			performAction.enter(PatientsCount, CommonMethods.randominteger(90, 10), "Entered patients count");
		} catch (Exception e) {
			throw new RuntimeException("service_Report exception");

		}
	}
}
