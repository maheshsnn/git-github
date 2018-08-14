package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class CSRlogin_Caregiver {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public CSRlogin_Caregiver(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for LoginScreen
	 * @Function for Login
	 */
	By CaregiverAddbutton = By.xpath("//a[@id='add_caregiver']");
	By Caregiverfirstname = By.xpath("//input[@id='firstName']");
	By Caregiverlastname = By.xpath("//input[@id='lastName']");
	By Caregiverrelationship = By.xpath("//select[@id='relationship']");
	By Caregiverusermail = By.xpath("//input[@id='newUserEmail']");
	By Caregivernext1 = By.xpath("//input[@id='btnSaveNext']");
	By CaregiverNext2 = By.xpath("//input[@id='btnShowAuth']");
	By AuthorizationCheckbox = By.xpath("//div[@class='checkbox']");
	By CaregiverAuthorizationsave = By.xpath("//button[@class='js-savePermsAuthorized bw_button']");
	By CaregiverAuthorizationacceptance = By.xpath("//button[@value='0']");

	/**
	 * @param uname
	 * @param pasword
	 * @throws Exception
	 */
	public void CSR_careGiver() throws Exception {
		try {

			performAction = new ActionKeywords(driver);
			performAction.wait(3000, "Wait time is added");
			performAction.clickandwait(CaregiverAddbutton, "CareGiver Add button");
			performAction.enterandwait(Caregiverfirstname, CommonMethods.randaomstring(10), "First name is entered");
			performAction.enterandwait(Caregiverlastname, CommonMethods.randaomstring(10), "Last name is entered");
			performAction.selectandwait(Caregiverrelationship, "Son", "Relationship is entered");
			performAction.enterandwait(Caregiverusermail,
					"mahesh.bethi09+" + CommonMethods.randaomstring(10) + "@gmail.com", "Mail id is entered");
			performAction.clickandwait(Caregivernext1, "Next button is clicked");
			performAction.browserScroll(1500, "Window is scrolled down");
			performAction.clickandwait(CaregiverNext2, "Next button is clicked");
			performAction.browserScroll(2000, "Window is scrolled down");
			performAction.clickandwait(AuthorizationCheckbox, "Checkbox is clicked");
			performAction.clickandwait(CaregiverAuthorizationsave, "Save button is clicked");
			performAction.clickandwait(CaregiverAuthorizationacceptance, "Caregiver acceptance is handeled");
		} catch (Exception e) {
			throw new RuntimeException("Exception at CSR_careGiver");
		}

	}

}