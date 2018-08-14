package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class Related_Health_Condition {

	WebDriver driver;
	ActionKeywords performAction;

	public Related_Health_Condition(WebDriver driver) {
		this.driver = driver;
	}

	By Health_add = By.xpath("//*[@id='health_add_new']");
	By Problem_Name = By.xpath("(//input[@name='problemName'])[2]");
	By Person_Diagnoised_BY = By.xpath("(//select[@id='personProviderId'])[2]");
	By When_Diagnoised = By.xpath("(//form[@id='problem_flyout_form']/ul/li[3]/input)[2]");
	By Health_Notes = By.xpath("(//form[@id='problem_flyout_form']/ul/li[4]/textarea)[2]");
	By Health_Save = By.xpath("(//a[contains(text(),'Save')])[6]");

	public void related_condition_Heath() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.click(Health_add, "Clicked on Health Add ");
			performAction.enter(Problem_Name, "ProblemName" + CommonMethods.randaomstring(10), "Entered problem name");
			performAction.select(Person_Diagnoised_BY, 1, "Entered diagnoised by");
			performAction.click(When_Diagnoised, "Clicked on When diagnoised");
			CommonMethods.calenderdatepicker(driver, "1");
			performAction.enter(Health_Notes, "HealthCondition" + CommonMethods.randaomstring(10),
					"Entered Helath notes");
			performAction.click(Health_Save, "Clicked on health save");
		} catch (Exception e) {
			throw new RuntimeException("related_condition_Heath exception");
		}
	}

}
