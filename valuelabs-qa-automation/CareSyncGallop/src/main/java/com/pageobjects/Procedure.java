package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class Procedure {

	WebDriver driver;
	ActionKeywords performAction;

	public Procedure(WebDriver driver) {
		this.driver = driver;
	}

	By Add_Procedure = By.xpath("//div[@id='medical_item_flyout_container']//button[@id='procedures_add_new']");
	By Name_of_Procedure = By.xpath("(//input[@name='procedureName'])[3]");
	By Date_Of_procedure = By.xpath("(//form[@id='procedure_flyout_form']/div[2]/input)[2]");
	By Save = By.xpath("(//form[@id='procedure_flyout_form']/div[4]/button[2])[2]");

	/**
	 * 
	 * @throws Exception
	 */
	public void add_Procedure() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.click(Add_Procedure, "Clicked on add procedure");
			performAction.enter(Name_of_Procedure, "Nameoftheprocedure" + CommonMethods.randaomstring(10),
					"Entered name of the proceudre");
			performAction.click(Date_Of_procedure, "Clicked on date of procedure");
			CommonMethods.calenderdatepicker(driver, "1");
			performAction.click(Save, "Clicked on save");
		} catch (Exception e) {
			throw new RuntimeException("add_Procedure exception");
		}
	}
}
