package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class Provider {

	WebDriver driver;
	ActionKeywords performAction;

	public Provider(WebDriver driver) {
		this.driver = driver;
	}

	By Add_provider = By.id("add_new_provider");
	By State = By.xpath("//*[@id='search_provider_state_field']");
	By lastname = By.xpath("//*[@id='search_provider_last_name_field']");
	By firstname = By.xpath("//*[@id='search_provider_first_name_field']");
	By City = By.xpath("//*[@id='search_provider_city_field']");
	By Zip_Code = By.xpath("//*[@id='search_provider_zip_field']");
	By Phone_field_Search = By.xpath("//*[@id='search_provider_phone_field']");
	By Speciality_Search = By.xpath("//*[@id='search_provider_specialty_field']");
	By Add_provider_Link = By.xpath("//*[@id='add_provider_link']");
	By Credentials = By.xpath("//*[@id='provider_credentials_field']");
	By Direct_Address_field = By.xpath("//*[@id='direct_address_field");
	By How_often = By.xpath("//*[@id='how_often_seen_field']");
	By Save = By.xpath("//*[@id='save_provider_button']");

	By Speciality = By.xpath("//*[@id='provider_specialty_field']");
	By Phone_field = By.xpath("//*[@id='provider_phone_field']");

	/**
	 * 
	 * @throws Exception
	 */
	public void add_Provider() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.click(Add_provider, "Clicked on Add provider");
			performAction.select(State, 1, "Selected State");
			performAction.enter(lastname, "prolasname" + CommonMethods.randaomstring(10), "Entered last name");
			performAction.enter(firstname, "profirstname" + CommonMethods.randaomstring(10), "Entered first name");
			performAction.enter(City, "cityname" + CommonMethods.randaomstring(10), "Entered City name");
			performAction.jsclick(Add_provider_Link, "Clicked on add provider link");
			performAction.enter(Credentials, CommonMethods.randominteger(90, 10), "Entered credentials");
			performAction.enter(Speciality, "surgeon" + CommonMethods.randaomstring(10), "Entered Speciality");
			performAction.enter(Phone_field, CommonMethods.randominteger(900000000, 1000000000),
					"Entered phone number");
			performAction.select(How_often, 1, "Selected How often");
			performAction.browserScroll(2000, "Browser scroll");
			performAction.click(Save, "Clicked on save");
		} catch (Exception e) {
			throw new RuntimeException("add_Provider exception");
		}

	}

	public void add_Provider1() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.click(Add_provider, "Clicked on Add provider");
			performAction.select(State, 1, "Selected State");
			performAction.enter(lastname, "prolasname" + CommonMethods.randaomstring(10), "Entered last name");
			performAction.enter(firstname, "profirstname" + CommonMethods.randaomstring(10), "Entered first name");
			performAction.enter(City, "cityname" + CommonMethods.randaomstring(10), "Entered City name");
			performAction.enter(Zip_Code, CommonMethods.randominteger(900000, 10000), "Entered Zip code");

			performAction.enter(Credentials, CommonMethods.randominteger(90, 10), "Entered credentials");
			performAction.enter(Speciality, "surgeon" + CommonMethods.randaomstring(10), "Entered Speciality");
			performAction.enter(Phone_field, CommonMethods.randominteger(900000000, 1000000000),
					"Entered phone number");
			performAction.enter(Direct_Address_field,
					"mahesh.bethi09+" + CommonMethods.randaomstring(15) + "@gmail.com", "Entered direct address");
			performAction.select(How_often, 1, "Selected How often");
			performAction.browserScroll(2000, "Browser scroll");
			performAction.click(Save, "Clicked on save");
		} catch (Exception e) {
			throw new RuntimeException("add_Provider1 exception");
		}

	}

}
