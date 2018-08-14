package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.ExcelReadandWritedata;

public class Medications {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public Medications(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for Medications
	 */
	By Medicationstab = By.xpath("//a[contains(text(),'Medications')]");
	By AddMedications = By.xpath("//button[@id='add_entity']");
	By Medcationname = By.xpath("//input[@id='medName']");
	By Dosage = By.xpath("//input[@id='dosage']");
	By Quantity = By.xpath("//input[@id='quantity']");
	By Frequency = By.xpath("//select[@id='frequency']");
	By PrescribedBy = By.xpath("//select[@id='providers']");
	By WhenPrescribed = By.xpath("//input[@id='whenPrescribed']");
	By RelatedConditions = By.xpath("//select[@id='personProblems']");
	By Pharmacymedication = By.xpath("//select[@id='pharmacies']");
	By AddmedNotes = By.xpath("//input[@id='otherDetails']");
	By AddNewHealthConditon = By.xpath("//span[@id='add_problem']");
	By NameofHealthCondition = By.xpath("(//input[@name='problemName'])[2]");
	By HealthconditionProvidername = By.xpath("(//*[@id='personProviderId'])[2]");
	By HealthconditonWhenDiagonised = By.xpath("(//input[@name='diagnosedWhen'])[2]");
	By NotesinAddHealthMedication = By.xpath("(//textarea[@name='comments'])[3]");
	By NewMedicationname = By.xpath("(//input[@name='medicationName'])[2]");
	By NewMedicationDosage = By.xpath("(//input[@name='dosage'])[2]");
	By NewMedicationQuantity = By.xpath("(//input[@name='quantity'])[2]");
	By NewMedicationunit = By.xpath("(//input[@name='medicationUnitName'])[2]");
	By NewMedicationWhenhowoften = By.xpath("(//select[@name='frequencyId'])[2]");
	By NewMedicationWhenPrescribed = By.xpath("(//input[@name='whenPrescribed'])[2]");
	By NewMedicationTextArea = By.xpath("(//textarea[@name='comments'])[2]");
	By NewMedicationSavebutton = By.xpath("(//li[@class='flyout_done'])[2]");
	By AddNewMedication = By.xpath("//a[@id='medications_add_new']");
	By SAvedHealthConditionlist = By.xpath("(//*[@id='medical_item_listing']/li/div/div[1])[1]");
	By SaveAddhealthMedication = By.xpath("(//li[@class='flyout_done'])[2]");
	By AddPharmacy = By.xpath("//span[@id='add_pharmacy']");
	By PharmacyName = By.xpath("(//input[@name='pharmName'])[2]");
	By PharmacyNumber = By.xpath("(//input[@type='text'])[19]");
	By PharmacySavebutton = By.xpath("(//button[@class='bw_button font_bold js-save'])[2]");
	By MedicationsSaveButton = By.xpath("//button[@class='bw_button float_right']");
	By EditMedicationname = By.xpath("//input[@id='medName']");
	By RandomAcceptance = By.xpath("//*[@id='popup']/div[4]/button");
	By CheckBoxMedication = By.xpath("//div[@class='checkbox  ']");
	By Listofmedicationsaved = By.xpath("(//li[@class='entityListItem js-entityListItem'])[1]");
	By Listoffadedmedicationsaved = By
			.xpath("(//li[@class='entityListItem js-entityListItem entityListItem-inactive'])[1]");
	By Savedmedicationname = By.xpath("(//div[@class='medListItem-summary selfClear'])[1]");
	By MedicationTrashIcon = By.xpath("//img[@class='saveActions-removeIcon']");
	By ConfirmPopUp = By.xpath("//button[@id='confirm_button_no']");
	By NotConfirmingPopUp = By.xpath("//button[@id='confirm_button_yes']");

	public void medication() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Medicationstab, "Medications tab is clicked");
			performAction.clickandwait(AddMedications, "Add medication is clicked");
			performAction.enterandwait(Medcationname, ExcelReadandWritedata.Readcell(43, 0),
					"Medication name is enterandwaited");
			performAction.enterandwait(Dosage, ExcelReadandWritedata.Readcell(44, 0), "Dosage is enterandwaited");
			performAction.enterandwait(Quantity, ExcelReadandWritedata.Readcell(45, 0), "Quantity is enterandwaited");
			performAction.wait(3000, "wait time");
			performAction.selectandwait(Frequency, "As Needed (PRN)", "Frequency is selected");
			performAction.selectandwait(PrescribedBy, 1, "Prescribed is selected");
			performAction.enterandwait(WhenPrescribed, "03/03/2018", "When prescribed is enterandwaited");
			performAction.selectandwait(RelatedConditions, 1, "RelatedConditions is selected");
			performAction.selectandwait(Pharmacymedication, 1, "Pharmacymedication is selected");
		} catch (Exception e) {
			throw new RuntimeException("exception in medication");
		}
	}
	public void addhealth_condition() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(AddNewHealthConditon, "Add new health condition is clicked");
			performAction.enterandwait(NameofHealthCondition, ExcelReadandWritedata.Readcell(46, 0),
					"NameofHealthCondition is enterandwaited");
			performAction.selectandwait(HealthconditionProvidername, "Diagnosed by", "Provider name is enterandwaited");
			performAction.wait(2000,"wait time");
			performAction.enterandwait(HealthconditonWhenDiagonised, "03/03/2018", "date is enterandwaited");
			performAction.browserScroll(200, "Browser scroll");
			performAction.enterandwait(NotesinAddHealthMedication, ExcelReadandWritedata.Readcell(48, 0),
					"NotesinAddHealthMedication is enterandwaited");
			performAction.clickandwait(SaveAddhealthMedication, "SaveAddhealthMedication is clicked");
		} catch (Exception e) {
			throw new RuntimeException("exception in medication");
		}
	}
	public void add_pharmacy() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(AddPharmacy, "AddPharmacy is clicked");
			performAction.enterandwait(PharmacyName, ExcelReadandWritedata.Readcell(49, 0),
					"Pharmacy name is enterandwaited");
			performAction.enterandwait(PharmacyNumber, ExcelReadandWritedata.Readcell(50, 0),
					"PharmacyNumber is enterandwaited");
			performAction.clickandwait(PharmacySavebutton, "Pharmacy is saved");
			performAction.browserScroll(500, "Window is scrolled");
			performAction.wait(2000, "Wait is added");
		} catch (Exception e) {
			throw new RuntimeException("exception in add pharmacy");
		}
	}
	public void medication_save() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(MedicationsSaveButton, "Medication save button is clicked");
		} catch (Exception e) {
			throw new RuntimeException("exception in medication save");
		}

	}
	public void list_medication_saved() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Listofmedicationsaved, "SAved medication list is clicked");
		} catch (Exception e) {
			throw new RuntimeException("exception in list medication save");
		}
	}
	public void acceptance() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.enterandwait(Medcationname, "new", "Medication name is edit");
			performAction.mouseOver(RandomAcceptance, "Mouse over the pop up");
			performAction.wait(2000, "Wait is added");
			performAction.clickandwait(RandomAcceptance, "Pop up is handeled");
		} catch (Exception e) {
			throw new RuntimeException("exception in acceptance");
		}
	}

	public void checkbox() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.browserScroll(300, "Browser scroll");
			performAction.clickandwait(CheckBoxMedication, "Checkbox is clicked");
		} catch (Exception e) {
			throw new RuntimeException("exception in checkbox");
		}
	}

	public void medication_trashicon() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(MedicationTrashIcon, "Trashicon is clicked");
			performAction.mouseOver(ConfirmPopUp, "Mouse over the pop up");
			performAction.clickandwait(ConfirmPopUp, "Pop up is handeled");
			performAction.browserScroll(-500, "Scrolled down");
			performAction.wait(4000, "Wait is added");
		} catch (Exception e) {
			throw new RuntimeException("exception in medication trash icon");
		}
	}

}