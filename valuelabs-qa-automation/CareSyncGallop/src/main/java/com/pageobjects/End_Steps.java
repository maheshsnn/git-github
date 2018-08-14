package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.base.ActionKeywords;

public class End_Steps {

	WebDriver driver;
	ActionKeywords performAction;

	public End_Steps(WebDriver driver) {
		this.driver = driver;
	}

	By Contact = By.xpath("(//*[contains(text(),'Contact')])[1]");
	By Cancel = By.xpath("//input[@id='org_contact_csr_cancel_button']");
	By Help = By.xpath("//div[@id='help-drop-down-container']/span");
	// By SignOut=By.xpath("//div[@id='navigation-menu']/span[3]");
	By SignOut = By.xpath("(//*[contains(text(),'Sign Out')])[1]");

	public void End() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.mouseClick(Contact, "Clicked on Contact");
			performAction.jsclick(Cancel, "Clicked on Cancel");
			performAction.jsclick(Help, "Clicked on Help");
			performAction.mouseClick(SignOut, "Clicked on Signout");
		} catch (Exception e) {
		   System.out.println("Exception at End");
		   throw new RuntimeException("enrollMember_Without_Email exception");
		}
	}

	public void contact() throws Exception {
		performAction = new ActionKeywords(driver);
		performAction.click(Contact, "Clicked on Contact");
	}

	public void cancel() throws Exception {
		performAction = new ActionKeywords(driver);
		performAction.click(Cancel, "Clicked on Cancel");
	}

	public void help() throws Exception {
		performAction = new ActionKeywords(driver);
		performAction.click(Help, "Clicked on Help");
	}

	public void signout() throws Exception {
		performAction = new ActionKeywords(driver);
		performAction.click(SignOut, "Clicked on Signout");
	}

}
