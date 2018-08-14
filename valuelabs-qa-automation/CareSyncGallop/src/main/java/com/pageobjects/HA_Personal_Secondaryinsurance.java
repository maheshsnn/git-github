package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.ExcelReadandWritedata;

public class HA_Personal_Secondaryinsurance {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public HA_Personal_Secondaryinsurance(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for HASecondaryinsurance
	 * @Function for Healthassistant Secondary insurence
	 */
	By secondaryinsuranceName = By.xpath("//input[@id='personal_info_secondaryInsuranceName']");
	By SecondaryInsurancePayerID = By.xpath("//input[@id='personal_info_secondaryInsurancePayerID']");
	By SecondaryInsuranceSubscriberID = By.xpath("//input[@id='personal_info_secondaryInsuranceID']");
	By SecondaryInsuranceCopay = By.xpath("//input[@id='personal_info_secondaryInsuranceCopay']");
	By SecondaryInsuranceCoinsurance = By.xpath("//input[@id='personal_info_secondaryInsuranceCoinsurance']");
	By secondaryInsuranceDeductible = By.xpath("//input[@id='personal_info_secondaryInsuranceDeductible']");
	By additionalInfo = By.xpath("//textarea[@id='personal_info_additionalInsuranceInfo']");

	/**
	 * @param
	 * @param
	 */
	public void HealthAssistant_Secondaryinsurance() {
		try {
			performAction = new ActionKeywords(driver);
			System.out.println("secondary insurence");
			performAction.clear(secondaryinsuranceName, "Clearing the secondary insurance name");
			performAction.enter(secondaryinsuranceName, ExcelReadandWritedata.Readcell(20, 0),
					"enterandwaiting the secondaryinsuranceName");
			performAction.clear(SecondaryInsurancePayerID, "Clearing the SecondaryInsurancePayerID");
			performAction.enter(SecondaryInsurancePayerID, ExcelReadandWritedata.Readcell(21, 0),
					"enterandwaiting the SecondaryInsurancePayerID");
			performAction.clear(SecondaryInsuranceSubscriberID, "Clearing the SecondaryInsuranceSubscriberID");
			performAction.enter(SecondaryInsuranceSubscriberID, ExcelReadandWritedata.Readcell(22, 0),
					"Clearing the SecondaryInsuranceSubscriberID");
			performAction.clear(SecondaryInsuranceCopay, "Clearing the SecondaryInsuranceCopay");
			performAction.enter(SecondaryInsuranceCopay, ExcelReadandWritedata.Readcell(23, 0),
					"enterandwaiting the SecondaryInsuranceCopay");
			performAction.clear(SecondaryInsuranceCoinsurance, "Clearing SecondaryInsuranceCoinsurance");
			performAction.enter(SecondaryInsuranceCoinsurance, ExcelReadandWritedata.Readcell(24, 0),
					"enterandwaiting the SecondaryInsuranceCoinsurance");
			performAction.clear(secondaryInsuranceDeductible, "Clearing secondaryInsuranceDeductible");
			performAction.enter(secondaryInsuranceDeductible, ExcelReadandWritedata.Readcell(25, 0),
					"enterandwaiting secondaryInsuranceDeductible");
			performAction.clear(additionalInfo, "Clearing the additional info");
			performAction.enter(additionalInfo, ExcelReadandWritedata.Readcell(26, 0),
					"enterandwaiting the additional info");
			performAction.clear(additionalInfo, "Clearing the additional info");
			performAction.enter(additionalInfo, ExcelReadandWritedata.Readcell(26, 0),
					"enterandwaiting the additional info");
		} catch (Exception e) {
			throw new RuntimeException("exception in HealthAssistant_Secondaryinsurance");
		}
	}
}