package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.ExcelReadandWritedata;

public class HA_Personal_Enrollmentsources {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public HA_Personal_Enrollmentsources(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for personal info
	 * 
	 */
	By personalinfotab = By.xpath("//a[contains(text(),'Personal')]");
	By Changepicture = By.xpath("//input[@name='qqfile']");
	By FirstName = By.xpath("//input[@id='piFirstName']");
	By MiddleName = By.xpath("//input[@id='piMiddleName']");
	By LastName = By.xpath("//input[@id='piLastName']");
	By Suffix = By.xpath("//input[@id='piSuffix']");
	By Addressline1 = By.xpath("//input[@name='piPrimaryAddressLine1']");
	By Addressline2 = By.xpath("//input[@id='piPrimaryAddressLine2']");
	By City = By.xpath("//input[@id='piPrimaryCity']");
	By StateandProvince = By.xpath("//select[@id='piPrimaryStateProvince']");
	By PostalCode = By.xpath("//input[@id='piPrimaryPostalCode']");
	By CountryCode = By.xpath("//select[@id='piPrimaryCountryCode']");
	By HomePhone = By.xpath("//input[@id='piHomePhone']");
	By MobilePhone = By.xpath("//input[@id='piMobilePhone']");
	By WorkPhone = By.xpath("//input[@id='piWorkPhone']");
	By DateOfBirth = By.xpath("//input[@id='piDateOfBirth']");
	By DOBclick = By.xpath("//*[@class='ui-state-default ui-state-active']");
	By Gender = By.xpath("//select[@id='piGender']");
	By BloodType = By.xpath("//select[@id='piBloodType']");
	By Race = By.xpath("//select[@id='piRace']");
	By Ethnicity = By.xpath("//select[@id='piEthnicity']");
	By Language = By.xpath("//select[@id='piLanguage']");
	By SmokingStatus = By.xpath("//select[@id='piSmokingStatus']");
	By Email = By.xpath("//input[@id='piEmail']");
	By TimeZoneName = By.xpath("//select[@id='piPrimaryTimeZoneName']");

	public void member_name() {
		try {
			performAction = new ActionKeywords(driver);
			System.out.println("in enrollment resourses");
			performAction.clickandwait(personalinfotab, "Personal info tab is clicked");
			performAction.clear(FirstName, "Clearing first name");
			performAction.enterandwait(FirstName, ExcelReadandWritedata.Readcell(1, 0), "Firstname is enterandwaited");
			performAction.clear(MiddleName, "Clearing the middle name");
			performAction.enterandwait(MiddleName, ExcelReadandWritedata.Readcell(2, 0),
					"enterandwaiting the middle name");
			performAction.clear(LastName, "Clearing Lastname");
			performAction.enterandwait(LastName, ExcelReadandWritedata.Readcell(3, 0), "enterandwaiting the Last name");
			performAction.clear(Email, "Clearing the Email");
			performAction.click(Email, "Clicked on email");
			performAction.enterandwait(Email, ExcelReadandWritedata.Readcell(13, 0), "Email is enterandwaited");
		} catch (Exception e) {
			throw new RuntimeException("exception in Member Name");
		}
	}

	public void member_demographics() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.click(DateOfBirth, "DOB clicked");
			performAction.clickandwait(DOBclick, "Date is clicked");
			performAction.selectandwait(Gender, "Male", "Gender is selected");
			performAction.selectandwait(BloodType, "B+", "Blood type is selected");
			performAction.selectandwait(Race, "Caucasian/White", "selectandwaiting the race");
			performAction.selectandwait(Ethnicity, "Ethnicity", "selectandwaiting the ethnicity");
			performAction.selectandwait(Language, "Arabic", "selectandwaiting the Language");
			performAction.selectandwait(SmokingStatus, "Never Smoked", "Smoking status enterandwaited");
			performAction.browserScroll(400, "browser scrolled ");
		} catch (Exception e) {
			throw new RuntimeException("exception in Member Demographics");
		}
	}

	public void member_addresses() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clear(Addressline1, "Clearing the addressline1");
			performAction.enterandwait(Addressline1, ExcelReadandWritedata.Readcell(5, 0),
					"enterandwaiting the addressline1");
			performAction.clear(Addressline2, "Clearing the addressline2");
			performAction.enterandwait(Addressline2, ExcelReadandWritedata.Readcell(6, 0),
					"enterandwaiting the addressline2");
			performAction.clear(City, "Clearing the city");
			performAction.enterandwait(City, ExcelReadandWritedata.Readcell(7, 0), "enterandwaiting the city");
			performAction.clear(PostalCode, "Clearing the postal code");
			performAction.enterandwait(PostalCode, ExcelReadandWritedata.Readcell(8, 0),
					"enterandwaiting the postal code");
			performAction.selectandwait(CountryCode, "Togo", "selectandwaiting the Country code");
			performAction.clear(HomePhone, "Clearing the Homephone");
			performAction.enterandwait(HomePhone, ExcelReadandWritedata.Readcell(9, 0),
					"enterandwaiting the Homephone");
			performAction.clear(MobilePhone, "Clearing the Mobile phone");
			performAction.enterandwait(MobilePhone, ExcelReadandWritedata.Readcell(10, 0),
					"enterandwaiting the Mobile phone");
			performAction.clear(WorkPhone, "Cleaing the workphone");
			performAction.enterandwait(WorkPhone, ExcelReadandWritedata.Readcell(11, 0),
					"enterandwaiting the Workphone");
			performAction.selectandwait(TimeZoneName, "GMT-04:00 - America/New York", "TimeZone is selectandwaited");
			performAction.browserScroll(800, "Browser scroll");

		} catch (Exception e) {
			throw new RuntimeException("exception in Member address");
		}
	}

}
