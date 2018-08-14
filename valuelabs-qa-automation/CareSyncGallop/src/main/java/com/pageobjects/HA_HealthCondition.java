package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.ExcelReadandWritedata;

public class HA_HealthCondition {
	WebDriver driver;
	ActionKeywords performAction;

	public HA_HealthCondition(WebDriver driver) {
		this.driver = driver;
	}

	By healthConditionstab = By.xpath("//a[contains(text(),'Health Conditions')]");
	By NameofHealthCondition = By.xpath("//input[@id='medical_item_name_field']");
	By ProviderListfromHealthCondition = By.xpath("//select[@id='diagnosed_by_provider_field']");
	By WhendiagonisedHealthCondition = By.xpath("//input[@id='diagnosed_when_date_field']");
	By date = By.xpath("(//a[@class='ui-state-default'])[1]");
	By enterandwaitingNotesHealthConditions = By.xpath("//textarea[@id='other_details_field']");
	By AddnewHealthCondition = By.xpath("//a[@id='medications_add_new']");
	By NewMedicationname = By.xpath("(//input[@name='medicationName'])[2]");
	By NewMedicationDosage = By.xpath("(//input[@name='dosage'])[2]");
	By NewMedicationQuantity = By.xpath("(//input[@name='quantity'])[2]");
	By NewMedicationunit = By.xpath("(//input[@name='medicationUnitName'])[2]");
	By NewMedicationWhenhowoften = By.xpath("(//select[@name='frequencyId'])[2]");
	By NewMedicationWhenPrescribed = By.xpath("(//input[@name='whenPrescribed'])[2]");
	By NewMedicationTextArea = By.xpath("(//textarea[@name='comments'])[2]");
	By NewMedicationSavebutton = By.xpath("(//li[@class='flyout_done'])[2]");
	By SAvedHealthConditionlist = By.xpath("(//*[@id='medical_item_listing']/li/div/div[1])[1]");
	By TrashiconHealthConditions = By.xpath("//div[@id='remove_medical_item']");
	By AcceptingDeletion = By.xpath("(//button[@value='1'])");

	public void health_condition() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(healthConditionstab, "Health condition tab is clicked");
			performAction.enterandwait(NameofHealthCondition, ExcelReadandWritedata.Readcell(51, 0),
					"Name of health condition is enterandwaited");
			performAction.selectandwait(ProviderListfromHealthCondition, "Self",
					"Provider from list is selectandwaited");
			performAction.click(WhendiagonisedHealthCondition, "When diagnosed");
			performAction.clickandwait(date, "date is clicked");
			performAction.enterandwait(enterandwaitingNotesHealthConditions, ExcelReadandWritedata.Readcell(52, 0),
					"Notes is enterandwaited");
			performAction.clickandwait(AddnewHealthCondition, "Add new health condition is clicked");
		} catch (Exception e) {
			throw new RuntimeException("exception in health condition");
		}
	}

	public void addmedication() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.enterandwait(NewMedicationname, ExcelReadandWritedata.Readcell(53, 0),
					"New medication name is enterandwaited");
			performAction.enterandwait(NewMedicationDosage, ExcelReadandWritedata.Readcell(54, 0),
					"Dosage is enterandwaited");
			performAction.enterandwait(NewMedicationQuantity, ExcelReadandWritedata.Readcell(55, 0),
					"Quantity is enterandwaited");
			performAction.enterandwait(NewMedicationunit, "Pill(s)", "Medication unit is enterandwaited");
			performAction.selectandwait(NewMedicationWhenhowoften, "As Needed (PRN)", "How often is enterandwaited");
			performAction.enterandwait(NewMedicationWhenPrescribed, "10/10/2017", "Date is enterandwaited");
			performAction.enterandwait(NewMedicationTextArea, ExcelReadandWritedata.Readcell(57, 0),
					"Text enterandwaited in text area");
			performAction.clickandwait(NewMedicationSavebutton, "New medication save button is clicked");
		} catch (Exception e) {
			throw new RuntimeException("exception in add medication");
		}
	}

	public void savemedication() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(SAvedHealthConditionlist, "Saved health condition list is clicked");
		} catch (Exception e) {
			throw new RuntimeException("exception in add save medication");
		}
	}

	public void trashicon() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(TrashiconHealthConditions, "Trashicon is clicked");
		} catch (Exception e) {
			throw new RuntimeException("exception in trash icon");
		}
	}

	public void acceptingdeletion() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.mouseOver(AcceptingDeletion, "Pop up is mouse overed");
			performAction.clickandwait(AcceptingDeletion, "Pop up is accepted");
		} catch (Exception e) {
			throw new RuntimeException("exception in accepting deletion");
		}
	}
}
