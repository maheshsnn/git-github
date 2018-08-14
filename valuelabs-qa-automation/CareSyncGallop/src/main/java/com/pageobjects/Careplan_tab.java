package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.base.ActionKeywords;
import com.utility.CommonMethods;
import com.utility.ExcelReadandWritedata;

public class Careplan_tab {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public Careplan_tab(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for CarePlan
	 */
	By CarePlantab = By.xpath("//a[contains(text(),'Care Plan')]");
	By Taskdropdown = By.xpath("//img[@alt='Select Item Type']");
	By Tasktablist = By.xpath("//img[@alt='Task']");
	By TaskTextArea = By.xpath("//textarea[@class='item_text new']");
	By ProcedureTab = By.xpath("//img[@class='link_procedure new']");
	By ProcedureName = By.xpath("(//input[@name='procedureName'])[2]");
	By Careplansavebutton = By.xpath("(//li[@class='flyout_done'])[3]");
	By Attach_Tag = By.xpath("//*[@title='Attach an item']");
	By AttachTag_checkbox = By.xpath("(//*[@id='is_preventive_health']/div[1])[2]");
	By AppointmentConditionsAttachTag = By.xpath("(//select[@id='person_problem'])[2]");
	By Calendardropdown = By.xpath("//img[@class='attach_schedule new']");
	By CalendarDate = By.xpath("(//input[@class='attach_schedule_date new js-trackDirty'])[2]");
	By CareplanCalendarsavebutton = By.xpath("(//button[@class='bw_button done float_right'])[3]");
	By GreenAddButton = By.xpath("//div[@id='add_item']");
	By AnyCareplan = By.xpath("//*[@id='items_container']/div[2]/div[1]/div[1]");
	By CarePlanEditor = By.xpath("//img[@class='comment_indicator']");
	By CareplanTextArea = By.xpath("(//textarea[@class='add_comment_text'])[1]");
	By CareplanAddComment = By.xpath("//div[@class='add_comment_button']");
	By CareplanCommentDelete = By.xpath("(//img[@class='delete_comment'])[1]");
	By CommentDeletionPopup = By.xpath("//button[@value='1']");
	By Careplandeleteicon = By.xpath("//img[@class='delete_item']");
	By ToggleShowCompleted = By.xpath("//input[@class='on_off_toggle_button']");

	public void careplan() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(CarePlantab, "CarePlan is clicked");
			performAction.clickandwait(Taskdropdown, "Taskdrop down is clicked");
			performAction.clickandwait(Tasktablist, "Task is clicked from the drop down");
		} catch (Exception e) {
			throw new RuntimeException("exception at task careplan");
		}

	}

	public void task_textarea() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.enterandwait(TaskTextArea, CommonMethods.randaomstring(10), "Task is entered");
		} catch (Exception e) {
			throw new RuntimeException("exception at task textarea");
		}
	}

	public void procedure() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(ProcedureTab, "Procedure is clicked");
			performAction.enterandwait(ProcedureName, ExcelReadandWritedata.Readcell(65, 0), "Procedure is entered");
			performAction.clickandwait(Careplansavebutton, "SAve button is clicked");
		} catch (Exception e) {
			throw new RuntimeException("exception at care plan procedure");
		}
	}

	public void Attach_Tag() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Attach_Tag, "Clicked on attach_tag");
			performAction.clickandwait(AttachTag_checkbox, "Attach tag is clicked");
			performAction.selectandwait(AppointmentConditionsAttachTag, "sada", "Condition tag is Selected");
			performAction.clickandwait(Careplansavebutton, "SAve button is clicked");
		} catch (Exception e) {
			throw new RuntimeException("exception at care plan attach tag");
		}

	}

	public void calender() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Calendardropdown, "Calendardrop down is clicked");
			performAction.enterandwait(CalendarDate, "02/02/18", "Date is entered");
			performAction.clickandwait(CareplanCalendarsavebutton, "Calendar is saved");
		} catch (Exception e) {
			throw new RuntimeException("exception at calender");
		}
	}

	public void addbutton() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(GreenAddButton, "Green Add button is clicked");
		} catch (Exception e) {
			throw new RuntimeException("exception at addbutton");
		}
	}

	public void addComments() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(AnyCareplan, "Any careplan is clicked");
			performAction.jsclick(CarePlanEditor, "Careplan editor is clicked");
			performAction.enterandwait(CareplanTextArea, "Careplan Text", "Careplan text is entered");
			performAction.jsclick(CareplanAddComment, "Comment is added");
		} catch (Exception e) {
			throw new RuntimeException("exception at addComments");
		}

	}

	public void commentsDelete() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.wait(2000, "Wait time");
			performAction.clickandwait(CareplanCommentDelete, "CareplanCommentDelete is clicked");
			performAction.clickandwait(CommentDeletionPopup, "pop up is handeled");
			performAction.clickandwait(Careplandeleteicon, "Careplandeleteicon is clicked");
		} catch (Exception e) {
			throw new RuntimeException("exception at commentDelete");
		}
	}

	public void deleteTask() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(CommentDeletionPopup, "Pop up is handeled");
			performAction.clickandwait(ToggleShowCompleted, "Toggle is clicked");
		} catch (Exception e) {
			throw new RuntimeException("exception at deletetask");
		}
	}
}
