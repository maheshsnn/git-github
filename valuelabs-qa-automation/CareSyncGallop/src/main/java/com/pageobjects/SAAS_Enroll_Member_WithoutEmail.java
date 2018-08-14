package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class SAAS_Enroll_Member_WithoutEmail {

	WebDriver driver;
	ActionKeywords performAction;

	public SAAS_Enroll_Member_WithoutEmail(WebDriver driver) {
		this.driver = driver;
	}

	By AddMember = By.id("add-members");
	By Member_Firstname = By.name("firstName");
	By Member_lastname = By.name("lastName");
	By Member_DOb = By.id("dob");
	By Gender = By.xpath("//*[@name='gender']");
	By Member_Homephonenumber = By.name("homePhone");
	By Member_Mobilenumber = By.name("mobilePhone");
	By PrimaryInsurence = By.xpath("//input[@name='primaryIns']");
	By InsurenceID = By.xpath("(//input[@type='text'])[8]");
	By Providers = By.xpath("//select[@name='providers']");
	By Location = By.xpath("//select[@name='locations']");
	By Program = By.xpath("//select[@name='program']");
	By Consenttype = By.xpath("//select[@name='signFormsMethod']");
	By Relatedpatient = By.xpath("(//div[@id='inviteFormsContainer']/div/div/div[2]/form/div/div[2]/button)[1]");

	public void enrollMember_Without_Email() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			CommonMethods.pageload(driver);
			performAction.enter(Member_Firstname, "profirstname" + CommonMethods.randaomstring(10),
					"Entered Member first name");
			performAction.enter(Member_lastname, "prolasname" + CommonMethods.randaomstring(10),
					"Entered member last name");
			performAction.enterandwait(Member_DOb, "01/11/1986", "Entered DOB");
			performAction.selectandwait(Gender, "Male", "Gender is selected");
			performAction.clickandwait(Member_Homephonenumber, "Home phone number is clicked");
			performAction.enter(Member_Homephonenumber, CommonMethods.randominteger(900000000, 1000000000),
					"Entered Home phone number");
			performAction.enter(Member_Mobilenumber, CommonMethods.randominteger(900000000, 1000000000),
					"Entered Mobile number");
			performAction.enterandwait(PrimaryInsurence, CommonMethods.randominteger(900, 100),
					"Entered primary Insurence");
			performAction.enterandwait(InsurenceID, CommonMethods.randominteger(90, 10), "Entered Insurence ID");
			performAction.select(Providers, "Provider, SaaS", "Selected Providers");
			performAction.selectandwait(Location, "Ravi SaaS Practice 1", "Selected location");
			performAction.selectandwait(Program, "Chronic Care Management", "Selected program");
			performAction.selectandwait(Consenttype, "In App", "Concent type is selected");

		} catch (Exception e) {
			throw new RuntimeException("enrollMember_Without_Email exception");
		}
	}
}
