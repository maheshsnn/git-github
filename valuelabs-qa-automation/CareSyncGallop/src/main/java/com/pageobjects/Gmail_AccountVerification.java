package com.pageobjects;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class Gmail_AccountVerification {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * 
	 */
	public Gmail_AccountVerification(WebDriver driver) {
		this.driver = driver;

	}

	/**
	 * @Locators for G-mail
	 * @Function for G-mail verification
	 */

	By newsignintab = By.xpath("//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']");
	By Gmailusername = By.xpath("//input[@id='identifierId']");
	By usernamenextbutton = By.xpath("//div[@id='identifierNext']");
	By Gmailpassword = By.xpath("//input[@type='password']");
	By passwordnextbutton = By.xpath("//div[@id='passwordNext']");
	By Gmailfirstmail = By.xpath("(//td[@tabindex='-1'])[1]");
	By GmailVerifyaccount = By.xpath("(//img[@class='CToWUd'])[3]");
	By Gmailverificationpopup = By.xpath("//button[@value='0']");
	By passwordd = By.id("_password");
	By signin = By.id("sign_in_button");

	/**
	 * 	 * 
	 * @param G-mail username
	 * @param G-mail password
	 * @param G-mail account verification
	 * @param Pop up acceptance
	 */
	public void Gmail_login(String username, String password, String caresyncpassword) {
		try {

			performAction = new ActionKeywords(driver);
			CommonMethods.pageload(driver);
			CommonMethods.pageload(driver);
			performAction.wait(2000,"wait time");
			performAction.clickandwait(newsignintab, "Clicking on new gmail Signin tab");
			performAction.enter(Gmailusername, username, "Entering Gmail username");
			performAction.clickandwait(usernamenextbutton, "Clicking on username next button");
			CommonMethods.pageload(driver);
			CommonMethods.pageload(driver);
			performAction.enterandwait(Gmailpassword, password, "Entering Gmail password");
			performAction.clickandwait(passwordnextbutton, "Clicking on password next button");
			CommonMethods.pageload(driver);
			performAction.click(Gmailfirstmail, "cliked on Gmail firstmail");
			String parentwindow2 = driver.getWindowHandle();
			performAction.clickandwait(GmailVerifyaccount, "cliked on gmail verify account");
			Set<String> ch2 = driver.getWindowHandles();
			for (String childwindow : ch2) {
				if (!parentwindow2.equals(childwindow)) {
					System.out.println("focus moved to child window");
					driver.switchTo().window(childwindow);
				}
			}
			CommonMethods.pageload(driver);
			performAction.clickandwait(Gmailverificationpopup, "cliked on verification pop up");
			performAction.enter(passwordd, caresyncpassword, "Entering the caresync password");
			CommonMethods.pageload(driver);
			performAction.click(signin, "Click on signin button");

		} catch (Exception e) {
			throw new RuntimeException(" exception at Gmail_login");
		}

	}
}
