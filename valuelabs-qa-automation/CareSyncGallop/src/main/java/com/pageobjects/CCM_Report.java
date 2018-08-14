package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class CCM_Report {

	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * 
	 * @param driver
	 */
	public CCM_Report(WebDriver driver) {
		this.driver = driver;
	}

	By CCM_report = By.id("ccm_report");
	By CCM_Provider = By.id("ccm_provider_dropdown");
	By CCM_Location = By.id("ccm_location_dropdown");
	By Service_period = By.id("service_period_dropdown");
	By Search_Button = By.id("search_btn");
	By DXtoggle = By.xpath("//input[@value='Show Dx']");
	By CCM_Report_Download = By.id("ccm_report_download_btn");
	By CCM_Dowmload = By.xpath("(//button[@type='button'])[2]");
	By OK_PopUP = By.xpath("//button[@value='0']");

	/**
	 * 
	 * @throws Exception
	 */
	public void CCm_report() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.click(CCM_report, "Clicked on CCM report");
			performAction.select(CCM_Provider, 1, "Selected CCm provider");
			performAction.select(CCM_Location, 1, "Selected CCm Location");
			performAction.select(Service_period, 2, "Selected Service Period");
			performAction.click(Search_Button, "Clicked on Search button");
			performAction.click(DXtoggle, "Clicked on DXtoggle");
			performAction.clickandwait(CCM_Report_Download, "Clicked on CCM report download");
			performAction.click(CCM_Dowmload, "Clicked on Download");
			CommonMethods.pageload(driver);
			performAction.click(OK_PopUP, "Clicked on OK popup");
		} catch (Exception e) {
			throw new RuntimeException("enrollMember_Without_Email exception");
		}
	}
}
