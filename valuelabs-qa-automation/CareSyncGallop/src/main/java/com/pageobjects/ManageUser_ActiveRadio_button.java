package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class ManageUser_ActiveRadio_button {

	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * 
	 * @param driver
	 */

	public ManageUser_ActiveRadio_button(WebDriver driver) {
		this.driver = driver;
	}

	String NameofRole = "provlasname";
	By CreatedRole = By.xpath("//*[contains(text(),'" + NameofRole + "')]");
	By Active_Radio = By.xpath("//div[@id='active']/div[2]");
	By Save = By.id("save");
	By popup = By.id("confirm_button_no");

	/**
	 * @throws Exception
	 * @Active Radio button
	 */
	public void manageUser_ActiveRadio_button() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			CommonMethods.pageload(driver);
			performAction.jsclick(CreatedRole, "Clicked on the created role");
			performAction.click(Active_Radio, "Cliked on Active Radio button");
			CommonMethods.pageload(driver);
			performAction.click(Save, "Cliked on Save");
			CommonMethods.pageload(driver);
			performAction.click(Active_Radio, "Unchecked Radio buttom");
			performAction.click(Save, "Clicked on Save button");
			CommonMethods.pageload(driver);
			if (performAction.verify(popup, "Verification")) {
				System.out.println("loop");
				performAction.click(popup, "Clicked on popup");
			}
		} catch (Exception e) {
			throw new RuntimeException("manageUser_ActiveRadio_button exception");
		}

	}
}
