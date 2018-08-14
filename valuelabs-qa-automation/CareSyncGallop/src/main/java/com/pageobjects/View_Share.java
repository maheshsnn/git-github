package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class View_Share {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public View_Share(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for view and share
	 */							
	By viewandshare = By.xpath("//button[@id='view_share']");
	By ViewandShareReport = By.xpath("//*[@id='generate_print_view']");

	/**
	 * @param view  and share is clicked
	 */
	public void Viewshare() {
		try {

			performAction = new ActionKeywords(driver);
			performAction.wait(2000,"Wait time at view_share");
			performAction.clickandwait(viewandshare, "view and share is clicked");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("Viewshare exception");
		}

	}

	public void ViewandShareReport() {
		try {

			performAction = new ActionKeywords(driver);
			performAction.clickandwait(ViewandShareReport, "view and share is clicked");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("ViewandShareReport exception");
		}

	}

}