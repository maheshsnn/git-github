package com.pageobjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.base.ActionKeywords;
import com.utility.CommonMethods;
import com.utility.Propertiesfile;

public class Documents {
	WebDriver driver;
	ActionKeywords performAction;

	/**
	 * @param driver
	 */
	public Documents(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @Locators for Documents tab
	 */
	By Documentstab = By.xpath("//a[contains(text(),'Documents')]");
	By AddDocuments = By.xpath("//*[@id='content_section']/div[2]/div[1]/div[3]/div/input");
	By DeletingDocument = By.xpath("(//img[@class='delete_document'])[1]");
	By Confirmationpopup = By.xpath("//*[@id='confirm_button_no']");

	/**
	 * @param Documents
	 *            tab
	 */
	public void Documentss() {

		try {

			performAction = new ActionKeywords(driver);
			Propertiesfile pro=new Propertiesfile();
			performAction.clickandwait(Documentstab, "Documents tab is clicked");
			performAction.clickandwait(AddDocuments, "Add documents is clicked");
			String Documentpath=System.getProperty("user.dir") +System.getProperty("file.separator")+pro.Imagepath();
			StringSelection select1 = new StringSelection(Documentpath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select1, null);
			CommonMethods.pageload(driver);
			Actions Ac=new Actions(driver);
			Ac.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
			Ac.keyUp(Keys.CONTROL).perform();
			
			performAction.clickandwait(DeletingDocument, "Delete the document");
			performAction.mouseOver(Confirmationpopup, "Mouse over the pop up");
			performAction.clickandwait(Confirmationpopup, "Pop up handeled");

		} catch (Exception e) {
			throw new RuntimeException("Exception at Documentss");
		}

	}

}