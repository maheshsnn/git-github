package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class Assign_Membership {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	* Constructor
	*/
	public Assign_Membership(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators Assigning member
	 * @Function Member is assigned
	 */
	By memberprofile = By.xpath("//img[@alt='Profile picture']");
	By memberprofile_two = By.xpath("(//img[@alt='Profile picture'])[2]");
	By assign = By.xpath("//*[@id='content']/div[2]/span[2]");
	By Phonenumber = By.xpath("//input[@name='cspContactPhoneNumber']");
	By textArea = By.xpath("//textarea[@class='cspContactNotesField']");
	By continuebutton = By.xpath("//span[@class='done_link bottom_links_button done']");
	By addfamilybutton = By.xpath("//*[@class='tool-button js-add-family-button flexItem-stretch']");
	By familyfirstname = By.xpath("//input[@id='firstName']");
	By familyLastname = By.xpath("//input[@id='lastName']");
	By calendar = By.xpath("//input[@id='faDateOfBirth']");
	By familyDOB = By.xpath("(//a[@class='ui-state-default'])[1]");
	By relationship = By.xpath("//select[@id='relationship']");
	By checkbox = By.xpath("//div[@class='checkbox  ']");
	By membermailid = By.xpath("//input[@id='newUserEmail']");
	By next = By.xpath("(//*[@value='Next'])[1]");
	By sendRequest = By.xpath("//input[@id='btnSendRequest']");
	By sendRequestpopup = By.xpath("//*[@id='popup']/div[4]/button");
	By familymembersecondpicture = By.xpath("(//img[@class='thumbnail'])[2]");
	By buycaresyncbanner = By.xpath("//*[@id='account-banner']/a");
	By healthHistoryplan = By.xpath("//input[@value='Buy Health History Plan']");
	By familypromocode = By.xpath("//*[@id='purchase_plan_promo_code']");
	By promocodeapply = By.xpath("//input[@value='Apply']");
	By confirmpurchase = By.xpath("//input[@value='Confirm Purchase']");
	By letsgo = By.xpath("//*[@id='content']/div[3]/div/div/a");

	/**
	 * @param Adding family member and assigning the careplan
	 */
	
	public void memberprofile()
	{
		try {
			performAction = new ActionKeywords(driver);
			performAction.click(memberprofile, "Clicking on memberprofile");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void assign()
	{
		try {
			performAction = new ActionKeywords(driver);
			performAction.click(assign, "Clicking on Assign button");
			performAction.enter(Phonenumber, CommonMethods.randominteger(900000000, 1000000000),
					"Entering phone number");
			performAction.enter(textArea, CommonMethods.randaomstring(20), "Entering text in text box");
			performAction.clickandwait(continuebutton, "Click on continue button");
			performAction.click(addfamilybutton, "Clicking on add family button");
			performAction.enter(familyfirstname, CommonMethods.randaomstring(10),
					"Entering the family firstname");
			performAction.enter(familyLastname, CommonMethods.randaomstring(10), "Entering the family Lastname");
			performAction.browserScroll(500, "window is scrolled down");
			performAction.click(calendar, "cliked on calendar");
			performAction.click(familyDOB, "Entering DOB");
			performAction.click(familyfirstname, "clicking on family member the family firstname");
			performAction.select(relationship, "Wife", "Selecting the relationship");
			performAction.clickandwait(checkbox, "Family checkbox is clicked");
			performAction.enter(membermailid,
					"caresyncc+" + CommonMethods.randominteger(90000, 10000) + "@gmail.com",
					"member mail id is entered");
		} catch (Exception e) {
			
		}
	}
	
	public void Next()
	{
		try {
			performAction = new ActionKeywords(driver);
			performAction.jsclick(next, "Clicked on Next");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sendRequest()
	{
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(sendRequest, "Sendrequest button is clicked");
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sendRequestpopup()
	{
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(sendRequestpopup, "Pop up is handeled");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void familymembersecondpicture()
	{
		try {
			performAction.clickandwait(familymembersecondpicture, "familymemberpicture is clicked");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void buycaresyncbanner()
	{
		try {
			performAction.clickandwait(buycaresyncbanner, "caresync banner is clicked");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void healthHistoryplan()
	{
		try {
			performAction.clickandwait(healthHistoryplan, "Health history plan is clicked");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void familypromocode()
	{
		try {
			performAction.enterandwait(familypromocode, "MYFAMILY", "Family promocode is entered");
			performAction.clickandwait(promocodeapply, "Apply button is clicked");
			performAction.browserScroll(1000, "window is scrolled down");
			performAction.clickandwait(confirmpurchase, "confirm purchase is clicked");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void letsgo ()
	{
		try {
			performAction.clickandwait(letsgo, "Lets go is clicked");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void memberprofile_two()
	{
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(memberprofile_two, "Clicking on memberprofile");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
