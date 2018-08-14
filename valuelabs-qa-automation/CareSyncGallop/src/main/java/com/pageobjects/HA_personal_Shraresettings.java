package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class HA_personal_Shraresettings {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public HA_personal_Shraresettings(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators Personal sharing settings
	 * @Function Personal sharing settings
	 */
	By personalinfotab = By.xpath("(//a[contains(text(),'Personal')])[1]");
	By SharingSettingstab = By.xpath("//a[contains(text(),'Sharing Settings')]");
	By Caregiver = By.xpath("//img[@class='care_giver_pic']");
	By CaregiverShareSettings = By.xpath("(//div[@class='sharing_link'])[2]");
	By ChangeAllToggleIcon = By.xpath("(//input[@class='on_off_toggle_button'])[1]");
	By HealthinfoSettingsbutton = By.xpath("(//img[@title='Click to customize settings for this information'])[1]");
	By CancelbuttonforsettingsCaregiver = By.xpath("//button[@id='left-button']");
	By Peronalsettingsbutton = By.xpath("(//img[@title='Click to customize settings for this information'])[2]");
	By PersonalDocumentsettingsbutton = By
			.xpath("(//img[@title='Click to customize settings for this information'])[3]");
	By ActivitySettingsbutton = By.xpath("(//img[@title='Click to customize settings for this information'])[4]");
	By ActivityAppointmentstoggle = By.xpath("//*[@id='connection_perms_dlg']/div[2]/ul/li[1]/div[1]/input");
	By ActivitySavebutton = By.xpath("//button[@id='right-button']");
	By ShareSettingsNextbutton = By.xpath("//button[@class='js-showAuth bw_button']");
	By Invitationstab = By.xpath("//a[contains(text(),'Invitations')]");
	By Notconfirmingpopup = By.xpath("//button[@id='confirm_button_yes']");

	/**
	 * @param SharingSettings
	 */
	public void SharingSettings() {
		try {

			performAction = new ActionKeywords(driver);
			CommonMethods.pageload(driver);
			performAction.clickandwait(personalinfotab, "Personalinfotab is clicked");
			performAction.clickandwait(SharingSettingstab, "Sharing settings tab is clicked");
			performAction.clickandwait(Caregiver, "Caregiver tab is clicked");
			performAction.clickandwait(CaregiverShareSettings, "CaregiverShareSettings is clicked");
			performAction.clickandwait(ChangeAllToggleIcon, "Changeall toggle is clicked");
			performAction.clickandwait(ChangeAllToggleIcon, "Changeall toggle is clicked again");
			performAction.clickandwait(HealthinfoSettingsbutton, "HealthinfoSettingsbutton is clicked");
			performAction.mouseOver(CancelbuttonforsettingsCaregiver, "mouseover pop up");
			performAction.clickandwait(CancelbuttonforsettingsCaregiver, "CancelbuttonforsettingsCaregiver is clicked");
			performAction.clickandwait(Peronalsettingsbutton, "Personal settings button is clicked");
			performAction.mouseOver(CancelbuttonforsettingsCaregiver, "mouseover pop up");
			performAction.clickandwait(CancelbuttonforsettingsCaregiver, "CancelbuttonforsettingsCaregiver is clicked");
			performAction.clickandwait(PersonalDocumentsettingsbutton, "personal document settings button is clicked");
			performAction.mouseOver(CancelbuttonforsettingsCaregiver, "mouseover pop up");
			performAction.clickandwait(CancelbuttonforsettingsCaregiver, "CancelbuttonforsettingsCaregiver is clicked");
			performAction.clickandwait(ActivitySettingsbutton, "Activity settings button is clicked");
			performAction.clickandwait(ActivityAppointmentstoggle, "Activity appointments toggle button");
			performAction.mouseOver(ActivitySavebutton, "mouseover pop up");
			performAction.clickandwait(ActivitySavebutton, "Activity save button is clicked");
			performAction.clickandwait(ChangeAllToggleIcon, "Change all toggle is clicked");
			performAction.clickandwait(ChangeAllToggleIcon, "Change all toggle is clicked");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("exception in SharingSettings");
		}

	}

	public void Invitationspopup() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Invitationstab, "Invitations tab is clicked");
			performAction.mouseOver(Notconfirmingpopup, "mouseover pop up");
			performAction.clickandwait(Notconfirmingpopup, "pop up is handeled");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("exception in Invitationspopup");
		}

	}

}
