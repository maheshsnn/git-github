package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;
import com.utility.ExcelReadandWritedata;

public class Timer {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public Timer(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for Saas_Timer
	 */
	By TimeStartbutton = By.xpath("//button[@class='bw_button_green timer_button timer_start']");
	By TimerNotesArea = By.xpath("//textarea[@placeholder='Notes']");
	By TimerSavebutton = By.xpath("//button[@class='timer_save bw_button_green timer_button']");
	By ViewTimeHistory = By.xpath("//span[contains(text(),'View Time History')]");
	By OK_popup = By.xpath("//button[@value='0']");
	By Reset = By.xpath("//button[@class='timer_reset bw_button timer_button']");
	By Reset_timer = By.xpath("//button[@value='1']");

	/**
	 * @param SaaS_Timer
	 * @throws Exception
	 */
	public void timer() throws Exception {
		try {

			performAction = new ActionKeywords(driver);

			if (performAction.verify(OK_popup, "Ok pop up displayed")) {
				System.out.println("ok pop up is displayed");
				performAction.click(OK_popup, "Clicked on Ok");
				System.out.println("ok 1 is present");
				performAction.clickandwait(Reset, "Clicked on Reset");
				performAction.clickandwait(Reset_timer, "Clicked on Yes pop up");
			} else {
				System.out.println("Timer popup not present");
			}

			performAction.clickandwait(TimeStartbutton, "Timer is started");
			performAction.enter(TimerNotesArea, ExcelReadandWritedata.Readcell(86, 0), "Notes is entered");
			CommonMethods.pageload(driver);
			performAction.clickandwait(TimerSavebutton, "Save button is clicked");
			performAction.clickandwait(ViewTimeHistory, "View time history is clicked");
			CommonMethods.pageload(driver);

		} catch (Exception e) {
			throw new RuntimeException("timer exception");
		}

	}

}