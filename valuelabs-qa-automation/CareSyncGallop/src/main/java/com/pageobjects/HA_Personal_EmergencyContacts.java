package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;
import com.utility.ExcelReadandWritedata;

public class HA_Personal_EmergencyContacts {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public HA_Personal_EmergencyContacts(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for Emergency contacts
	 * 
	 */
	By EmergencyContacts = By.xpath("//a[contains(text(),'Emergency Contacts')]");
	By Emergencycontactfirstname = By.xpath("(//input[@name='contactFirstName[]'])[1]");
	By EmergencycontactLastname = By.xpath("//input[@name='contactLastName[]']");
	By EmergencyRelationship = By.xpath("(//select[@name='contactRelationshipToMember[]'])[1]");
	By EmergencycontactCellPhone = By.xpath("(//input[@name='contactMobilePhoneNumber[]'])[1]");
	By Emergencycontacthomephone = By.xpath("(//input[@name='contactHomePhoneNumber[]'])[1]");
	By Emergencycontactworkphone = By.xpath("(//input[@name='contactWorkPhoneNumber[]'])[1]");
	By EmergencyContactemail = By.xpath("(//input[@name='contactEmail[]'])[1]");
	By EmergencyContactAddButton = By.xpath("//*[contains(text(),'Add')]");
	By SavedEmergencycontact = By.xpath("//*[@id='emergencyContactList']/div");
	By EmergencyContactTrashIcon = By.xpath("//*[@id='emergencyContactList']/div/img");
	By Confirmationpopup = By.xpath("//button[@id='confirm_button_no']");
	By Savebutton = By.xpath("//input[@id='btnSave']");

	/**
	 * @param uname
	 * @param pasword
	 */
	public void HealthassistantPersonal_EmergencyContacts() {
		try {
			performAction = new ActionKeywords(driver);
			System.out.println("Emergency conatct'");
			CommonMethods.pageload(driver);
			performAction.clickandwait(EmergencyContacts, "Emergency contacts is clicked");
			performAction.clear(Emergencycontactfirstname, "Clearing the Emergencycontactfirstname");
			performAction.enterandwait(Emergencycontactfirstname, ExcelReadandWritedata.Readcell(32, 0),
					"enterandwaiting the Emergencycontactfirstname");
			performAction.clear(EmergencycontactLastname, "Clearing the EmergencycontactLastname");
			performAction.enterandwait(EmergencycontactLastname, ExcelReadandWritedata.Readcell(33, 0),
					"enterandwaiting the EmergencycontactLastname");
			performAction.select(EmergencyRelationship, "Father", "Selecting the EmergencyRelationship");
			performAction.clear(EmergencycontactCellPhone, "clearing the EmergencycontactCellPhone");
			performAction.enterandwait(EmergencycontactCellPhone, ExcelReadandWritedata.Readcell(34, 0),
					"enterandwaiting the EmergencycontactCellPhone");
			performAction.clear(Emergencycontactworkphone, "Clearing the Emergencycontactworkphone");
			performAction.enterandwait(Emergencycontactworkphone, ExcelReadandWritedata.Readcell(35, 0),
					"enterandwaiting the Emergencycontactworkphone");
			performAction.clear(Emergencycontacthomephone, "Clearing the Emergencycontacthomephone");
			performAction.enterandwait(Emergencycontacthomephone, ExcelReadandWritedata.Readcell(36, 0),
					"enterandwaiting the Emergencycontacthomephone");
			performAction.clear(EmergencyContactemail, "Clearing the EmergencyContactemail");
			performAction.enterandwait(EmergencyContactemail, ExcelReadandWritedata.Readcell(37, 0),
					"enterandwaiting the EmergencyContactemail");
			CommonMethods.pageload(driver);
			performAction.browserScroll(500, "window is scroll down");
			performAction.clickandwait(Savebutton, "Emergency contacts is saved");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("exception in HealthassistantPersonal_EmergencyContacts");
		}
	}

	public void EmergencyContacts_Delete() {
		try {
			performAction.clickandwait(SavedEmergencycontact, "1st emergency contact is clicked");
			performAction.click(EmergencyContactTrashIcon, "EmergencyContactTrashIcon is clicked");
			CommonMethods.pageload(driver);
			performAction.mouseOver(Confirmationpopup, "Mouse over on Confirmationpopup");
			performAction.clickandwait(Confirmationpopup, "Pop up is handleled");
			performAction.clickandwait(SavedEmergencycontact, "1st emergency contact is clicked");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("exception in EmergencyContacts_Delete");
		}
	}

}
