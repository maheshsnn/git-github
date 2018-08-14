package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;

public class Manage_Members {

	WebDriver driver;
	ActionKeywords performAction;

	public Manage_Members(WebDriver driver) {
		this.driver = driver;
	}

	By ManageMembers = By.id("manage-members");
	By lastname = By.id("search_last_name");
	By pending_Invitation = By.id("pending_invitations");
	By Expired_Invitation = By.id("expired_invitations");
	By Confirm_Button = By.xpath("//*[@id='confirm_button_yes']");

	public void manage_Members() throws Exception {
		try {

			performAction = new ActionKeywords(driver);
			performAction.wait(2000,"Manage users wait");
			performAction.click(ManageMembers, "Clicked on manage user");
			performAction.wait(3000,"Manage users wait");
		
			if (performAction.verify(Confirm_Button, "Confirm button displayed ")) {
				performAction.click(Confirm_Button, "Clicked on confirm");
			}

			performAction.enter(lastname, "Ant", "Entered last name");
			performAction.browserScroll(-500, "Browser scrolled up");
			performAction.click(pending_Invitation, "Clicked on pending invitation");
			performAction.click(Expired_Invitation, "Clicked on Expired Invitation");
		} catch (Exception e) {
			throw new RuntimeException("manage_Members exception");
		}

	}

}
