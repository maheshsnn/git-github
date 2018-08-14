package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class Related_Measurement {
	WebDriver driver;
	ActionKeywords performAction;

	public Related_Measurement(WebDriver driver) {
		this.driver = driver;

	}

	By Add_Measurement = By.xpath("//button[@id='measurements_add_new']");
	By Reading_Taken_date = By.xpath("(//input[@name='reading_taken_date'])[2]");
	By Height_in_feet = By.xpath("(//input[@id='height_feet'])[2]");
	By Height_in_Inches = By.xpath("(//input[@id='height_inches'])[2]");
	By Height_Notes = By.xpath("(//input[@id='height_comments'])[2]");
	By Weight = By.xpath("(//input[@id='weight'])[2]");
	By Weight_Comments = By.xpath("(//input[@id='weight_comments'])[2]");
	By BP_Systole = By.xpath("(//input[@id='systolic'])[2]");
	By BP_Diastole = By.xpath("(//input[@id='diastolic'])[2]");
	By BP_Comments = By.xpath("(//input[@id='bp_comments'])[2]");
	By Heart_Rate = By.xpath("(//input[@id='heart_rate'])[2]");
	By Glucose = By.xpath("(//input[@id='glucose'])[2]");
	By Glucose_Comments = By.xpath("(//input[@id='glucose_comments'])[2]");
	By Fasting_Radio = By.xpath("(//div[@id='fasting']/div)[3]");
	By Temperature = By.xpath("(//input[@id='temperature'])[2]");
	By Temperature_Comments = By.xpath("(//input[@id='temperature'])[2]");
	By Pain = By.xpath("(//select[@id='pain'])[2]");
	By Pain_Comments = By.xpath("(//select[@id='pain'])[2]");
	By Related_Condition = By.xpath("(//select[@id='measurement_problem_item_list'])[2]");
	By Meadication_Save = By.xpath("(//a[contains(text(),'Save')])[6]");
	
	

	public void measurement() throws Exception {
		try {
			
			performAction = new ActionKeywords(driver);
			performAction.click(Add_Measurement, "Clicked on Add Measurement");
			performAction.wait(3000, "Save wait");
			performAction.click(Reading_Taken_date, "Clicked on Reading Taken Date");
			performAction.clear(Reading_Taken_date, "Cleared Reading taken date");
			performAction.enter(Reading_Taken_date, "04/20/2018", "Entered date");
			performAction.enter(Height_in_feet, CommonMethods.randominteger(9, 1), "Entered height in feet");
			performAction.enter(Height_in_Inches, CommonMethods.randominteger(9, 1), "Entered height in inches");
			performAction.enter(Height_Notes, "HeightNotes" + CommonMethods.randaomstring(10),
					"Entered height in notes");
			performAction.enter(Weight, CommonMethods.randominteger(90, 10), "Entered Weight");
			performAction.enter(Weight_Comments, "Weightcomments" + CommonMethods.randaomstring(12),
					"Entered Weight Comments");
			performAction.enter(BP_Systole, CommonMethods.randominteger(90, 10), "Entered systole");
			performAction.enter(BP_Diastole, CommonMethods.randominteger(90, 10), "Entered diastole");
			performAction.enter(BP_Comments, "BPComments" + CommonMethods.randaomstring(12), "Entered BP comments");
			performAction.enter(Heart_Rate, CommonMethods.randominteger(90, 10), "Entered Heart rate");
			performAction.enter(Glucose, CommonMethods.randominteger(90, 10), "Entered Glucose");
			performAction.enter(Glucose_Comments, "Glucose Comments" + CommonMethods.randaomstring(10),
					"Entered Glucose comments");
			performAction.click(Fasting_Radio, "Clicked on fasting radio ");
			performAction.enter(Temperature, "98", "Entered temperature");
			performAction.enter(Temperature_Comments, "Temperature Comments" + CommonMethods.randaomstring(10),
					"Entered Temperature commenta");
			performAction.select(Pain, 1, "Selected pain");
			performAction.enter(Pain_Comments, "Pain Comments" + CommonMethods.randaomstring(10),
					"Entered pain comments");
			performAction.select(Related_Condition, 1, "Entered related condition");
			performAction.click(Meadication_Save, "Clicked on Medication save");
		} catch (Exception e) {
			throw new RuntimeException("measurement exception");
		}

	}

}
