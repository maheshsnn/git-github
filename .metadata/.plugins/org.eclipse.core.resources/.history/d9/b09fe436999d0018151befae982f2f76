package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.relevantcodes.extentreports.LogStatus;
import com.utility.CommonMethods;
import com.utility.ReadMandatoryFields;

public class ActionKeywords extends ManageBrowser {

	WebDriver driver;
	/**
	 * @Contains all the actions
	 * @param driver
	 */
	public ActionKeywords(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * 
	 * @param locator
	 * @param loggers
	 * @throws Exception
	 */
	public void click(By locator, String loggers) throws Exception {
		try {
			driver.findElement(locator).click();
			logger.log(LogStatus.INFO, loggers);
		} catch (Exception e) {
			System.out.println(ReadMandatoryFields.isMandatory(loggers));
			if (ReadMandatoryFields.isMandatory(loggers)) {
				logger.log(LogStatus.FAIL, loggers);
				System.out.println("in try catch ");
				throw new RuntimeException("Field is mandatory");
			} else {
				System.out.println("In else block");
				logger.log(LogStatus.WARNING, loggers);
			}
			CommonMethods.ScreenshotonSkip(driver, loggers);
			System.out.println("Outside try and catch");
		}
	}

	/**
	 * 
	 * @param locator
	 * @param loggers
	 * @throws Exception
	 */
	public void clickandwait(By locator, String loggers) throws Exception {
		try {
			driver.findElement(locator).click();
			logger.log(LogStatus.INFO, loggers);
			Thread.sleep(5000);

		} catch (Exception e) {
			System.out.println(ReadMandatoryFields.isMandatory(loggers));
			if (ReadMandatoryFields.isMandatory(loggers)) {
				logger.log(LogStatus.FAIL, loggers);
				System.out.println("in try catch ");
				throw new RuntimeException("Field is mandatory");
			} else {
				System.out.println("In else block");
				logger.log(LogStatus.WARNING, loggers);
			}
			CommonMethods.ScreenshotonSkip(driver, loggers);
			System.out.println("Outside try and catch");
		}
	}

	/**
	 * 
	 * @param locator
	 * @param value
	 * @param loggers
	 * @throws Exception
	 */
	public void enter(By locator, String value, String loggers) throws Exception {
		try {
			driver.findElement(locator).sendKeys(value);
			logger.log(LogStatus.INFO, loggers);

		} catch (Exception e) {
			System.out.println(ReadMandatoryFields.isMandatory(loggers));
			if (ReadMandatoryFields.isMandatory(loggers)) {
				logger.log(LogStatus.FAIL, loggers);
				System.out.println("in try catch ");
				throw new RuntimeException("Field is mandatory");
			} else {
				System.out.println("In else block");
				logger.log(LogStatus.WARNING, loggers);
			}
			CommonMethods.ScreenshotonSkip(driver, loggers);
			System.out.println("Outside try and catch");

		}
	}

	/*
	 * public void enterText(By locator, String value, String loggers) throws
	 * Exception { try { driver.findElement(locator).sendKeys(value);
	 * logger.log(LogStatus.INFO, loggers);
	 * 
	 * } catch (Exception e) {
	 * System.out.println(ReadMandatoryFields.isMandatory(loggers)); if
	 * (ReadMandatoryFields.isMandatory(loggers)) { logger.log(LogStatus.FAIL,
	 * loggers); System.out.println("in try catch "); throw new
	 * RuntimeException("Field is mandatory"); } else { System.out.println(
	 * "In else block"); logger.log(LogStatus.WARNING, loggers); }
	 * CommonMethods.ScreenshotonSkip(driver, loggers); System.out.println(
	 * "Outside try and catch");
	 * 
	 * } }
	 */
	/*
	 * public void enter(By locator, String value, String loggers, boolean
	 * blnFieldType) throws Exception { try {
	 * driver.findElement(locator).sendKeys(value); logger.log(LogStatus.INFO,
	 * loggers);
	 * 
	 * } catch (Exception e) { if (blnFieldType) logger.log(LogStatus.WARNING,
	 * loggers); else logger.log(LogStatus.FAIL, loggers);
	 * 
	 * CommonMethods.ScreenshotonSkip(driver, loggers);
	 * 
	 * } }
	 */

	public void enterandwait(By locator, String value, String loggers) throws Exception {
		try {
			driver.findElement(locator).sendKeys(value);
			logger.log(LogStatus.INFO, loggers);
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(ReadMandatoryFields.isMandatory(loggers));
			if (ReadMandatoryFields.isMandatory(loggers)) {
				logger.log(LogStatus.FAIL, loggers);
				System.out.println("in try catch ");
				throw new RuntimeException("Field is mandatory");
			} else {
				System.out.println("In else block");
				logger.log(LogStatus.WARNING, loggers);
			}
			CommonMethods.ScreenshotonSkip(driver, loggers);
			System.out.println("Outside try and catch");

		}
	}

	/**
	 * 
	 * @param locator
	 * @param loggers
	 * @return
	 * @throws Exception
	 */
	public boolean verify(By locator, String loggers) throws Exception {
		try {
			logger.log(LogStatus.INFO, loggers);
			return driver.findElement(locator).isDisplayed();

		} catch (Exception e) {
			System.out.println(ReadMandatoryFields.isMandatory(loggers));
			if (ReadMandatoryFields.isMandatory(loggers)) {
				logger.log(LogStatus.FAIL, loggers);
				System.out.println("in try catch ");
				throw new RuntimeException("Field is mandatory");
			} else {
				System.out.println("In else block");
				logger.log(LogStatus.WARNING, loggers);
			}
			CommonMethods.ScreenshotonSkip(driver, loggers);
			System.out.println("Outside try and catch");
			return false;
		}
	}

	/**
	 * 
	 * @param locator
	 * @param loggers
	 * @throws Exception
	 */
	public void jsclick(By locator, String loggers) throws Exception {
		try {
			WebElement element = driver.findElement(locator);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].click();", element);
			logger.log(LogStatus.INFO, loggers);
		} catch (Exception e) {
			System.out.println(ReadMandatoryFields.isMandatory(loggers));
			if (ReadMandatoryFields.isMandatory(loggers)) {
				logger.log(LogStatus.FAIL, loggers);
				System.out.println("in try catch ");
				throw new RuntimeException("Field is mandatory");
			} else {
				System.out.println("In else block");
				logger.log(LogStatus.WARNING, loggers);
			}
			CommonMethods.ScreenshotonSkip(driver, loggers);
			System.out.println("Outside try and catch");

		}
	}

	/**
	 * 
	 * @param locator
	 * @param loggers
	 * @throws Exception
	 */
	public void browserScroll(int ScrollTo, String loggers) throws Exception {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, " + ScrollTo + ")");
			logger.log(LogStatus.INFO, loggers);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.log(LogStatus.WARNING, loggers);
			CommonMethods.ScreenshotonSkip(driver, loggers);
		}
	}

	/**
	 * 
	 * @param locator
	 * @param loggers
	 * @throws Exception
	 */
	public void mouseOver(By locator, String loggers) throws Exception {
		try {
			Actions MouseOver = new Actions(driver);
			MouseOver.moveToElement(driver.findElement(locator)).build().perform();
		} catch (Exception e) {
			System.out.println(ReadMandatoryFields.isMandatory(loggers));
			if (ReadMandatoryFields.isMandatory(loggers)) {
				logger.log(LogStatus.FAIL, loggers);
				System.out.println("in try catch ");
				throw new RuntimeException("Field is mandatory");
			} else {
				System.out.println("In else block");
				logger.log(LogStatus.WARNING, loggers);
			}
			CommonMethods.ScreenshotonSkip(driver, loggers);
			System.out.println("Outside try and catch");

		}
	}

	/**
	 * 
	 * @param locator
	 * @param loggers
	 * @throws Exception
	 */
	public void mouseClick(By locator, String loggers) throws Exception {
		try {
			Actions MouseOver = new Actions(driver);
			MouseOver.moveToElement(driver.findElement(locator)).click().build().perform();
		} catch (Exception e) {
			System.out.println(ReadMandatoryFields.isMandatory(loggers));
			if (ReadMandatoryFields.isMandatory(loggers)) {
				logger.log(LogStatus.FAIL, loggers);
				System.out.println("in try catch ");
				throw new RuntimeException("Field is mandatory");
			} else {
				System.out.println("In else block");
				logger.log(LogStatus.WARNING, loggers);
			}
			CommonMethods.ScreenshotonSkip(driver, loggers);
			System.out.println("Outside try and catch");

		}
	}

	/**
	 * 
	 * @param locators
	 * @param Value
	 * @param loggers
	 * @throws Exception
	 */

	/*
	 * public void select(By locator, String Value, String loggers) throws
	 * Exception { try { new
	 * Select(driver.findElement(locator)).selectByVisibleText(Value);
	 * logger.log(LogStatus.INFO, loggers); } catch (Exception e) { // TODO
	 * Auto-generated catch block logger.log(LogStatus.WARNING, loggers);
	 * CommonMethods.ScreenshotonSkip(driver, loggers); } }
	 */

	public void select(By locator, String Value, String loggers) throws Exception {
		try {
			new Select(driver.findElement(locator)).selectByVisibleText(Value);
			logger.log(LogStatus.INFO, loggers);
		} catch (Exception e) {
			System.out.println(ReadMandatoryFields.isMandatory(loggers));
			if (ReadMandatoryFields.isMandatory(loggers)) {
				logger.log(LogStatus.FAIL, loggers);
				System.out.println("in try catch select ");
				throw new RuntimeException("Field is mandatory");
			} else {
				System.out.println("In else block select");
				logger.log(LogStatus.WARNING, loggers);
			}
			CommonMethods.ScreenshotonSkip(driver, loggers);
			System.out.println("Outside try and catch else block");

		}
	}

	/**
	 * 
	 * @param locator
	 * @param value
	 * @param loggers
	 * @throws Exception
	 */

	public void select(By locator, int value, String loggers) throws Exception {
		try {
			new Select(driver.findElement(locator)).selectByIndex(value);
			logger.log(LogStatus.INFO, loggers);

		} catch (Exception e) {
			System.out.println(ReadMandatoryFields.isMandatory(loggers));
			if (ReadMandatoryFields.isMandatory(loggers)) {
				logger.log(LogStatus.FAIL, loggers);
				System.out.println("in try catch ");
				throw new RuntimeException("Field is mandatory");
			} else {
				System.out.println("In else block");
				logger.log(LogStatus.WARNING, loggers);
			}
			CommonMethods.ScreenshotonSkip(driver, loggers);
			System.out.println("Outside try and catch");

		}
	}

	/**
	 * 
	 * @param locator
	 * @param value
	 * @param loggers
	 * @throws Exception
	 */
	public void selectandwait(By locator, int value, String loggers) throws Exception {
		try {
			new Select(driver.findElement(locator)).selectByIndex(value);
			logger.log(LogStatus.INFO, loggers);
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(ReadMandatoryFields.isMandatory(loggers));
			if (ReadMandatoryFields.isMandatory(loggers)) {
				logger.log(LogStatus.FAIL, loggers);
				System.out.println("in try catch ");
				throw new RuntimeException("Field is mandatory");
			} else {
				System.out.println("In else block");
				logger.log(LogStatus.WARNING, loggers);
			}
			CommonMethods.ScreenshotonSkip(driver, loggers);
			System.out.println("Outside try and catch");

		}
	}

	/**
	 * 
	 * @param locator
	 * @param value
	 * @param loggers
	 * @throws Exception
	 */
	public void selectandwait(By locator, String value, String loggers) throws Exception {
		try {
			new Select(driver.findElement(locator)).selectByVisibleText(value);
			logger.log(LogStatus.INFO, loggers);
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(ReadMandatoryFields.isMandatory(loggers));
			if (ReadMandatoryFields.isMandatory(loggers)) {
				logger.log(LogStatus.FAIL, loggers);
				System.out.println("in try catch ");
				throw new RuntimeException("Field is mandatory");
			} else {
				System.out.println("In else block");
				logger.log(LogStatus.WARNING, loggers);
			}
			CommonMethods.ScreenshotonSkip(driver, loggers);
			System.out.println("Outside try and catch");

		}
	}

	/**
	 * 
	 * @param locator
	 * @param loggers
	 * @throws Exception
	 */
	public void clear(By locator, String loggers) throws Exception {
		try {
			driver.findElement(locator).clear();
			logger.log(LogStatus.INFO, loggers);
		} catch (Exception e) {
			System.out.println(ReadMandatoryFields.isMandatory(loggers));
			if (ReadMandatoryFields.isMandatory(loggers)) {
				logger.log(LogStatus.FAIL, loggers);
				System.out.println("in try catch ");
				throw new RuntimeException("Field is mandatory");
			} else {
				System.out.println("In else block");
				logger.log(LogStatus.WARNING, loggers);
			}
			CommonMethods.ScreenshotonSkip(driver, loggers);
			System.out.println("Outside try and catch");

		}
	}

	/**
	 * 
	 * @param timeUnits
	 * @param loggers
	 * @throws Exception
	 */
	public void wait(int value, String loggers) throws Exception {
		try {
			logger.log(LogStatus.INFO, loggers);
			Thread.sleep(value);
		} catch (Exception e) {
			System.out.println(ReadMandatoryFields.isMandatory(loggers));
			if (ReadMandatoryFields.isMandatory(loggers)) {
				logger.log(LogStatus.FAIL, loggers);
				System.out.println("in try catch ");
				throw new RuntimeException("Field is mandatory");
			} else {
				System.out.println("In else block");
				logger.log(LogStatus.WARNING, loggers);
			}
			CommonMethods.ScreenshotonSkip(driver, loggers);
			System.out.println("Outside try and catch");

		}
	}

	/**
	 * 
	 * @param locator
	 * @param loggers
	 * @throws Exception
	 */
	public void arrow_Down(By locator, String loggers) throws Exception {
		try {
			driver.findElement(locator).sendKeys(Keys.ARROW_DOWN);
			logger.log(LogStatus.INFO, loggers);
		} catch (Exception e) {
			System.out.println(ReadMandatoryFields.isMandatory(loggers));
			if (ReadMandatoryFields.isMandatory(loggers)) {
				logger.log(LogStatus.FAIL, loggers);
				System.out.println("in try catch ");
				throw new RuntimeException("Field is mandatory");
			} else {
				System.out.println("In else block");
				logger.log(LogStatus.WARNING, loggers);
			}
			CommonMethods.ScreenshotonSkip(driver, loggers);
			System.out.println("Outside try and catch");

		}

	}

	/**
	 * 
	 * @param locator
	 * @param loggers
	 * @throws Exception
	 */
	public void key_Enter(By locator, String loggers) throws Exception {
		try {
			driver.findElement(locator).sendKeys(Keys.ENTER);
			logger.log(LogStatus.INFO, loggers);
		} catch (Exception e) {
			System.out.println(ReadMandatoryFields.isMandatory(loggers));
			if (ReadMandatoryFields.isMandatory(loggers)) {
				logger.log(LogStatus.FAIL, loggers);
				System.out.println("in try catch ");
				throw new RuntimeException("Field is mandatory");
			} else {
				System.out.println("In else block");
				logger.log(LogStatus.WARNING, loggers);
			}
			CommonMethods.ScreenshotonSkip(driver, loggers);
			System.out.println("Outside try and catch");

		}

	}

}
