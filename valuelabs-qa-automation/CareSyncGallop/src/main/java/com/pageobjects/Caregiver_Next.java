package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.base.ActionKeywords;

public class Caregiver_Next {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 *
	 * @param driver
	 */
	public Caregiver_Next(WebDriver driver) {
		this.driver = driver;
	}

	By CaregiverNext = By.xpath("//button[@id='next']");
	By TextArea = By.xpath("//textarea[@id='invitation_notes']");
	By Savebutton = By.xpath("//button[@id='save']");

	/**
	 * @throws Exception
	 * @CareGiver Next
	 * @Entering text into Area
	 * @click on save
	 */
	public void careGiver_Next() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.browserScroll(3000, "Browser Scrolled down");
			performAction.click(CaregiverNext, "Entered next button");
			performAction.enter(TextArea, "text area mahesh", "Entered Text Area");
			performAction.click(Savebutton, "Clicked on Savebutton");
		} catch (Exception e) {
			System.out.println("Exception at careGiver_Next");
			throw new RuntimeException("enrollMember_Without_Email exception");
		}
	}
}
