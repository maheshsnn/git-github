package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.ExcelReadandWritedata;

public class HA_Personal_InsuranceInfo {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public HA_Personal_InsuranceInfo(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for Insuranceinfo
	 * @Function for Memberinsurance
	 */
	By PrimaryinsuranceName = By.xpath("//input[@id='personal_info_primaryInsuranceName']");
	By InsurancePayerID = By.xpath("//input[@id='personal_info_primaryInsurancePayerID']");
	By InsuranceSubscriberID = By.xpath("//input[@id='personal_info_primaryInsuranceID']");
	By PrimaryInsuranceCopay = By.xpath("//input[@id='personal_info_primaryInsuranceCopay']");
	By PrimaryInsuranceCoinsurance = By.xpath("//input[@id='personal_info_primaryInsuranceCoinsurance']");
	By primaryInsuranceDeductible = By.xpath("//input[@id='personal_info_primaryInsuranceDeductible']");

	/**
	 * @param uname
	 * @param pasword
	 */
	public void HealthAssistant_PrimaryInsurance() {
		try {
			performAction = new ActionKeywords(driver);
			System.out.println("primary insurence");
			performAction.browserScroll(800, "Browser scrolled ");
			performAction.clear(PrimaryinsuranceName, "Primary insurance name is cleared");
			performAction.wait(2000, "wait is added");
			performAction.enter(PrimaryinsuranceName, ExcelReadandWritedata.Readcell(14, 0),
					"Primary insurance is enterandwaited");
			performAction.clear(InsurancePayerID, "Clearing the InsurancePayerID");
			performAction.enter(InsurancePayerID, ExcelReadandWritedata.Readcell(15, 0),
					"enterandwaiting the InsurancePayerID");
			performAction.clear(InsuranceSubscriberID, "Clearing the InsuranceSubscriberID");
			performAction.enter(InsuranceSubscriberID, ExcelReadandWritedata.Readcell(16, 0),
					"enterandwaiting the InsuranceSubscriberID");
			performAction.clear(PrimaryInsuranceCopay, "Clearing the PrimaryinsuranceCopay");
			performAction.enter(PrimaryInsuranceCopay, ExcelReadandWritedata.Readcell(17, 0),
					"enterandwaiting the PrimaryInsuranceCopay");
			performAction.clear(PrimaryInsuranceCoinsurance, "Clearing the PrimaryInsuranceCoinsurance");
			performAction.enter(PrimaryInsuranceCoinsurance, ExcelReadandWritedata.Readcell(18, 0),
					"enterandwaiting the PrimaryInsuranceCoinsurance");
			performAction.clear(primaryInsuranceDeductible, "Clearing the primaryInsuranceDeductible");
			performAction.enter(primaryInsuranceDeductible, ExcelReadandWritedata.Readcell(19, 0),
					"enterandwaiting the primaryInsuranceDeductible");

		} catch (Exception e) {
			throw new RuntimeException("exception in HealthAssistant_PrimaryInsurance");
		}
	}

}
