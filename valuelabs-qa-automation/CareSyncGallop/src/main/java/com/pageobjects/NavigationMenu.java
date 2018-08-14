package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;

public class NavigationMenu {

	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @Practice Image click
	 */

	public NavigationMenu(WebDriver driver) {
		this.driver = driver;
	}

	By PracticeImagelink = By.xpath("//*[contains(text(),'Ravi CCM Practice')]");
	By Search_Members = By.id("search-members");
	By Manage_Staff = By.id("manage-staff");
	By Manage_Teams = By.id("manage-teams");
	By Meaningful_Use = By.id("org-muReport");
	By Sevices_Reports = By.id("ccm_report");
	By Scribe_Status = By.id("scribe_status");
	By Send_Charges = By.id("send_charges_report");
	By cs_Reports = By.id("custom-reports");
	By Manage_Users = By.id("manage-users");
	By Enroll_Members = By.id("add-members");
	By Manage_Members = By.id("manage-members");
	By Cs_Settings = By.id("org-settings");

	public void NavigateTo(String strMenuItem) throws Exception {
		performAction = new ActionKeywords(driver);

		switch (strMenuItem) {

		case "PracticeImage":

			performAction.click(PracticeImagelink, "Cliked on PracticeImage");

			break;

		case "SearchMembers":
			performAction.click(Search_Members, "Cliked on Search Members");

		case "ManageStaff":
			performAction.click(Manage_Staff, "Cliked on Manage staff");

		case "ManageTeams":
			performAction.click(Manage_Teams, "Cliked on Manage Teams");

		case "MeaningfulUse":
			performAction.click(Meaningful_Use, "Cliked on Meaning full use");

		case "ServicesReports":
			performAction.click(Sevices_Reports, "Cliked on ServicesReports");

		case "ScribeStatus":
			performAction.click(Scribe_Status, "Cliked on Scribe Status");

		case "SendCharges":
			performAction.click(Send_Charges, "Cliked on Send Chrages");

		case "Reports":
			performAction.click(cs_Reports, "Cliked on Reports");

		case "ManageUsers":
			performAction.click(Manage_Users, "Cliked on Manage Users");

		case "EnrollMembers":
			performAction.click(Enroll_Members, "Cliked on Enroll member");

		case "ManageMembers":
			performAction.click(Manage_Members, "Cliked on Cliked on manage members");

		case "Settings":
			performAction.click(Cs_Settings, "Cliked on Settings");

			System.out.println("clicked on " + strMenuItem);
		}
	}
}
