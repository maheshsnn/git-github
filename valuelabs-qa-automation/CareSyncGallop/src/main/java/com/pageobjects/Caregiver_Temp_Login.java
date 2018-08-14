package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class Caregiver_Temp_Login {
	WebDriver driver;
	ActionKeywords performAction;

	public Caregiver_Temp_Login(WebDriver driver) {
		this.driver = driver;
	}

	By Next = By.id("next");
	By Invitation_Notes = By.id("invitation_notes");
	By Accont_Radio = By.xpath("//form[@id='logins_needed_form']/div/ul/li/div/div");
	By Need_Temp_Login = By.xpath("//form[@id='logins_needed_form']/div[2]/span");
	By save = By.id("save");

	public void careGiver_Temporory_Login() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.browserScroll(4000, "Browser scrolled down");
			performAction.click(Next, "Clicked on Next");
			performAction.enter(Invitation_Notes, "text area mahesh", "Entered text into invitaion notes");
			performAction.click(Accont_Radio, "Clicked on Account Radio Button");
			performAction.click(Need_Temp_Login, "Clicked on Temp Login");
			performAction.browserScroll(2000, "Browser scrolled down");
			performAction.click(save, "Clicked on save button");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("enrollMember_Without_Email exception");
		}
	}
}
