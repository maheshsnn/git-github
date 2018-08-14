package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class Member_Login_6 {

	WebDriver driver;
	ActionKeywords performAction;

	public Member_Login_6(WebDriver driver) {
		this.driver = driver;
	}

	By Myday = By.xpath("//div[@id='content_section']/div/span");
	By NeedMedication = By.xpath("//div[@id='content_section']/div[2]/ul/li/span");
	By Medicationcheckbox = By.xpath("//div[@id='medListContainer']/div/ul/li/div/img");
	By Doneclick = By.xpath("//input[@id='done']");
	By Notnow = By.xpath("//div[@id='popup']/div[4]/button");
	By Medicationreminder = By.xpath("//div[@id='content_section']/div[2]/ul/li[2]/span");
	By Caremanager = By.xpath("//li[@id='care_manager']/a");
	By Appointments = By.xpath("//div[@id='content_section']/div[2]/ul/li[3]/span");
	By TrackMeasurements = By.xpath("//div[@id='content_section']/div[2]/ul/li[4]/span");
	By Caresplan = By.xpath("//div[@id='content_section']/div[2]/ul/li[5]/span");
	By TypeIcon = By.xpath("//img[@id='item_type_icon']");
	By Type = By.xpath("//ul[@id='item_type_menu_list']/li/span");
	By Textarea = By.xpath("//div[@id='new_item_container']/div[2]/div[2]/textarea");
	By AddButton = By.xpath("//div[@id='add_item']/span");
	By HealthProfile = By.xpath("//li[@id='health_profile']/a");
	By PersonalInfoTitle = By.xpath("//div[@id='personal_info_tile']");
	By ProvidersTitles = By.xpath("//div[@id='providers_tile']");
	By Summarybutton = By.xpath("//a[contains(text(),'Summary')]");
	By HealthconditionTitle = By.xpath("//div[@id='health_conditions_tile']");
	By MedicationsTitile = By.xpath("//div[@id='medications_tile']");
	By AllergiesTitle = By.xpath("//div[@id='allergies_tile']");
	By DocumentsTitle = By.xpath("//div[@id='documents_tile']");
	By ApptsTitle = By.xpath("//div[@id='appts_tile']");
	By Emergencycontacts = By.xpath("//div[@id='emergency_contacts_tile']");
	By ViewandShare = By.xpath("//input[@id='view_share']");
	By ViewandShare_child = By.xpath("//button[@type='button']");
	By Downloadbluebutton = By.xpath("//input[@id='download_blueButton']");
	By EmailButton = By.xpath("//input[@id='email_blueButton']");
	By Faxbutton = By.xpath("//input[@id='fax_it_now']");
	By Backtopage = By.xpath("//input[@id='backToPage']");
	By HistoryButton = By.xpath("//span[@id='history_button']");
	By Filterrange = By.xpath("//div[@id='filter_options']/div[2]/ul/li/div/div/span");
	By Daterangeone = By.xpath("//li[@id='option_daterange_1']");
	By Signout = By.xpath("//div[@id='navigation-menu']/span[3]");
	By DayOne = By.xpath("//a[contains(text(),'My Day')]");

	
	public void myDay() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Myday, "Clicked on MyDay");
		} catch (Exception e) {
			throw new RuntimeException("exception in myday");
		}
	}

	public void medications() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(NeedMedication, "Clicked on Need Medication");
		} catch (Exception e) {
			throw new RuntimeException("exception in medication");
		}
	}

	public void medication_checkbox() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Medicationcheckbox, "Clicked on Medication");
		} catch (Exception e) {
			throw new RuntimeException("exception in medication checkbox");
		}
	}

	public void done_click() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Doneclick, "Clicked on Done");
		} catch (Exception e) {
			throw new RuntimeException("exception in done click");
		}
	}

	public void notNow_popup() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.click(Notnow, "Clicked on Notnow");
		} catch (Exception e) {
			throw new RuntimeException("exception in not now popup");
		}
	}

	public void medication_reminder() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Medicationreminder, "Clicked on Medicationreminder");
		} catch (Exception e) {
			throw new RuntimeException("exception in medication reminder");
		}
	}

	public void care_manager() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Caremanager, "Clicked on Caremanager");
		} catch (Exception e) {
			throw new RuntimeException("exception in care manager");
		}
	}

	public void appointments() {

		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Appointments, "Clicked on Appointments");
		} catch (Exception e) {
			throw new RuntimeException("exception in appointments");
		}
	}

	public void track_measurement() {

		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(TrackMeasurements, "Clicked on TrackMeasurements");
		} catch (Exception e) {
			throw new RuntimeException("exception in track measurements");
		}
	}

	public void care_splan() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Caresplan, "Clicked on caresplan");
		} catch (Exception e) {
			throw new RuntimeException("exception in caresplan");
		}

	}

	public void type_icon() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(TypeIcon, "Clicked on Typeicon");
		} catch (Exception e) {
			throw new RuntimeException("exception in TypeIcon");
		}
	}

	public void type() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Type, "Clicked on Type");
		} catch (Exception e) {
			throw new RuntimeException("exception in Type");
		}
	}

	public void textarea() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.enterandwait(Textarea, CommonMethods.randaomstring(10), "Clicked on Textarea");
		} catch (Exception e) {
			throw new RuntimeException("exception in Textarea");
		}
	}

	public void addbutton() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(AddButton, "Clicked on Addbutton");
		} catch (Exception e) {
			throw new RuntimeException("exception in addbutton");
		}
	}

	public void day_one() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(DayOne, "Clicked on Dayone");
		} catch (Exception e) {
			throw new RuntimeException("exception in DayOne");
		}
	}

	public void health_profile() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(HealthProfile, "Clicked on HealthProfile");
		} catch (Exception e) {
			throw new RuntimeException("exception in  health profile");
		}
	}

	public void personal_info() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(PersonalInfoTitle, "Clicked on PersonalInfoTitle");
		} catch (Exception e) {
			throw new RuntimeException("exception in personal info");
		}
	}

	public void providers_titles() {

		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(ProvidersTitles, "Clicked on ProvidersTitles");
		} catch (Exception e) {
			throw new RuntimeException("exception in providers titles");
		}
	}

	public void summary_button() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Summarybutton, "Clicked on Summarybutton");
		} catch (Exception e) {
			throw new RuntimeException("exception in summary button");
		}
	}

	public void healthcondition_title() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(HealthconditionTitle, "Clicked on HealthconditionTitle");
		} catch (Exception e) {
			throw new RuntimeException("exception in health condition title");
		}
	}

	public void medication_title() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(MedicationsTitile, "Clicked on MedicationsTitile");
		} catch (Exception e) {
			throw new RuntimeException("exception in health medication title");
		}
	}

	public void allergies_title() {

		try {
			performAction = new ActionKeywords(driver);
			performAction.wait(2000, "Wait time at allergies");
			performAction.clickandwait(AllergiesTitle, "Clicked on AllergiesTitle");
		} catch (Exception e) {
			throw new RuntimeException("exception in allergies title");
		}
	}

	public void document_title() {

		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(DocumentsTitle, "Clicked on DocumentsTitle");
		} catch (Exception e) {
			throw new RuntimeException("exception in document title");
		}
	}

	public void appts_title() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(ApptsTitle, "Clicked on ApptsTitle");
		} catch (Exception e) {
			throw new RuntimeException("exception in aapt title");
		}
	}

	public void emergency_contacts() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Emergencycontacts, "Clicked on Emergencycontacts");
		} catch (Exception e) {
			throw new RuntimeException("exception in aapt emergency contact");
		}
	}

	public void view_share() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(ViewandShare, "Clicked on ViewandShare");
		} catch (Exception e) {
			throw new RuntimeException("exception in view share");
		}
	}

	public void view_child() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(ViewandShare_child, "Clicked on ViewandShare_child");
		} catch (Exception e) {
			throw new RuntimeException("exception in view share child");
		}
	}

	public void download_bluebutton() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Downloadbluebutton, "Clicked on Downloadbluebutton");
		} catch (Exception e) {
			throw new RuntimeException("exception in download blue button");
		}
	}

	public void email_button() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(EmailButton, "Clicked on EmailButton");
		} catch (Exception e) {
			throw new RuntimeException("exception in Email Button");
		}
	}

	public void fax_button() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Faxbutton, "Clicked on Faxbutton");
		} catch (Exception e) {
			throw new RuntimeException("exception in fax button");
		}
	}

	public void back_page() {
		try {
			performAction.clickandwait(Backtopage, "Clicked on Backtopage");
		} catch (Exception e) {
			throw new RuntimeException("exception in Back to page");
		}
	}

	public void history_button() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(HistoryButton, "Clicked on HistoryButton");
		} catch (Exception e) {
			throw new RuntimeException("exception in History Button");
		}
	}

	public void filter_range() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Filterrange, "Clicked on Filterrange");
		} catch (Exception e) {
			throw new RuntimeException("exception in Filterrange");
		}
	}

	public void daterange_one() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Daterangeone, "Clicked on Daterangeone");
		} catch (Exception e) {
			throw new RuntimeException("exception in Daterangeone");
		}
	}

}
