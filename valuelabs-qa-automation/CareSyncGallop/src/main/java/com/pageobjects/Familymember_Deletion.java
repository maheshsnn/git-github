package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class Familymember_Deletion {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public Familymember_Deletion(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for LoginScreen
	 * @Function for Login
	 */
	By familyimage = By.xpath("(//img[@alt='Profile photo'])[3]");
	By membermainimage = By.xpath("//img[@class='selected_person-picture thumbnail pull-center']");
	By membertrashicon = By.xpath("//img[@alt='Trash']");
	By popup = By.xpath("//button[@value='0']");
	By Family2ndimage = By.xpath("(//img[@alt='Profile photo'])[2]");
	By caresyncbuyplustab = By.xpath("//*[@id='caresync_plus']/a");
	By requestrecords = By.xpath("//li[@class='onboarding_req_records pointer_cursor']");
	By CScontactbutton = By.xpath("//*[@id='46']/a");
	By CSmessagearea = By.xpath("//textarea[@id='msg']");
	By CSmessagesendbutton = By.xpath("//input[@id='btnSave']");
	By requestappointment = By.xpath("//*[@id='56']/a");

	/**
	 * @param uname
	 * @param pasword
	 */
	public void familymember_Deletion() {
		try {

			performAction = new ActionKeywords(driver);
			CommonMethods.pageload(driver);
			CommonMethods.pageload(driver);
			performAction.clickandwait(familyimage, "Family image is clicked");
			performAction.clickandwait(membermainimage, "main profile is clicked");
			performAction.clickandwait(membertrashicon, "member trashicon is clicked");
			performAction.clickandwait(popup, "pop up is handeled");
			performAction.clickandwait(Family2ndimage, "family 2nd image is clicked");
			performAction.clickandwait(caresyncbuyplustab, "caresync plus tab is clicked");
			performAction.clickandwait(requestrecords, "request records is clicked");
			performAction.clickandwait(caresyncbuyplustab, "caresyncplus tab is clicked");
			performAction.clickandwait(CScontactbutton, "Contact is clicked");
			performAction.enter(CSmessagearea, CommonMethods.randaomstring(10), "Message is entered");
			performAction.clickandwait(CSmessagesendbutton, "Message is sent");
			performAction.clickandwait(popup, "message pop up is handeled");
			performAction.clickandwait(requestappointment, "Request appointment is clicked");
			performAction.clear(CSmessagearea, "Message is cleared");
			performAction.enter(CSmessagearea,
					"Provider Name: Vishal \n Reason for Visit: Fever \n"
							+ " Preferred Dates: 02/02/2018 \n Preferred Times: 02:45 \n Insurance Provider: Apollo \n Are you a new patient? (Yes / No): yes",
					"Long message is entered");
			CommonMethods.pageload(driver);
			performAction.clickandwait(CSmessagesendbutton, "Message send button is clicked");

			performAction.clickandwait(popup, "pop up is handeled");

		} catch (Exception e) {
			throw new RuntimeException(" exception at familymember_Deletion");
		}

	}

}
