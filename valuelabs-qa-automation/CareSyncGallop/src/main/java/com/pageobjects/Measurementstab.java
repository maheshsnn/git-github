package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;
import com.utility.ExcelReadandWritedata;

public class Measurementstab {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public Measurementstab(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for Measurements
	 */

	// General xpaths.
	By Notes = By.xpath("//textarea[@id='note']");
	By Savebutton = By.xpath("//*[@id='save']");
	By Edit = By.xpath("//*[@id='edit']");
	By MeasurementsRemovebutton = By.xpath("//*[@id='remove']/span");
	By ConfirmPopup = By.xpath("//button[@id='confirm_button_no']");
	By Measurementbacktomain = By.xpath("//*[text()='Back']");
	By GraphoneMonth = By.xpath("//*[@class='bucket_selector font_bold']/li[2]");
	By ConnectButton = By.xpath("//button[text()='Connect']");
	By Popupwhennavigatedback = By.xpath("//button[@class='bw_button js-close']");
	By SettingsconnectNokia = By.xpath("//button[text()='Connect to Nokia']");
	By ConnectIHealth = By.xpath("//*[text()='Connect to iHealth']");

	// Journal AddValue
	By JournalTextspan = By.xpath("(//span[text()='Journal'])[2]");
	By JournalAddvalue = By.xpath("(//img[@alt='Add'])[1]");
	By Scalemeasurement = By.xpath("//div[@class='sliderContainer js-sliderContainer sliderContainer-feeling']");
	By EmojiSelection = By.xpath("//*[@class='selectedMoodImage']");
	By EmojiImage = By.xpath("//img[@alt='well']");
	By Journalsavedlist = By
			.xpath("(//div[@class='measurement-value js-measurement-value measurement-value-feeling'])[1]");

	// journal Graph
	By JournalGraph = By.xpath("(//img[@alt='Graph'])[1]");

	// Pain AddValue
	By PainSpan = By.xpath("(//span[text()='Pain'])[2]");
	By PainAddValue = By.xpath("(//img[@alt='Add'])[2]");
	By PainScale = By.xpath("//div[@class='noUi-base']/child::*");
	By PainSavedList = By.xpath("(//div[@class='measurement-value js-measurement-value measurement-value-pain'])[1]");

	// Pain graph
	By PainGraph = By.xpath("(//img[@alt='Graph'])[2]");

	// BloodPressure AddValue
	By BPSpan = By.xpath("(//span[text()='Blood Pressure'])[2]");
	By BPAddvalue = By.xpath("(//img[@alt='Add'])[3]");
	By BPSystolictext = By.xpath("//*[text()='Systolic']/following-sibling::*");
	By BPDiastolic = By.xpath("//*[text()='Diastolic']/following-sibling::*");
	By BPSavedlist = By.xpath("(//*[@class='entityListHeader flexItem-stretch']/following-sibling::*)[1]");

	// BP Graph
	By BPGraph = By.xpath("(//img[@alt='Graph'])[3]");

	// BP ConnectApp
	By BPConnectApp = By.xpath("(//*[text()='Connect App'])[3]");

	// BP Settings
	By BPSettings = By.xpath("(//img[@alt='Settings'])[3]");

	// Heart Rate addvalue
	By HeartRateSpan = By.xpath("(//span[text()='Heart Rate'])[2]");
	By HeartRateAddvalue = By.xpath("(//img[@alt='Add'])[4]");
	By HeartRateEntry = By.xpath("//*[@class='entityDetails-measurement-unit']/preceding-sibling::*");
	By HeartRateSavedList = By
			.xpath("(//div[@class='measurement-value js-measurement-value measurement-value-heartrate'])[1]");

	// HeartRate Graph
	By HeartRateGraph = By.xpath("(//img[@alt='Graph'])[4]");

	// HeartRate ConnectApp
	By HeartRateConnectApp = By.xpath("(//*[text()='Connect App'])[4]");

	// HeartRate Settings
	By HRSettings = By.xpath("(//img[@alt='Settings'])[4]");

	// Glucose AddValue
	By GlucoseSpan = By.xpath("(//span[text()='Glucose'])[2]");
	By GlucoseAddvalue = By.xpath("(//img[@alt='Add'])[5]");
	By GlucoseEntry = By.xpath("//*[@id='measurement_details_form']/div[1]/div/div[2]/div[1]/div[1]/input");
	By GlucoseRadioButton = By.xpath("//*[@id='fasting']/div[1]");
	By GlucoseSavedList = By.xpath(
			"(//li[@class='entityListItem js-entityListItem entityListItem-measurement measurement-glucose js-measurement-glucose'])[1]");

	// Glucose Graph
	By GlucoseGraph = By.xpath("(//img[@alt='Graph'])[5]");

	// Glucose Connect App
	By GlucoseConnectbutton = By.xpath("(//*[text()='Connect App'])[5]");

	// Glucose settings
	By GlucoseSettingsApp = By.xpath("(//img[@alt='Settings'])[5]");

	// Height Addvalue
	By HTSpan = By.xpath("(//span[text()='Height'])[2]");
	By HTAddvalue = By.xpath("(//img[@alt='Add'])[6]");
	By HTinFeets = By.xpath("//input[@name='feet']");
	By HTininches = By.xpath("//input[@name='inches']");
	By HTSavedlist = By.xpath("(//*[@class='measurement-value-height-feet-inches'])[1]");

	// Height Graph
	By HeightGraph = By.xpath("(//img[@alt='Graph'])[6]");

	// Height ConnectApp
	By HTconnectApp = By.xpath("(//*[text()='Connect App'])[6]");

	// Height Settings
	By HTSettings = By.xpath("(//img[@alt='Settings'])[6]");

	// Weight Add value
	By WTSpan = By.xpath("(//span[text()='Weight'])[2]");
	By WTAddvalue = By.xpath("(//img[@alt='Add'])[7]");
	By WeightInputbox = By.xpath("(//div[@class='measurement-reading measurement-reading-weight']/child::*)[1]");
	By WeightSavedList = By.xpath(
			"(//li[@class='entityListItem js-entityListItem entityListItem-measurement measurement-weight js-measurement-weight'])[1]");

	// Weight Graph
	By WeightGraph = By.xpath("(//img[@alt='Graph'])[7]");

	// WeightConnect
	By WTConnect = By.xpath("(//*[text()='Connect App'])[7]");

	// Weight settings
	By WTSettings = By.xpath("(//img[@alt='Settings'])[7]");

	// Temperature Add Value
	By TemperatureSpanlabel = By.xpath("(//span[text()='Temperature'])[2]");
	By TempertureAddValue = By.xpath("(//img[@alt='Add'])[8]");
	By Temperatureinput = By.xpath("(//*[@class='measurement-reading measurement-reading-temperature']/child::*)[1]");
	By TemperatureRadioButton = By.xpath("//*[@id='celsius']/div[1]");
	By TemperaturesavedList = By.xpath(
			"(//li[@class='entityListItem js-entityListItem entityListItem-measurement measurement-temperature js-measurement-temperature'])[1]");

	// Temperature Graph
	By TemperatureGraph = By.xpath("(//img[@alt='Graph'])[8]");

	/**
	 * @param Journal
	 *            block
	 */
	public void JournalAdd_Value() {
		View_Share view_share = new View_Share(driver);
		Back_Button back = new Back_Button(driver);
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(JournalAddvalue, "if journal add value is displayed")) {
				performAction.clickandwait(JournalAddvalue, "Journal add value is clicked");
			} else {
				performAction.clickandwait(JournalTextspan, "Journal text span is clicked");
				performAction.clickandwait(JournalAddvalue, "Journal add value is clicked");
			}

			performAction.clickandwait(Scalemeasurement, "Scale is clicked");
			performAction.clickandwait(Scalemeasurement, "Scale is clicked");
			performAction.enterandwait(Notes, CommonMethods.randaomstring(7), "Notes is entered");
			performAction.clickandwait(EmojiSelection, "Emoji is clicked");
			performAction.clickandwait(EmojiImage, "Emoji Image is selected");
			performAction.browserScroll(1000, "Window is scrolled");
			performAction.clickandwait(Savebutton, "Save is clicked");
			performAction.clickandwait(Journalsavedlist, "Saved list is clicked");
			performAction.wait(3000, "Entered wait time");
			performAction.clickandwait(Edit, "Edit is clicked");
			performAction.clear(Notes, "Notes is cleared");
			System.out.println("journol 1");
			performAction.enterandwait(Notes, CommonMethods.randaomstring(7), "Notes is entered");
			System.out.println("journol 2");
			performAction.browserScroll(1000, "Window is scrolled");
			performAction.clickandwait(Savebutton, "Save is clicked");
			performAction.clickandwait(Journalsavedlist, "Saved list is clicked");
			performAction.browserScroll(1000, "Window is scrolled");
			performAction.clickandwait(MeasurementsRemovebutton, "Remove button is clicked");
			performAction.mouseOver(ConfirmPopup, "Mouse over the pop up");
			performAction.clickandwait(ConfirmPopup, "Pop up is accepted");
			performAction.browserScroll(-1000, "Window is scrolled up");
			view_share.Viewshare();
			view_share.ViewandShareReport();
			back.backbtn();
		} catch (Exception e) {
			throw new RuntimeException("enrollMember_Without_Email exception");
		}

	}

	/**
	 * @param uname
	 * @param pasword
	 */
	public void Journal_Graph() {
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(JournalGraph, "if JournalGraph is displayed")) {
				performAction.clickandwait(JournalGraph, "JournalGraph is clicked");
			} else {
				performAction.clickandwait(JournalTextspan, "Journal text span is clicked");
				performAction.clickandwait(JournalGraph, "JournalGraph is clicked");
			}

			performAction.clickandwait(GraphoneMonth, "Graph one month is clicked");
			performAction.clickandwait(Measurementbacktomain, "Back to main page is clicked");
		} catch (Exception e) {
			throw new RuntimeException(" exception at Journal_Graph");
		}

	}

	/**
	 * @param uname
	 * @param pasword
	 */
	public void Pain_Addvalue() {
		View_Share view_share = new View_Share(driver);
		Back_Button back = new Back_Button(driver);
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(PainAddValue, "if PainAddValue is displayed")) {
				performAction.clickandwait(PainAddValue, "PainAddValue is clicked");
			} else {
				performAction.clickandwait(PainSpan, "PainSpan is clicked");
				performAction.clickandwait(PainAddValue, "PainAddValue is clicked");
			}

			performAction.clickandwait(PainScale, "Scale is selected");
			performAction.clickandwait(PainScale, "Scale is selected");
			performAction.enterandwait(Notes, CommonMethods.randaomstring(7), "Notes is entered");
			performAction.browserScroll(1000, "Window is scrolled");
			performAction.clickandwait(Savebutton, "Save button is clicked");
			// performAction.wait("wait time");
			performAction.clickandwait(PainSavedList, "Pain saved list is clicked");
			// performAction.wait("wait time");
			performAction.clickandwait(Edit, "Edit button is clicked");
			performAction.clear(Notes, "Notes is cleared");
			performAction.enterandwait(Notes, CommonMethods.randaomstring(7), "Notes is entered");
			performAction.browserScroll(1000, "Window is scrolled");
			performAction.clickandwait(Savebutton, "Save button is clicked");
			performAction.clickandwait(PainSavedList, "Pain saved list is clicked");
			performAction.clickandwait(MeasurementsRemovebutton, "Remove button is clicked");
			CommonMethods.pageload(driver);
			performAction.mouseOver(ConfirmPopup, "Mouse over the pop up");
			performAction.clickandwait(ConfirmPopup, "pop up is handed");
			performAction.browserScroll(-1000, "Window is scrolled up");
			view_share.Viewshare();
			view_share.ViewandShareReport();
			back.backbtn();
		} catch (Exception e) {
			throw new RuntimeException(" exception at Pain_Addvalue");
		}

	}

	/**
	 * @param uname
	 * @param pasword
	 */
	public void Pain_Graph() {
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(PainGraph, "if PainGraph is displayed")) {
				performAction.clickandwait(PainGraph, "PainGraph is clicked");
			} else {
				performAction.clickandwait(PainSpan, "PainSpan is clicked");
				performAction.clickandwait(PainGraph, "PainGraph is clicked");
			}
			performAction.clickandwait(GraphoneMonth, "Graph one month is clicked");
			performAction.clickandwait(Measurementbacktomain, "Back to main page");

		} catch (Exception e) {
			throw new RuntimeException(" exception at Pain_Graph");
		}

	}

	/**
	 * @param BP_Addvalue
	 */
	public void BloodPressure_AddValue() {
		View_Share view_share = new View_Share(driver);
		Back_Button back = new Back_Button(driver);
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(BPAddvalue, "if PainGraph is displayed")) {
				performAction.clickandwait(BPAddvalue, "PainGraph is clicked");
			} else {
				performAction.clickandwait(BPSpan, "PainSpan is clicked");
				performAction.clickandwait(BPAddvalue, "PainGraph is clicked");
			}
			performAction.enterandwait(BPSystolictext, ExcelReadandWritedata.Readcell(89, 0),
					"Systolic text is entered");
			performAction.enterandwait(BPDiastolic, ExcelReadandWritedata.Readcell(90, 0), "Diastolic text is entered");
			performAction.enterandwait(Notes, CommonMethods.randaomstring(9), "Notes is entered");
			performAction.browserScroll(1000, "Window is scrolled");
			performAction.clickandwait(Savebutton, "Save is clicked");
			performAction.clickandwait(BPSavedlist, "BP saved list is clicked");
			performAction.clear(BPSystolictext, "systolic is cleared");
			performAction.enterandwait(BPSystolictext, ExcelReadandWritedata.Readcell(91, 0),
					"systolic text is entered");
			performAction.clear(BPDiastolic, "Diastolic is cleared");
			performAction.enterandwait(BPDiastolic, ExcelReadandWritedata.Readcell(92, 0),
					"Diastolic value is entered");
			performAction.clear(Notes, "Notes is cleared");
			performAction.enterandwait(Notes, CommonMethods.randaomstring(9), "Notes is entered");
			performAction.browserScroll(1000, "Window is scrolled");
			performAction.clickandwait(Savebutton, "Save button is clicked");
			performAction.clickandwait(BPSavedlist, "Bp saved list is clicked");
			performAction.clickandwait(MeasurementsRemovebutton, "Remove button is clicked");
			performAction.mouseOver(ConfirmPopup, "Mouse over the pop up");
			performAction.clickandwait(ConfirmPopup, "pop up is handeled");
			view_share.Viewshare();
			view_share.ViewandShareReport();
			back.backbtn();
			performAction.wait(3000, "Entered wait time");
		} catch (Exception e) {
			throw new RuntimeException(" exception at BloodPressure_AddValue");
		}

	}

	/**
	 * @param uname
	 * @param pasword
	 */
	public void BP_Graph() {
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(BPGraph, "if BPGraph is displayed")) {
				performAction.clickandwait(BPGraph, "BPGraph is clicked");
			} else {
				performAction.clickandwait(BPSpan, "PainSpan is clicked");
				performAction.clickandwait(BPGraph, "BPGraph is clicked");
			}
			performAction.clickandwait(GraphoneMonth, "1month is clicked");
			performAction.clickandwait(Measurementbacktomain, "Back to main page");
		} catch (Exception e) {
			throw new RuntimeException(" exception at BP_Graph");
		}

	}

	/**
	 * @param uname
	 * @param pasword
	 */
	public void BP_ConnectApp() {
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(BPConnectApp, "if BPConnectApp is displayed")) {
				performAction.clickandwait(BPConnectApp, "BPConnectApp is clicked");
			} else {
				performAction.clickandwait(BPSpan, "BPSpan is clicked");
				performAction.clickandwait(BPConnectApp, "BPConnectApp is clicked");
			}
			performAction.wait(2000, "wait time");
			performAction.clickandwait(ConnectIHealth, "I health is clicked");
			performAction.browserScroll(1000, "Window is scrolled");
			performAction.clickandwait(ConnectButton, "Connect button is clicked");
			driver.navigate().back();
			performAction.wait(3000, "Entered wait time");
			performAction.clickandwait(Popupwhennavigatedback, "Pop up is handeled");
			performAction.browserScroll(-1000, "window is scrolled up");
			performAction.clickandwait(Measurementbacktomain, "Back to main page is clicked");

		} catch (Exception e) {
			throw new RuntimeException(" exception at BP_ConnectApp");
		}

	}

	/**
	 * @param uname
	 * @param pasword
	 */
	public void BloodPressure_Settings() {
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(BPSettings, "if BPSettings is displayed")) {
				performAction.clickandwait(BPSettings, "BPSettings is clicked");
			} else {
				performAction.clickandwait(BPSpan, "BPSpan is clicked");
				performAction.clickandwait(BPSettings, "BPSettings is clicked");
			}

			performAction.clickandwait(SettingsconnectNokia, "Connect to Nokia");
			performAction.browserScroll(1000, "Window is scrolled");
			performAction.clickandwait(ConnectButton, "Connect button");
			driver.navigate().back();
			performAction.wait(3000, "Entered wait time");
			performAction.clickandwait(Popupwhennavigatedback, "Pop up is handeled");
			performAction.browserScroll(-1000, "Window is scrolled");
			performAction.clickandwait(Measurementbacktomain, "Back to main page is clicked");

		} catch (Exception e) {
			throw new RuntimeException("BloodPressure_Settings exception");
		}
	}

	/**
	 * @param Heart
	 *            Rate_Add value
	 */
	public void Heartrate_AddValue() {
		View_Share view_share = new View_Share(driver);
		Back_Button back = new Back_Button(driver);
		try {
			performAction = new ActionKeywords(driver);
			if (performAction.verify(HeartRateAddvalue, "if HeartRateAddvalue is displayed")) {
				performAction.clickandwait(HeartRateAddvalue, "HeartRateAddvalue is clicked");
			} else {
				performAction.clickandwait(HeartRateSpan, "HeartRateSpan is clicked");
				performAction.clickandwait(HeartRateAddvalue, "HeartRateAddvalue is clicked");
			}
			performAction.enterandwait(HeartRateEntry, ExcelReadandWritedata.Readcell(93, 0),
					"Heart rate value is entered");
			performAction.enterandwait(Notes, CommonMethods.randaomstring(10), "Notes is entered");
			performAction.clickandwait(Savebutton, "Save button is clicked");
			performAction.clickandwait(HeartRateSavedList, "Saved list is clicked");
			performAction.clear(HeartRateEntry, "Heart rate is cleared");
			performAction.enterandwait(HeartRateEntry, ExcelReadandWritedata.Readcell(94, 0),
					"Heart rate value is entered");
			performAction.clear(Notes, "Notes is cleared");
			performAction.enterandwait(Notes, CommonMethods.randaomstring(10), "Notes is entered");
			performAction.clickandwait(Savebutton, "Save button is clicked");
			performAction.clickandwait(HeartRateSavedList, "Saved list is clicked");
			performAction.clickandwait(MeasurementsRemovebutton, "Remove button is clicked");
			performAction.mouseOver(ConfirmPopup, "Pop up is mouse overed");
			performAction.clickandwait(ConfirmPopup, "pop up is clicked");
			view_share.Viewshare();
			view_share.ViewandShareReport();
			back.backbtn();
			performAction.wait(3000, "Entered wait time");
		} catch (Exception e) {
			throw new RuntimeException("Heartrate_AddValue exception");
		}

	}

	/**
	 * @param
	 */
	public void HeartRate_Graph() {
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(HeartRateGraph, "if HeartRateGraph is displayed")) {
				performAction.clickandwait(HeartRateGraph, "HeartRateGraph is clicked");
			} else {
				performAction.clickandwait(HeartRateSpan, "HeartRateSpan is clicked");
				performAction.clickandwait(HeartRateGraph, "HeartRateGraph is clicked");
			}
			performAction.clickandwait(GraphoneMonth, "One month is clicked");
			performAction.clickandwait(Measurementbacktomain, "Back to main page is clicked");
			performAction.browserScroll(300, "window is scrolled");

		} catch (Exception e) {
			throw new RuntimeException("HeartRate_Graph exception");
		}

	}

	/**
	 * @param uname
	 * @param pasword
	 */
	public void Heartrate_ConnectApp() {
		try {
			performAction = new ActionKeywords(driver);
			if (performAction.verify(HeartRateConnectApp, "if HeartRateConnectApp is displayed")) {
				performAction.clickandwait(HeartRateConnectApp, "HeartRateConnectApp is clicked");
			} else {
				performAction.clickandwait(HeartRateSpan, "HeartRateSpan is clicked");
				performAction.clickandwait(HeartRateConnectApp, "HeartRateConnectApp is clicked");
			}
			performAction.clickandwait(ConnectIHealth, "I health is clicked");
			performAction.browserScroll(1000, "Window is scrolled");
			performAction.clickandwait(ConnectButton, "Connect button is clicked");
			driver.navigate().back();
			performAction.wait(3000, "Entered wait time");
			performAction.clickandwait(Popupwhennavigatedback, "Pop up is handeled");
			performAction.browserScroll(-1000, "window is scrolled up");
			performAction.clickandwait(Measurementbacktomain, "Back to main page is clicked");
			performAction.browserScroll(300, "window is scrolled");

		} catch (Exception e) {
			throw new RuntimeException("Heartrate_ConnectApp exception");
		}

	}

	/**
	 * @param uname
	 * @param pasword
	 */
	public void HeartRate_Settings() {
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(HRSettings, "if HRSettings is displayed")) {
				performAction.clickandwait(HRSettings, "HRSettings is clicked");
			} else {
				performAction.clickandwait(HeartRateSpan, "HeartRateSpan is clicked");
				performAction.clickandwait(HRSettings, "HRSettings is clicked");
			}
			performAction.clickandwait(SettingsconnectNokia, "Connect to Nokia");
			performAction.browserScroll(1000, "Window is scrolled");
			performAction.clickandwait(ConnectButton, "Connect button");
			driver.navigate().back();
			performAction.wait(3000, "Entered wait time");
			performAction.clickandwait(Popupwhennavigatedback, "Pop up is handeled");
			performAction.browserScroll(-1000, "Window is scrolled");
			performAction.clickandwait(Measurementbacktomain, "Back to main page is clicked");
		} catch (Exception e) {
			throw new RuntimeException("HeartRate_Settings exception");
		}

	}

	/**
	 * @param Glucose_Add
	 *            Value
	 */
	public void Glucose_AddValue() {
		View_Share view_share = new View_Share(driver);
		Back_Button back = new Back_Button(driver);
		try {
			performAction = new ActionKeywords(driver);
			if (performAction.verify(GlucoseAddvalue, "if GlucoseAddvalue is displayed")) {
				performAction.clickandwait(GlucoseAddvalue, "GlucoseAddvalue is clicked");
			} else {
				performAction.clickandwait(GlucoseSpan, "GlucoseSpan is clicked");
				performAction.clickandwait(GlucoseAddvalue, "GlucoseAddvalue is clicked");
			}
			performAction.enterandwait(GlucoseEntry, ExcelReadandWritedata.Readcell(95, 0), "Glocose entry is done");
			performAction.clickandwait(GlucoseRadioButton, "Radio button is clicked");
			performAction.enterandwait(Notes, CommonMethods.randaomstring(10), "Notes is entered");
			performAction.clickandwait(Savebutton, "Save is clicked");
			performAction.clickandwait(GlucoseSavedList, "Saved list is clicked");
			performAction.clear(GlucoseEntry, "Entry is cleared");
			performAction.enterandwait(GlucoseEntry, ExcelReadandWritedata.Readcell(96, 0), "Entry is done");
			performAction.clear(Notes, "Notes is cleared");
			performAction.enterandwait(Notes, CommonMethods.randaomstring(10), "Notes is entered");
			performAction.clickandwait(Savebutton, "save button is clicked");
			performAction.clickandwait(GlucoseSavedList, "Saved list is clicked");
			performAction.clickandwait(MeasurementsRemovebutton, "Remove button is clicked");
			CommonMethods.pageload(driver);
			performAction.mouseOver(ConfirmPopup, "Pop up is mouse overed");
			performAction.clickandwait(ConfirmPopup, "pop up is clicked");
			view_share.Viewshare();
			view_share.ViewandShareReport();
			back.backbtn();
			performAction.wait(3000, "Entered wait time");
		} catch (Exception e) {
			throw new RuntimeException("Glucose_AddValue exception");
		}

	}

	/**
	 * @param Glucose_Graph
	 */
	public void Glucose_Graph() {
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(GlucoseGraph, "if GlucoseGraph is displayed")) {
				performAction.clickandwait(GlucoseGraph, "GlucoseGraph is clicked");
			} else {
				performAction.clickandwait(GlucoseSpan, "GlucoseSpan is clicked");
				performAction.clickandwait(GlucoseGraph, "GlucoseGraph is clicked");
			}
			performAction.clickandwait(GraphoneMonth, "One month is clicked");
			performAction.clickandwait(Measurementbacktomain, "back to main page is clicked");
			performAction.browserScroll(300, "window is scrolled");

		} catch (Exception e) {
			throw new RuntimeException("Glucose_Graph exception");
		}

	}

	/**
	 * @param uname
	 * @param pasword
	 */
	public void Glucose_ConnectApp() {
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(GlucoseConnectbutton, "if GlucoseConnectbutton is displayed")) {
				performAction.clickandwait(GlucoseConnectbutton, "GlucoseConnectbutton is clicked");
			} else {
				performAction.clickandwait(GlucoseSpan, "GlucoseSpan is clicked");
				performAction.clickandwait(GlucoseConnectbutton, "GlucoseConnectbutton is clicked");
			}
			performAction.clickandwait(ConnectIHealth, "I health is clicked");
			performAction.browserScroll(1000, "Window is scrolled");
			performAction.clickandwait(ConnectButton, "Connect button is clicked");
			driver.navigate().back();
			performAction.wait(3000, "Entered wait time");
			performAction.clickandwait(Popupwhennavigatedback, "Pop up is handeled");
			performAction.browserScroll(-1000, "window is scrolled up");
			performAction.clickandwait(Measurementbacktomain, "Back to main page is clicked");
			performAction.browserScroll(300, "window is scrolled");

		} catch (Exception e) {
			throw new RuntimeException("Glucose_ConnectApp exception");
		}

	}

	/**
	 * @param uname
	 * @param pasword
	 */
	public void Glucose_Settings() {
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(GlucoseSettingsApp, "if GlucoseSettingsApp is displayed")) {
				performAction.clickandwait(GlucoseSettingsApp, "GlucoseSettingsApp is clicked");
			} else {
				performAction.clickandwait(GlucoseSpan, "GlucoseSpan is clicked");
				performAction.clickandwait(GlucoseSettingsApp, "GlucoseSettingsApp is clicked");
			}
			performAction.clickandwait(ConnectIHealth, "Connect to ConnectIHealth");
			performAction.browserScroll(1000, "Window is scrolled");
			performAction.clickandwait(ConnectButton, "Connect button");
			driver.navigate().back();
			performAction.wait(3000, "Entered wait time");
			performAction.clickandwait(Popupwhennavigatedback, "Pop up is handeled");
			performAction.browserScroll(-1000, "Window is scrolled");
			performAction.clickandwait(Measurementbacktomain, "Back to main page is clicked");

		} catch (Exception e) {
			throw new RuntimeException("Glucose_Settings exception");
		}

	}

	/**
	 * @param uname
	 * @param pasword
	 */
	public void Height_AddValue() {
		View_Share view_share = new View_Share(driver);
		Back_Button back = new Back_Button(driver);
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(HTAddvalue, "if HTAddvalue is displayed")) {
				performAction.clickandwait(HTAddvalue, "HTAddvalue is clicked");
			} else {
				performAction.clickandwait(HTSpan, "HTSpan is clicked");
				performAction.clickandwait(HTAddvalue, "HTAddvalue is clicked");
			}
			performAction.enterandwait(HTinFeets, ExcelReadandWritedata.Readcell(97, 0), "Height entry is done");
			performAction.enterandwait(HTininches, CommonMethods.randominteger(9, 0), "HTininches entry is done");
			performAction.enterandwait(Notes, CommonMethods.randaomstring(10), "Notes is entered");
			performAction.clickandwait(Savebutton, "Save is clicked");
			performAction.clickandwait(HTSavedlist, "Saved list is clicked");
			performAction.clear(HTinFeets, "Entry is cleared");
			performAction.enterandwait(HTinFeets, ExcelReadandWritedata.Readcell(99, 0), "Height entry is done");
			performAction.clear(HTininches, "Entry is cleared");
			performAction.enterandwait(HTininches, CommonMethods.randominteger(9, 0), "Entry is done");
			performAction.clear(Notes, "Notes is cleared");
			performAction.enterandwait(Notes, CommonMethods.randaomstring(10), "Notes is entered");
			performAction.clickandwait(Savebutton, "save button is clicked");
			performAction.clickandwait(HTSavedlist, "Saved list is clicked");
			performAction.clickandwait(MeasurementsRemovebutton, "Remove button is clicked");
			performAction.wait(2000, "wait time");
			performAction.mouseOver(ConfirmPopup, "Pop up is mouse overed");
			performAction.clickandwait(ConfirmPopup, "pop up is clicked");
			view_share.Viewshare();
			performAction.wait(3000, "Entered wait time");
			view_share.ViewandShareReport();
			performAction.wait(3000, "Entered wait time");
			back.backbtn();
			performAction.wait(3000, "Entered wait time");
		} catch (Exception e) {
			throw new RuntimeException("Height_AddValue exception");
		}

	}

	/**
	 * @param uname
	 * @param pasword
	 */
	public void Height_Graph() {
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(HeightGraph, "if HeightGraph is displayed")) {
				performAction.clickandwait(HeightGraph, "HeightGraph is clicked");
			} else {
				performAction.clickandwait(HTSpan, "HTSpan is clicked");
				performAction.clickandwait(HeightGraph, "HeightGraph is clicked");
			}
			performAction.clickandwait(GraphoneMonth, "One month is clicked");
			performAction.clickandwait(Measurementbacktomain, "back to main page is clicked");
			performAction.browserScroll(300, "window is scrolled");
		} catch (Exception e) {
			throw new RuntimeException("Height_Graph exception");
		}

	}

	/**
	 * @param uname
	 * @param pasword
	 */
	public void Height_ConnectApp() {
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(HTconnectApp, "if HTconnectApp is displayed")) {
				performAction.clickandwait(HTconnectApp, "HTconnectApp is clicked");
			} else {
				performAction.clickandwait(HTSpan, "HTSpan is clicked");
				performAction.clickandwait(HTconnectApp, "HTconnectApp is clicked");
			}
			performAction.clickandwait(SettingsconnectNokia, "I health is clicked");
			performAction.browserScroll(1000, "Window is scrolled");
			performAction.clickandwait(ConnectButton, "Connect button is clicked");
			driver.navigate().back();
			performAction.wait(3000, "Entered wait time");
			performAction.clickandwait(Popupwhennavigatedback, "Pop up is handeled");
			performAction.browserScroll(-1000, "window is scrolled up");
			performAction.clickandwait(Measurementbacktomain, "Back to main page is clicked");
			performAction.browserScroll(300, "window is scrolled");

		} catch (Exception e) {
			throw new RuntimeException("Height_ConnectApp exception");
		}

	}

	/**
	 * @param uname
	 * @param pasword
	 */
	public void Height_Settings() {
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(HTSettings, "if HTSettings is displayed")) {
				performAction.clickandwait(HTSettings, "HTSettings is clicked");
			} else {
				performAction.clickandwait(HTSpan, "HTSpan is clicked");
				performAction.clickandwait(HTSettings, "HTSettings is clicked");
			}
			performAction.clickandwait(SettingsconnectNokia, "Connect to Connet to nokia");
			performAction.browserScroll(1000, "Window is scrolled");
			performAction.clickandwait(ConnectButton, "Connect button");
			driver.navigate().back();
			performAction.wait(3000, "Entered wait time");
			performAction.clickandwait(Popupwhennavigatedback, "Pop up is handeled");
			performAction.browserScroll(-1000, "Window is scrolled");
			performAction.clickandwait(Measurementbacktomain, "Back to main page is clicked");
			performAction.browserScroll(1000, "Window is scrolled");

		} catch (Exception e) {
			throw new RuntimeException("Height_Settings exception");
		}

	}

	/**
	 * @param Weight_AddValue
	 */
	public void Weight_AddValue() {

		View_Share view_share = new View_Share(driver);
		Back_Button back = new Back_Button(driver);
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(WTAddvalue, "if WTAddvalue is displayed")) {
				performAction.clickandwait(WTAddvalue, "WTAddvalue is clicked");
			} else {
				performAction.clickandwait(WTSpan, "WTAddvalue is clicked");
				performAction.clickandwait(WTAddvalue, "WTAddvalue is clicked");
			}
			performAction.enterandwait(WeightInputbox, ExcelReadandWritedata.Readcell(101, 0), "Weight entry is done");
			performAction.enterandwait(Notes, CommonMethods.randaomstring(10), "Notes is entered");
			performAction.clickandwait(Savebutton, "Save is clicked");
			performAction.clickandwait(WeightSavedList, "Saved list is clicked");
			performAction.clear(WeightInputbox, "Entry is cleared");
			performAction.enterandwait(WeightInputbox, ExcelReadandWritedata.Readcell(102, 0), "Weight entry is done");
			performAction.clear(Notes, "Notes is cleared");
			performAction.enterandwait(Notes, CommonMethods.randaomstring(10), "Notes is entered");
			performAction.clickandwait(Savebutton, "save button is clicked");
			performAction.clickandwait(WeightSavedList, "Saved list is clicked");
			performAction.clickandwait(MeasurementsRemovebutton, "Remove button is clicked");
			performAction.mouseOver(ConfirmPopup, "Pop up is mouse overed");
			performAction.clickandwait(ConfirmPopup, "pop up is clicked");
			view_share.Viewshare();
			performAction.wait(3000, "Entered wait time");
			view_share.ViewandShareReport();
			performAction.wait(3000, "Entered wait time");
			back.backbtn();
			performAction.wait(3000, "Entered wait time");
			performAction.browserScroll(1000, "Window is scrolled");

		} catch (Exception e) {
			throw new RuntimeException("Weight_AddValue exception");
		}

	}

	/**
	 * @param uname
	 * @param pasword
	 */
	public void Weight_Graph() {
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(WeightGraph, "if WeightGraph is displayed")) {
				performAction.clickandwait(WeightGraph, "WeightGraph is clicked");
			} else {
				performAction.clickandwait(WTSpan, "WTSpan is clicked");
				performAction.clickandwait(WeightGraph, "WeightGraph is clicked");
			}
			performAction.clickandwait(GraphoneMonth, "One month is clicked");
			performAction.clickandwait(Measurementbacktomain, "back to main page is clicked");
			performAction.browserScroll(1000, "window is scrolled");

		} catch (Exception e) {
			throw new RuntimeException("Weight_Graph exception");
		}

	}

	/**
	 * @param uname
	 * @param pasword
	 */
	public void Weight_ConnectApp() {
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(WTConnect, "if WTConnect is displayed")) {
				performAction.clickandwait(WTConnect, "WTConnect is clicked");
			} else {
				performAction.clickandwait(WTSpan, "WTSpan is clicked");
				performAction.clickandwait(WTConnect, "WTConnect is clicked");
			}
			performAction.clickandwait(ConnectIHealth, "I health is clicked");
			performAction.browserScroll(1000, "Window is scrolled");
			performAction.clickandwait(ConnectButton, "Connect button is clicked");
			driver.navigate().back();
			performAction.wait(3000, "Entered wait time");
			performAction.clickandwait(Popupwhennavigatedback, "Pop up is handeled");
			performAction.browserScroll(-1000, "window is scrolled up");
			performAction.clickandwait(Measurementbacktomain, "Back to main page is clicked");
			performAction.browserScroll(1000, "window is scrolled");

		} catch (Exception e) {
			throw new RuntimeException("Weight_ConnectApp exception");
		}

	}

	/**
	 * @param uname
	 * @param pasword
	 */
	public void Weight_Settings() {
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(WTSettings, "if WTSettings is displayed")) {
				performAction.clickandwait(WTSettings, "WTSettings is clicked");
			} else {
				performAction.clickandwait(WTSpan, "WTSpan is clicked");
				performAction.clickandwait(WTSettings, "WTSettings is clicked");
			}
			performAction.clickandwait(ConnectIHealth, "Connect to Ihealth");
			performAction.browserScroll(1000, "Window is scrolled");
			performAction.clickandwait(ConnectButton, "Connect button");
			driver.navigate().back();
			performAction.wait(3000, "waititime");
			performAction.clickandwait(Popupwhennavigatedback, "Pop up is handeled");
			performAction.browserScroll(-1000, "Window is scrolled");
			performAction.clickandwait(Measurementbacktomain, "Back to main page is clicked");
			performAction.browserScroll(1000, "Window is scrolled");

		} catch (Exception e) {
			throw new RuntimeException("Weight_Settings exception");
		}

	}

	/**
	 * @param Temperature_AddValue
	 */
	public void Temperature_AddValue() {
		View_Share view_share = new View_Share(driver);
		Back_Button back = new Back_Button(driver);
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(TempertureAddValue, "if TempertureAddValue is displayed")) {
				performAction.clickandwait(TempertureAddValue, "TempertureAddValue is clicked");
			} else {
				performAction.clickandwait(TemperatureSpanlabel, "TemperatureSpanlabel is clicked");
				performAction.clickandwait(TempertureAddValue, "TempertureAddValue is clicked");
			}
			performAction.enterandwait(Temperatureinput, ExcelReadandWritedata.Readcell(103, 0),
					"Temperature entry is done");
			performAction.clickandwait(TemperatureRadioButton, "Temperature radio button is clicked");
			performAction.enterandwait(Notes, CommonMethods.randaomstring(10), "Notes is entered");
			performAction.clickandwait(Savebutton, "Save is clicked");
			performAction.clickandwait(TemperaturesavedList, "Saved list is clicked");
			performAction.clear(Temperatureinput, "Entry is cleared");
			performAction.enterandwait(Temperatureinput, ExcelReadandWritedata.Readcell(104, 0), "Temp. entry is done");
			performAction.clear(Notes, "Notes is cleared");
			performAction.enterandwait(Notes, CommonMethods.randaomstring(10), "Notes is entered");
			performAction.clickandwait(Savebutton, "save button is clicked");
			performAction.wait(3000, "Entered wait time");
			performAction.clickandwait(TemperaturesavedList, "Saved list is clicked");
			performAction.clickandwait(MeasurementsRemovebutton, "Remove button is clicked");
			performAction.mouseOver(ConfirmPopup, "Pop up is mouse overed");
			performAction.clickandwait(ConfirmPopup, "pop up is clicked");
			view_share.Viewshare();

			view_share.ViewandShareReport();

			back.backbtn();
			performAction.browserScroll(1000, "Window is scrolled");

		} catch (Exception e) {
			throw new RuntimeException(" exception Temperature_AddValue  ");
		}

	}

	/**
	 * @param uname
	 * @param pasword
	 */
	public void Temperature_graph() {
		try {

			performAction = new ActionKeywords(driver);
			if (performAction.verify(TemperatureGraph, "if TemperatureGraph is displayed")) {
				performAction.clickandwait(TemperatureGraph, "TemperatureGraph is clicked");
			} else {
				performAction.clickandwait(TemperatureSpanlabel, "TemperatureSpanlabel is clicked");
				performAction.clickandwait(TemperatureGraph, "TemperatureGraph is clicked");
			}
			performAction.clickandwait(GraphoneMonth, "One month is clicked");
			performAction.clickandwait(Measurementbacktomain, "back to main page is clicked");

		} catch (Exception e) {
			throw new RuntimeException(" exception Temperature_graph");
		}

	}

}