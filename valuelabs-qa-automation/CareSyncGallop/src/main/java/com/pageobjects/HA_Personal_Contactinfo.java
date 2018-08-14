package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;
import com.utility.ExcelReadandWritedata;

public class HA_Personal_Contactinfo {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public HA_Personal_Contactinfo(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for Contact info for Health assistant. @
	 */
	By HealtAssistantContactInfo = By.xpath("//input[@id='personal_info_cspContactFullName']");
	By HealthAssistantPhonenumber = By.xpath("//input[@id='personal_info_cspContactPhoneNumber']");
	By HealthAssistantRelationship = By.xpath("//select[@id='personal_info_cspContactRelationship']");
	By HealthAssistantContactEmail = By.xpath("//input[@id='personal_info_cspContactEmail']");
	By HealthassistantNotes = By.xpath("//textarea[@id='personal_info_cspContactNotes']");
	By LoginInfoMailId = By.xpath("//input[@id='personal_info_login_username']");
	By Savebutton = By.xpath("//input[@id='btnSave']");
	By ViewandShare = By.xpath("//button[@id='view_share']");
	By Backbutton = By.xpath("//input[@id='backToPage']");

	/**
	 * @param for   HeatlhAssistant_ContactInfo
	 * 
	 */
	public void HeatlhAssistant_ContactInfo() {
		try {

			performAction = new ActionKeywords(driver);
			System.out.println("contact info");
			performAction.clear(HealtAssistantContactInfo, "Clearing the HealtAssistantContactInfo");
			performAction.enterandwait(HealtAssistantContactInfo, ExcelReadandWritedata.Readcell(27, 0),
					"enterandwaiting the HealtAssistantContactInfo");
			performAction.clear(HealthAssistantPhonenumber, "Clearing the HealthAssistantPhonenumber");
			performAction.enterandwait(HealthAssistantPhonenumber, ExcelReadandWritedata.Readcell(28, 0),
					"enterandwaiting the HealthAssistantPhonenumber");
			performAction.select(HealthAssistantRelationship, "Self", "Selecting HealthAssistantRelationship");
			performAction.clear(HealthAssistantContactEmail, "Clearing the HealthAssistantContactEmail");
			performAction.enterandwait(HealthAssistantContactEmail, ExcelReadandWritedata.Readcell(29, 0),
					"enterandwaiting the HealthAssistantContactEmail");
			performAction.clear(HealthassistantNotes, "Clearing the HealthassistantNotes");
			performAction.enterandwait(HealthassistantNotes, ExcelReadandWritedata.Readcell(30, 0),
					"enterandwaiting the HealthassistantNotes");
			performAction.clear(LoginInfoMailId, "Clearing the LoginInfoMailId");
			performAction.enterandwait(LoginInfoMailId, "mahesh.bethi09+"+CommonMethods.randaomstring(15)+"@gmail.com",
					"enterandwaiting the LoginInfoMailId ");
			performAction.browserScroll(400, "Scrolling the bar");
			performAction.click(Savebutton, "Saving the details");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("exception in HeatlhAssistant_ContactInfo");
		}
	}

}