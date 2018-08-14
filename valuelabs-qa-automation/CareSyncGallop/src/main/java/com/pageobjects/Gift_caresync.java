package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class Gift_caresync {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public Gift_caresync(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for LoginScreen
	 * @Function for Login
	 */
	By giftcaresynctab = By.xpath("//*[@id='gift_care_sync']/a");
	By gifttofirstname = By.xpath("//input[@id='gift_first_name']");
	By gifttolastname = By.xpath("//input[@id='gift_last_name']");
	By gifttomailaddress = By.xpath("//input[@id='gift_to_email']");
	By giftfromname = By.xpath("//input[@id='gift_from_name']");
	By giftfrommailaddress = By.xpath("//input[@id='gift_from_email']");
	By giftnextbutton = By.xpath("//*[@id='gift_about_form']/div[2]/div[3]/input");
	By giftstyleseletion = By.xpath("//*[@id='gift_style_form']/div[2]/ul/li[1]/img");
	By giftstylenextbutton = By.xpath("//*[@id='gift_style_form']/div[2]/div/input");
	By giftmessage = By.xpath("//*[@id='gift_message']");
	By giftsendondate = By.xpath("//input[@name='send_on_date']");
	By GiftSendonDatepartculardate = By.xpath("//a[@class='ui-state-default ui-state-hover']");
	By GiftAmouttobeaddedfield = By.xpath("//input[@class='gifting_green_button font_bold']");
	By giftsetamount = By.xpath("//input[@value='Set Amount']");
	By giftnext1button = By.xpath("//*[@id='step_preview_content']/div/input");

	/**
	 * @param uname
	 * @param pasword
	 */
	public void gift_caresync() {
		try {
			performAction = new ActionKeywords(driver);
			CommonMethods.pageload(driver);
			performAction.clickandwait(giftcaresynctab, "caresync tab is clicked");
			performAction.enterandwait(gifttofirstname, CommonMethods.randaomstring(6), "Firstname is entered");
			CommonMethods.pageload(driver);
			performAction.enterandwait(gifttolastname, CommonMethods.randaomstring(6), "Last name is entered");
			CommonMethods.pageload(driver);
			performAction.enterandwait(gifttomailaddress, "mahesh.bethi09+" + CommonMethods.randaomstring(15) + "@gmail.com",
					"To address is entered");
			CommonMethods.pageload(driver);
			performAction.enterandwait(giftfromname, CommonMethods.randaomstring(7), "From name is entered");
			CommonMethods.pageload(driver);
			performAction.enterandwait(giftfrommailaddress, "Vishal.dhanala+" + CommonMethods.randaomstring(15) + "@gmail.com",
					"from mail address is entered");
			CommonMethods.pageload(driver);
			performAction.clickandwait(giftnextbutton, "next button is clicked");
			performAction.clickandwait(giftstyleseletion, "style is clicked");
			performAction.clickandwait(giftstylenextbutton, "next button is clicked");
			performAction.enterandwait(giftmessage, CommonMethods.randaomstring(10), "gift message is entered");
			CommonMethods.pageload(driver);
			performAction.clickandwait(giftsendondate, "Send on date");
			performAction.clickandwait(GiftSendonDatepartculardate, "gift send on particular date");
			performAction.clickandwait(giftsetamount, "Amount is entered");
			performAction.clickandwait(GiftAmouttobeaddedfield, "GiftAmouttobeaddedfield is clicked");
			performAction.clickandwait(giftnext1button, "gift next button is clicked");
			performAction.wait(4000, "wait is added");

		} catch (Exception e) {
			throw new RuntimeException(" exception at gift_caresync");
		}

	}

}