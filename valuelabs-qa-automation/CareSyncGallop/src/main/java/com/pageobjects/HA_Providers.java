package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class HA_Providers {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public HA_Providers(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for providers
	 */
	By Providerstab = By.xpath("//a[contains(text(),'Providers')]");
	By AddbuttoninProviders = By.xpath("//a[@id='add_provider_button']");
	By StateList = By.xpath("//*[@id='search_provider_state_field']");
	By ProviderHowoftendropdown = By.xpath("//select[@id='how_often_seen_field']");
	By nolongerseethisprovidercheckbox = By.xpath("//*[@id='provider_checkbox']/div[1]");
	By ProviderLastName = By.xpath("//*[@id='search_provider_last_name_field']");
	By ProviderList = By.xpath("//*[@id='search_provider_listing']/li[1]");
	By SaveProvider = By.xpath("//*[@id='save_provider_button']");
	By ProviderTrashIcon = By.xpath("(//img[@class='trash_icon'])[1]");
	By AcceptingDeletebutton = By.xpath("//*[@id='popup']/div[4]/button[2]");
	By ProviderCheckBox = By.xpath("//*[@id='provider_checkbox']/div[1]");
	By FadingtheProvider = By.xpath("//*[@id='provider_listing']/li[9]/div");
	By Selectedprovider = By.xpath("//li[@class='js-entityListItem entityListItem inactive selected_provider']");
	By CheckedboxProvider = By.xpath("(//div[@class='checkbox checked'])[1]");

	public void providers() {

		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Providerstab, "Providers tab is clicked");
			performAction.clickandwait(AddbuttoninProviders, "Add button in Providers is clicked");
			performAction.selectandwait(StateList, "AL", "State is selected");
			performAction.enterandwait(ProviderLastName, "AL", "Provider last name is entered");
			performAction.clickandwait(ProviderList, "Provider selected from list");
			performAction.selectandwait(ProviderHowoftendropdown, "Monthly", "How often drop down is selected");
			performAction.browserScroll(15000, "Window is scrolled");
			CommonMethods.pageload(driver);
			performAction.clickandwait(SaveProvider, "Provider is saved");
			performAction.browserScroll(3000, "Window is scrolled");
		} catch (Exception e) {
			throw new RuntimeException("exception in providers");
		}
	}

	public void nolonger_providercheckbox() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.browserScroll(1500, "Window is scrolled");
			performAction.wait(3000, "wait is added");
			performAction.clickandwait(nolongerseethisprovidercheckbox, "No longer checkbox is clicked");
			performAction.clickandwait(SaveProvider, "Provider is saved");
		} catch (Exception e) {
			throw new RuntimeException("exception in non longer provider checkbox");
		}
	}
	
	public void provider_transhicon() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(ProviderTrashIcon, "Provider trash icon is clicked");
			performAction.mouseOver(AcceptingDeletebutton, "Mouse over the pop up");
			performAction.wait(3000, "wait is added");
			performAction.clickandwait(AcceptingDeletebutton, "Pop up is accepted and provider is deleted");
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			throw new RuntimeException("exception in provider transhicon");
		}
	}

}