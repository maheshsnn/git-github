package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class SAAS_Image {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public SAAS_Image(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for LoginScreen
	 * @Function for Login
	 */
	By Image = By.xpath("//*[@title='Enterprise ID: 364']");
	By Image2 = By.xpath("//img[@title='Member ID: 18352']");

	/**
	 * @param uname
	 * @param pasword
	 * @throws Exception
	 */
	public void SaasImage() throws Exception {
		try {

			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Image, "SaaS image is clicked");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("SaasImage exception");
		}

	}

	/**
	 * @throws Exception
	 * 
	 */
	public void SaaSimage2() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Image2, "Ralphie image is clicked");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("SaaSimage2 exception");
		}
	}

}
