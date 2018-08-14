package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class Appointments {
	WebDriver driver;
	ActionKeywords performAction;

	public Appointments(WebDriver driver) {
		this.driver = driver;
	}

	By Appointment_link = By.xpath("//*[contains(text(),'Appointments')]");
	By Time_Picker = By.xpath("//*[@id='appt_start_time']");
	By App_staus = By.xpath("//*[@id='appt_status']");
	By providers_dropdown = By.xpath("//*[@id='providers']");
	By Appointment_Reason = By.xpath("//*[@id='appt_reason']");
	By Health_Condition_Dropdown = By.xpath("(//*[@id='health_conditions'])[1]");
	By Appointment_types = By.xpath("//*[@id='appt_type']");
	By Realted_Medication = By.xpath("//*[@id='medications_add_new']");
	By Primary_procedure = By.xpath("//*[@id='appt_primary_procedure']");
	By Outcome_Results = By.xpath("//*[@id='appt_outcomes_results']");
	By related_procecuder = By.xpath("//select[@id='procedures']");
	By Provider_Notes = By.xpath("//textarea[@id='appt_notes_provider']");
	By Save_Appointment = By.xpath("//input[@id='appt_save']");
	By View_share = By.xpath("//button[@id='view_share']");
	By Generate_Report = By.xpath("//button[@class='generate_report bw_button']");
	By Back = By.xpath("//input[@id='backToPage']");
	By Past = By.xpath("//*[@id='past_button']");
	By First_Past_appoint = By.xpath("//*[@class='entityList js-entityList']/li[1]");
	By App_startdate = By.xpath("//*[@id='appt_start_date']");

	/**
	 *
	 * @throws Exception
	 */

	public void addAppointment_MandatoryFields() {
		
		try {
			performAction = new ActionKeywords(driver);
			CommonMethods.pageload(driver);
			performAction.click(Appointment_link, "Clicked on Application link");
			performAction.click(App_startdate, "Clicked on App start date");
			CommonMethods.calenderdatepicker(driver, "2");
			performAction.click(Time_Picker, "Clicked on Time Picker");
			performAction.arrow_Down(Time_Picker, "Selecting Time from list");
			performAction.key_Enter(Time_Picker, "Clicked on enter from keyboard");
			performAction.select(App_staus, 1, "Selected app status from list");

		} catch (Exception e) {
			throw new RuntimeException();
		}

	}

	public void selectProvider() throws Exception {

		try {
			performAction = new ActionKeywords(driver);
			performAction.select(providers_dropdown, 1, "Selecting providers dropdown");
		} catch (Exception e) {
			throw new RuntimeException("Exception at selectProvider");
		}
	}

	public void selectAppointmentType(String strAppType) throws Exception {

		try {
			performAction = new ActionKeywords(driver);
			performAction.selectandwait(Appointment_types, strAppType, "Selected Appointment type");
		} catch (Exception e) {
			throw new RuntimeException("Exception at selectAppointmentType");
		}
	}

	public void enterAppointment_Reason() throws Exception {

		try {
			performAction = new ActionKeywords(driver);
			performAction.enterandwait(Appointment_Reason, "AppointmentReason" + CommonMethods.randaomstring(10),
					"Entering aapoint reason");
		} catch (Exception e) {
			throw new RuntimeException("Exception at AppointmentReason");
		}
	}

	public void selectHealth_Condition() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.select(Health_Condition_Dropdown, 1, "Selected helath condition drop down");
		} catch (Exception e) {
			throw new RuntimeException("Exception at Selected helath condition drop down");
		}
	}

	public void enterprimary_procedure() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.enter(Primary_procedure, "primaryprocedure" + CommonMethods.randaomstring(10),
					"Selected primary procedure");
		} catch (Exception e) {
			throw new RuntimeException("Exception at Primary Procedure");
		}
	}

	public void enterOutcome_area() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.enterandwait(Outcome_Results, "outcomearea" + CommonMethods.randaomstring(10),
					"Enter outcome result");
		} catch (Exception e) {
			throw new RuntimeException("Exception at Outcome Area");
		}
	}

	public void selectRelated_Procedure() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.select(related_procecuder, 1, "Selected procedure dropdown");
		} catch (Exception e) {
			throw new RuntimeException("Exception at Related Procedure");
		}
	}

	public void enterProvider_Notes() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.enter(Provider_Notes, "Providers Notes" + CommonMethods.randaomstring(10),
					"Entered provider notes");
		} catch (Exception e) {
			throw new RuntimeException("Exception at Providers Notes");
		}

	}

	public void clickSave_Appointment() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.click(Save_Appointment, "Clicked on save appointment");
		} catch (Exception e) {
			throw new RuntimeException("Exception at Save Appointment");
		}
	}

	public void clickAppointment_link() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Appointment_link, "Clicked on appointments links");
		} catch (Exception e) {
			throw new RuntimeException("Exception at Appointment Links");
		}
	}

	public void clickView_share() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(View_share, "Clicked on View and share");
		} catch (Exception e) {
			throw new RuntimeException("Exception at View Share");
		}
	}

	public void clickGenerate_Report() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.click(Generate_Report, "Clicked on generate report");
		} catch (Exception e) {
			throw new RuntimeException("Exception at Generate Report");
		}
	}

	public void clickPast() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.click(Past, "Clicked on pass button");
		} catch (Exception e) {
			throw new RuntimeException("Exception at Past");
		}
	}

	public void clickFirst_Past_appoint() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.click(First_Past_appoint, "Clicked on first past button");
		} catch (Exception e) {
			throw new RuntimeException("Exception at First Past Appoint");
		}
	}

	public void selectApp_staus(String strAppstatus) throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.select(App_staus, strAppstatus, "Selected appointment status");
		} catch (Exception e) {
			throw new RuntimeException("Exception at App staus");
		}
	}

	public void clearApp_startdate() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clear(App_startdate, "Clicked on app start date");
		} catch (Exception e) {
			throw new RuntimeException("Exception at App start date");
		}
	}

	public void clickApp_startdate() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.click(App_startdate, "Clicked on start date");
		} catch (Exception e) {
			throw new RuntimeException("Exception at App Start Date");
		}
	}

}
