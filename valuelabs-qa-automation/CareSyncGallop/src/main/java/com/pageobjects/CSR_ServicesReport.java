package com.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class CSR_ServicesReport {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public CSR_ServicesReport(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for Services Report
	 */
	By ServicesReport = By.xpath("//button[@id='ccm_report']");
	By CSREnterprise = By.xpath("//select[@id='ccm_organization_dropdown']");
	By ServiceReportrunbutton = By.xpath("//input[@id='search_btn']");
	By ReportOptions = By.xpath("(//span[@class='js-chevron chevron down'])");
	By ReportoptionsBillingstatusup = By.xpath("(//span[@class='js-chevron chevron'])");
	By CCMbillablecheckbox = By.xpath("//div[@id='ccm_billable']");
	By CMMbillabletocheckthebox = By.xpath("(//div[@class='checkbox'])[1]");
	By Billingstatusdropdown = By.xpath("(//span[@class='js-chevron chevron down'])[2]");
	By Table = By.xpath("//*[@id='report_results']/div/div[2]/div[1]/div[1]/ul/li");
	By CSRReEnrollbutton = By
			.xpath("//span[@class='planEditLink js-planEditLink unenrollCCMReEnrollLink  js-unenrollCCMReEnrollLink']");
	By Backbutton = By.xpath("//input[@id='backToPage']");
	By CSRDownloadbutton = By.xpath("//input[@id='download_ccm_report']");
	By CSRAddminutesicon = By.xpath("(//img[@class='js-addIcon addIcon'])[1]");
	By CSRTimeEntry = By.xpath("(//input[@class='js-timeValue js-trackDirty validatedInput js-initialFocus'])[2]");
	By CSRTimeNotes = By.xpath("(//textarea[@id='js-timeValueNotes'])[2]");
	By CSRTimeAdd = By.xpath("(//button[@class='js-add bw_button_green float_right'])[2]");
	By OneMoIcon = By.xpath("//*[@id='report_results']/div/div[2]/div[1]/div[1]/ul/li");
	By CSRHoldtext = By.xpath("//span[@class='planEditLink js-planEditLink holdCCMLink js-holdCCMLink']");
	By CSRSholdcheckbox = By.xpath("(//div[@class='checkbox_label'])[25]");
	By CSRHoldaccount = By.xpath("//button[@class='js-save bw_button']");
	By CSRActivatebutton = By
			.xpath("//span[@class='planEditLink js-planEditLink holdCCMUnsuspendLink js-holdCCMUnsuspendLink']");
	By CSRHOLDTCMCheckboxbutton = By.xpath("(//div[@class='checkbox_label'])[31]");
	By CSRHOLDNOTES = By.xpath("//textarea[@class='ccm_flyout-notes js-careCoordinationNotes js-trackDirty']");
	By CSRAdmitDate = By.xpath("//input[@id='admit_date']");
	By CSRDischargedate = By.xpath("//input[@id='discharge_date']");
	By DefaultState = By.xpath("(//a[@class='ui-state-default'])[6]");
	By MovepatienttoTCM = By.xpath("//*[contains(text(),'Move Patient to TCM')]");
	By CSREdit = By.xpath("(//*[contains(text(),'Edit')])[1]");
	By CSRTCMsaveandclose = By
			.xpath("//button[@class='bw_button tcmDatesModal-button flexItem-grow adjacent js-saveDates']");
	By CSRRemovehold = By.xpath("//button[@class='bw_button tcmDatesModal-button flexItem-grow adjacent js-save']");
	By CSRunenroll = By.xpath(
			"//span[@class='planEditLink js-planEditLink unenrollCareCoordinationLink js-unenrollCareCoordinationLink']");
	By CSRNostayEnrolled = By.xpath("//button[@value='0']");
	By Viewandshare = By.xpath("//*[contains(text(),'View & Share')]");
	By Backbtton = By.xpath(
			"//input[@class='bw-button adjacent viewAndShare-output js-viewAndShare-output viewAndShare-output-back']");

	/**
	 * @param ServicesReport
	 * @throws Exception
	 */
	public void ServicesReport() throws Exception {

		try {
			performAction = new ActionKeywords(driver);
			performAction.wait(7000, "wait time is added");
			performAction.clickandwait(ServicesReport, "Services report is clicked");
			performAction.selectandwait(CSREnterprise, "2016 CCM Practice", "CSREnterprise is selected");
			performAction.clickandwait(ServiceReportrunbutton, "Run report is clicked");
			performAction.clickandwait(ReportOptions, "ReportOptions is clicked");
			performAction.clickandwait(ReportoptionsBillingstatusup, "drop down is clicked");
			performAction.clickandwait(ServiceReportrunbutton, "Run button is clicked");
			performAction.clickandwait(ReportoptionsBillingstatusup, "CCM drop down is clicked");
			performAction.clickandwait(CCMbillablecheckbox, "Check box is checked");
			performAction.clickandwait(CMMbillabletocheckthebox, "Check box is unchecked");
			performAction.clickandwait(Billingstatusdropdown, "drop down is clicked");
			performAction.clickandwait(ServiceReportrunbutton, "Run button is clicked");
			performAction.clickandwait(Viewandshare, "View and share is clicked");
			performAction.clickandwait(Backbtton, "View and share is clicked");
			performAction.wait(3000, "Wait time added");

			// logic//
			List<WebElement> table = driver
					.findElements(By.xpath("//*[@id='report_results']/div/div[2]/div[1]/div[1]/ul/li"));
			int A = table.size();
			System.out.println(A);
			for (int i = 1; i <= table.size(); i++) {
				performAction.wait(3000, "Wait time added");
				performAction.browserScroll(500, "window is scrolled");
				performAction.wait(3000, "Wait time added");
				WebElement abc = driver.findElement(
						By.xpath("//*[@id='report_results']/div/div[2]/div[1]/div[1]/ul/li[" + i + "]/div[6]/img[1]"));
				abc.click();
				System.out.println("Within the list");
				performAction.wait(4000, "Wait time is added");

				// condition

				if (performAction.verify(CSRReEnrollbutton, "CSRReEnrollbutton is displayed")) {
					performAction.wait(3000, "Wait time is added");
					performAction.browserScroll(600, "Window is scrolled down");
					performAction.wait(3000, "Wait time is added");
					performAction.clickandwait(ServicesReport, "Services Report is clicked");
					performAction.wait(3000, "Wait time is added");
				} else {
					break;
				}
			}
			performAction.clickandwait(Backbutton, "Backbutton is clicked");
			performAction.clickandwait(Viewandshare, "View and share is clicked");
			performAction.wait(3000, "Wait time added");
			performAction.clickandwait(CSRDownloadbutton, "CSRDownloadbutton is clicked");
			performAction.clickandwait(Backbtton, "View and share is clicked");
			performAction.wait(3000, "Wait time added");
			performAction.clickandwait(CSRAddminutesicon, "CSRAddminutesicon is clicked");
			performAction.enterandwait(CSRTimeEntry, "4", "CSRTimeEntry is done");
			performAction.browserScroll(500, "Window is scrolled down");
			performAction.enterandwait(CSRTimeNotes, "hello time", "CSRTimeNotes is entered");
			performAction.clickandwait(CSRTimeAdd, "Time is added");
			performAction.clickandwait(CSRAddminutesicon, "CSRAddminutesicon is clicked");
			performAction.clear(CSRTimeEntry, "Time entry is cleared");
			performAction.wait(2000, "Wait time added");
			performAction.enterandwait(CSRTimeEntry, "5", "CSRTimeEntry is done");
			performAction.browserScroll(500, "Window is scrolled down");
			performAction.clear(CSRTimeNotes, "Notes is cleared");
			performAction.wait(2000, "Wait time added");
			performAction.enterandwait(CSRTimeNotes, "hello new time", "CSRTimeNotes is entered");
			performAction.clickandwait(CSRTimeAdd, "Time is added");
			performAction.browserScroll(-500, "Window is scrolled up");
			performAction.wait(2000, "Wait time added");
			performAction.browserScroll(500, "Window is scrolled down");
			performAction.wait(2000, "Wait time added");

			// logic 2
			List<WebElement> table1 = driver
					.findElements(By.xpath("//*[@id='report_results']/div/div[2]/div[1]/div[1]/ul/li"));
			int A1 = table1.size();
			System.out.println(A1);
			for (int j = 1; j <= table.size(); j++) {
				performAction.wait(3000, "Wait time added");
				performAction.browserScroll(400, "window is scrolled down");
				performAction.wait(3000, "Wait time added");
				WebElement abc1 = driver.findElement(
						By.xpath("//*[@id='report_results']/div/div[2]/div[1]/div[1]/ul/li[" + j + "]/div[6]/img[1]"));
				abc1.click();
				System.out.println("Within the list");
				performAction.wait(3000, "Wait time added");
				// condition
				if (performAction.verify(CSRReEnrollbutton, "CSRReEnrollbutton is displayed")) {
					performAction.browserScroll(500, "Window is scrolled down");
					performAction.wait(2000, "Wait time is added");
					performAction.clickandwait(ServicesReport, "Services Report is clicked");
				} else {
					break;
				}
			}
			performAction.browserScroll(100, "window is scrolled down");
			performAction.wait(3000, "Wait time added");
			performAction.clickandwait(CSRHoldtext, "CSRHoldtext is clicked");
			performAction.jsclick(CSRSholdcheckbox, "CSRSholdcheckbox is clicked");
			performAction.wait(3000, "Wait time added");
			performAction.clickandwait(CSRHoldaccount, "CSRHoldaccount is clicked");
			performAction.clickandwait(CSRActivatebutton, "CSRActivatebutton is clicked");
			performAction.clickandwait(CSRHoldtext, "CSRHoldtext is clicked");
			performAction.jsclick(CSRHOLDTCMCheckboxbutton, "TCM checkbox is clicked");
			performAction.wait(3000, "Wait time added");
			performAction.enterandwait(CSRHOLDNOTES, CommonMethods.randaomstring(10), "Hold notes is entered");
			performAction.clickandwait(CSRHoldaccount, "CSRHoldaccount is clicked");
			performAction.enterandwait(CSRAdmitDate, "4/4/2018", "Admit date is entered");
			performAction.clickandwait(CSRDischargedate, "Dischargedate is clicked");
			performAction.enterandwait(CSRDischargedate, "4/10/2018", "discharge date is entered");
			performAction.clickandwait(DefaultState, "Clicked");
			performAction.clickandwait(MovepatienttoTCM, "Move patient to TCM is clicked");
			performAction.clickandwait(CSREdit, "Edit button is clicked");
			performAction.clickandwait(CSRTCMsaveandclose, "CSRTCMsaveandclose is clicked");
			performAction.clickandwait(CSREdit, "Edit button is clicked");
			performAction.clickandwait(CSRRemovehold, "Clicked on CSRRemovehold");
			performAction.clickandwait(CSRunenroll, "CSRunenroll is clicked");
			performAction.clickandwait(CSRNostayEnrolled, "CSRNostayEnrolled is clicked");
			performAction.wait(2000, "Wait time is added");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Exception at ServicesReport");
		}

	}

}
