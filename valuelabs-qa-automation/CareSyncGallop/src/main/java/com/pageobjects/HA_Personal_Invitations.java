package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;

public class HA_Personal_Invitations {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public HA_Personal_Invitations(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for Invitations
	 */
	By Invitationstab = By.xpath("//a[contains(text(),'Invitations')]");
	By MyInvitations = By.xpath("(//h2[@class='hdg hdg_section'])[1]");
	By PendingInvitations = By.xpath("(//h2[@class='hdg hdg_section'])[2]");
	By Resendbutton = By.xpath("(//div[@class='resend_invitation button-glossy'])[1]");
	By AcceptingPop = By.xpath("//button[@value='0']");
	By IgnoreInvitations = By.xpath("(//h2[@class='hdg hdg_section'])[2]");

	/**
	 * @param Invitations
	 */
	public void Invitations() {
		try {

			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Invitationstab, "Invitations tab is clicked");
			performAction.clickandwait(MyInvitations, "My invitations is clicked");
			performAction.clickandwait(PendingInvitations, "Pending invitation is clicked");
			performAction.clickandwait(Resendbutton, "Resend button is clicked");
			performAction.wait(2000, "click wait resend");
			performAction.mouseOver(AcceptingPop, "Mouse over on pop up");
			performAction.clickandwait(AcceptingPop, "Pop up is handeled");
			performAction.clickandwait(IgnoreInvitations, "Ignoreinvitations is clicked");

		} catch (Exception e) {
			throw new RuntimeException("exception in Invitations");
		}

	}

}