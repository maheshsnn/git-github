package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.base.ManageBrowser;
import com.utility.CommonMethods;

public class ManageUsers extends ManageBrowser {

	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public ManageUsers(WebDriver driver) {
		this.driver = driver;
	}

	By Manageusers = By.xpath("//*[@id='manage-users']");
	By Role = By.id("userRole");
	By Firstname = By.id("firstName");
	By Lastname = By.id("lastName");
	By UserEmail = By.id("userName");
	By Password = By.id("create_pwd");
	By ConfirmPassword = By.id("confirm_pwd");
	By SaveButton = By.id("save");
	By Pop_up=By.xpath("//button[@value='Yes']");

	/**
	 * @throws Exception
	 * @Manage users
	 * 
	 */
	public void ManageUsersRole() throws Exception {

		try {
			performAction = new ActionKeywords(driver);
			performAction.click(Manageusers, "Clicked on Manage Users");

			performAction.select(Role, "Staff", "Selected");
			performAction.enter(Firstname, "profirstname" + CommonMethods.randaomstring(10), "Entered firstname");
			performAction.enter(Lastname, "provlasname" + CommonMethods.randaomstring(10), "Entered last name");
			performAction.enter(UserEmail, "mahesh.bethi09+" + CommonMethods.randaomstring(15) + "@gmail.com",
					"Entered email ");
			performAction.enter(Password, "Mahesh@123", "Entered password");
			performAction.enter(ConfirmPassword, "Mahesh@123", "Entered confirm password");
			performAction.click(SaveButton, "Clicked on save button");
			
			if(performAction.verify(Pop_up, "Alert popup is present"))
			{
				performAction.clickandwait(Pop_up, "Clicked on Yes button");
			}
						
		} catch (Exception e) {
			throw new RuntimeException("ManageUsersRole exception");
		}
	}

}
