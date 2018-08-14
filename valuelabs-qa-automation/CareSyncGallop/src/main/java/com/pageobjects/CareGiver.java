package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class CareGiver {
	WebDriver driver;
	ActionKeywords performAction;

	public CareGiver(WebDriver driver) {
		this.driver = driver;
	}

	By CaregiverFirstname = By
			.xpath("//*[@id='inviteFormsContainer']/div[2]/div[1]/div[2]/form/div/div[1]/div[1]/div[1]/input");
	By Caregiverlastname = By
			.xpath("//*[@id='inviteFormsContainer']/div[2]/div[1]/div[2]/form/div/div[1]/div[1]/div[2]/input");
	By CaregiverDOB = By.xpath("//input[@id='dob-caregiver']");
	By Caregiverhomephone = By
			.xpath("//*[@id='inviteFormsContainer']/div[2]/div[1]/div[2]/form/div/div[1]/div[1]/div[4]/input");
	By CaregiverMobile = By
			.xpath("//*[@id='inviteFormsContainer']/div[2]/div[1]/div[2]/form/div/div[1]/div[1]/div[5]/input");
	By CaregiverEmail = By
			.xpath("//*[@id='inviteFormsContainer']/div[2]/div[1]/div[2]/form/div/div[1]/div[2]/div/input");
	By CaregiverNext = By.xpath("//*[@id='createAcct']");

	public void caregiver() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.enter(CaregiverFirstname,"profirstname"+CommonMethods.randaomstring(10),"Entered caregiver firstname");
			performAction.enterandwait(Caregiverlastname,"prolasname"+CommonMethods.randaomstring(10),"Entered caregiver lastname");
			performAction.enter(CaregiverDOB, "01/11/1986", "Entered DOB");
			performAction.click(Caregiverhomephone, "clicked on home phone");
			performAction.enterandwait(Caregiverhomephone,CommonMethods.randominteger(900000000, 1000000000),"Entered Home phone number");
			performAction.enter(CaregiverMobile,CommonMethods.randominteger(900000000, 1000000000),"Entered Mobile number");
			performAction.enter(CaregiverEmail,"Vishal.dhanala+"+CommonMethods.randaomstring(15)+"@gmail.com","Entered Email");
			performAction.browserScroll(500, "Browser scroll");
		} catch (Exception e) {
			throw new RuntimeException("enrollMember_Without_Email exception");
		}
	}

	public void Enroll_Next() throws Exception {
		try {
			performAction = new ActionKeywords(driver);
			performAction.jsclick(CaregiverNext, "Next button is clicked");
		} catch (Exception e) {
			throw new RuntimeException("enrollMember_Without_Email exception");
		}
	}
}
