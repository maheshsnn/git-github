package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.base.ActionKeywords;
import com.utility.ExcelReadandWritedata;

public class Allergies {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public Allergies(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * Allergy
	 */
	By Allergiestab = By.xpath("//a[contains (text(),'Allergies')]");
	By DrugAllergy = By.xpath("//button[@id='allergen_drug']");
	By AllergenName = By.xpath("//input[@id='medical_item_name_field']");
	By AllergySeverity = By.xpath("//img[@alt='Moderate']");
	By Calendar = By.xpath("//input[@id='first_observed_date']");
	By CalendarClick = By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[1]/td[2]/a");
	By Reactions = By.xpath("//input[@id='reaction_symptoms']");
	By RelatedMedications = By.xpath("//select[@id='allergy_medications']");
	By Notestobeenterandwaited = By.xpath("//textarea[@id='other_details_field']");
	By SaveAllergy = By.xpath("//*[@id='save_medical_item']");
	By Allergensavedlist = By.xpath("//*[@id='medical_item_listing']/ul[1]/li[2]/span");
	By Allergencheckbox = By.xpath("//div[@class='checkbox']");
	By AllergyInactivefirstperson = By.xpath("(//span[@class='medical_item_description inactive'])[1]");
	By AllergegyCheckboxchecked = By.xpath("//div[@class='checkbox checked']");
	By AllergyTrashIcon = By.xpath("//div[@id='remove_medical_item']");
	By AllergenPopup = By.xpath("(//button[@value='1'])[2]");

	public void allergyinfo() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Allergiestab, "Allergies tab is clicked");
			performAction.clickandwait(DrugAllergy, "Drug allergy is clicked");
			performAction.enterandwait(AllergenName, ExcelReadandWritedata.Readcell(58, 0),
					"Allergen name is enterandwaited");
			performAction.clickandwait(AllergySeverity, "Allergy severity is clicked");
			performAction.enterandwait(Calendar, "02/02/2018", "Calendar date is enterandwaited");
			performAction.clickandwait(Reactions, "Reactions is clicked");
			performAction.enterandwait(Reactions, "Coughing", "Reactions is enterandwaited");
			performAction.enterandwait(RelatedMedications, ExcelReadandWritedata.Readcell(59, 0),
					"Related medications is enterandwaited");
			performAction.enterandwait(Notestobeenterandwaited, ExcelReadandWritedata.Readcell(60, 0),
					"Notes is enterandwaited");

		} catch (Exception e) {
			throw new RuntimeException("exception in allergy info");
		}
	}

	public void saveallergybutton() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(SaveAllergy, "Allergy is saved");
		} catch (Exception e) {
			throw new RuntimeException("exception in allergy button");
		}
	}

	public void allergylist() {
		try {
			performAction.clickandwait(Allergensavedlist, "Allergen saved list is clicked");
		} catch (Exception e) {
			throw new RuntimeException("exception in allergy list");
		}
	}

	public void allergycheckbox() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Allergencheckbox, "Allergen checkbox is checked");
		} catch (Exception e) {
			throw new RuntimeException("exception in save allergy check box");
		}
	}

	public void activecheck() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(AllergyInactivefirstperson, "AllergyInactivefirstperson is clicked");
			performAction.clickandwait(AllergegyCheckboxchecked, "AllergegyCheckboxchecked is clicked");
		} catch (Exception e) {
			throw new RuntimeException("exception in active check");
		}
	}

	public void trashicon() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(AllergyTrashIcon, "Trashicon is clicked");
		} catch (Exception e) {
			throw new RuntimeException("exception in active check");
		}
	}

	public void allergypopup() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.mouseOver(AllergenPopup, "mouse over the pop up");
			performAction.clickandwait(AllergenPopup, "pop up is handeled");
		} catch (Exception e) {
			throw new RuntimeException("exception in allergypopup");
		}
	}
}
