package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;

public class Create_Account {

	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * 
	 */
	public Create_Account(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for Creating an account
	 * @Function for Creating an account
	 */
	By createanaccount = By.xpath("//*[@id='create_account_toggle']");
	By firstname = By.xpath("//*[@id='sign_up_first_name']");
	By lastname = By.xpath("//*[@id='sign_up_last_name']");
	By emailaddress = By.xpath("//*[@id='sign_up_username']");
	By password = By.xpath("//*[@id='sign_up_password']");
	By createaccountbutton = By.xpath("//*[@id='sign_up_button']");
	By resendmail = By.xpath("//*[contains(text(),'Resend Confirmation Email')]");
	By mailconfirmation = By.xpath("//*[contains(text(),'OK')]");

	/**
	 * @param frstname
	 * @param lstname
	 * @param mailid
	 * @param passwd
	 */
	public void CreateAccount(String frstname, String lstname, String mailid, String passwd) {
		try {

			performAction = new ActionKeywords(driver);
			performAction.clickandwait(createanaccount, "Clicking on Create an Account");
			performAction.enterandwait(firstname, frstname, "Entering Firstname");
			performAction.enterandwait(lastname, lstname, "Entering Lastname");
			performAction.enterandwait(emailaddress, mailid, "Entering the mailid");
			performAction.enterandwait(password, passwd, "Entering the password");
			performAction.clickandwait(createaccountbutton, "cliked on createaccount button");
			performAction.clickandwait(resendmail, "Clicking on resend mail");
			performAction.clickandwait(mailconfirmation, "mail pop up is confirmed");
		} catch (Exception e) {
			throw new RuntimeException("Exception at CreateAccount");
		}

	}
}