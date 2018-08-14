package com.pageobjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class Caresync_buybanner {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	*
	*/
	public Caresync_buybanner(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators buy banner plus
	 * @Function buying a caresync plan for new user
	 */
	By buyplusBanner = By.xpath("//*[@id='account-banner']/a");
	By monthlyplanbuypanel = By.xpath("//input[@value='Buy Monthly Plan']");
	By promocode = By.xpath("//*[@id='purchase_plan_promo_code']");
	By apply = By.xpath("//input[@value='Apply']");
	By cardholdername = By.xpath("//input[@class='card_holder_name']");
	By addressline1 = By.xpath("//input[@name='card_address_line1']");
	By city = By.xpath("//input[@name='card_address_city']");
	By state = By.xpath("//select[@name='card_address_state']");
	By zipcode = By.xpath("//input[@name='card_address_zip']");
	By confirmpurchase = By.xpath("//input[@value='Confirm Purchase']");
	By letsgo = By.xpath("//*[@id='content']/div[3]/div/div/a");
	By letsgo_two = By.xpath("//*[@class='lets_go_btn']");
	By cardDetails=By.xpath("(//*[@id='card-element'])[1]");

	/**
	 * @param plusbannerbuy
	 * @param monthlybuypannel
	 * @param promocode
	 * @param apply
	 * @param cardholdername
	 * @param address
	 * @param confirmpurchase
	 * @param letsgobutton
	 */

	public void buyplusBanner() {

		try {
			performAction = new ActionKeywords(driver);
			CommonMethods.pageload(driver);
			CommonMethods.pageload(driver);
			performAction.click(buyplusBanner, "Clicking on buyplusBanner");
			performAction.click(monthlyplanbuypanel, "cliked on monthly plan buy panel");
		} catch (Exception e) {
			throw new RuntimeException("exception at buyplusBanner");
		}
	}

	public void letsgo() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(letsgo, "Clicking on lets go");
		} catch (Exception e) {
			throw new RuntimeException("exception at letsgo");
		}
	}

	public void letsgo_two() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(letsgo_two, "Clicking on lets go");
		} catch (Exception e) {
			throw new RuntimeException("exception at letsgo_two");
		}
	}

	public void Caresync_buybanneraccount() {
		try {

			performAction = new ActionKeywords(driver);
			CommonMethods.pageload(driver);
			CommonMethods.pageload(driver);
			performAction.enter(promocode, "Fifty", "Entering the promocode");
			performAction.click(apply, "Click on apply button");
			performAction.enterandwait(cardholdername, "Sim Grammy", "Entering the cardholder name");
			performAction.wait(2000,"Wait time");
			performAction.click(cardDetails, "Clicked on card details");
						
			performAction.wait(2000,"Wait time");
			Actions Ac=new Actions(driver);
		
			String cardnumber="378282246310005";
			StringSelection select1 = new StringSelection(cardnumber);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select1, null);
			CommonMethods.pageload(driver);
			
			Ac.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
			Ac.keyUp(Keys.CONTROL).perform();
						
			performAction.wait(4000,"Wait time");
			String expiry="1022";
			StringSelection select2 = new StringSelection(expiry);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select2, null);
			CommonMethods.pageload(driver);
			Ac.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
			Ac.keyUp(Keys.CONTROL).perform();
						
			performAction.wait(2000,"Wait time");
			String cvv="4512";
			StringSelection select3 = new StringSelection(cvv);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select3, null);
			CommonMethods.pageload(driver);
			
			Ac.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
			Ac.keyUp(Keys.CONTROL).perform();
			performAction.wait(2000,"Wait time");
			
			
			performAction.browserScroll(500, "Scrolling down");
			performAction.enter(addressline1, "123 main st", "Entering the address line1");
			performAction.enter(city, "Orlando", "Entering the city name");
			performAction.select(state, "FL", "Selecting the state from drop down");
			performAction.enter(zipcode, "32801", "Entering the zipcode");
			performAction.click(confirmpurchase, "Clicking on confirm purchase button");
			CommonMethods.pageload(driver);

		} catch (Exception e) {
			throw new RuntimeException("exception at Caresync_buybanneraccount");
		}
	}
}
