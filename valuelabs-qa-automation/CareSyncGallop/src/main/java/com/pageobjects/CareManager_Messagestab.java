package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.base.ActionKeywords;
import com.utility.CommonMethods;
import com.utility.ExcelReadandWritedata;

public class CareManager_Messagestab {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public CareManager_Messagestab(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for Caremamger and Messages
	 */
	By CareManagerLabel = By.xpath("//a[contains(text(),'Care Manager')]");
	By MessagesTab = By.xpath("//a[contains(text(),'Messages')]");
	By MessagesAddbutton = By.xpath("//*[@id='add_message']");
	By MessagesRecepient = By.xpath("//*[@id='pick_recipients']/ul/li[1]/img[1]");
	By MessagesNextButton = By.xpath("//*[@id='next_button']");
	By MessagesSubject = By.xpath("//input[@id='message_entry_subject']");
	By MessagesMessage = By.xpath("//*[@id='message_entry_text']");
	By MessageSendbutton = By.xpath("//*[@id='send_message']");

	/**
	 * @param uname
	 * @param pasword
	 */
	public void Messagetab() {
		try {
			performAction = new ActionKeywords(driver);
			CommonMethods.pageload(driver);
			performAction.clickandwait(CareManagerLabel, "Caremanagerlabel is clicked");
			performAction.clickandwait(MessagesTab, "Messages tab is clicked");
			performAction.clickandwait(MessagesAddbutton, "Messages add button is clicked");
			performAction.clickandwait(MessagesRecepient, "Recipient is selected");
			performAction.clickandwait(MessagesNextButton, "Next button is clicked");
			performAction.enterandwait(MessagesSubject, ExcelReadandWritedata.Readcell(61, 0), "Subject is entered");
			performAction.enterandwait(MessagesMessage, ExcelReadandWritedata.Readcell(62, 0), "Message is entered");
			performAction.clickandwait(MessageSendbutton, "Send button is clicked");
			System.out.println("completed messeages");
		} catch (Exception e) {
			System.out.println("Exception at Messagetab");
			throw new RuntimeException("Exception at Messagetab");

		}

	}

}
