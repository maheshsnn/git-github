package com.pageobjects;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.ActionKeywords;
import com.utility.CommonMethods;

public class Member_Login_7 {
	WebDriver driver;
	ActionKeywords performAction;

	public Member_Login_7(WebDriver driver) {
		this.driver = driver;
	}

	By Personal_Info = By.xpath("//a[contains(text(),'Personal')]");
	By care_givers = By.xpath("//*[contains(text(),'Caregivers')]");
	By Sharing_setings = By.xpath("(//div[@class='sharing_link'])[2]");
	By Toggle_All = By.xpath("(//input[@class='on_off_toggle_button'])[1]");
	By Health_Info_Settings = By.xpath("(//*[@class='permission_details'])[1]");
	By Cancel = By.xpath("//button[@id='left-button']");
	By Personal_Info_settings = By.xpath("(//*[@class='permission_details'])[2]");
	By Personal_Document_settings = By.xpath("(//*[@class='permission_details'])[3]");
	By Activity = By.xpath("(//div[@class='permission_details'])[4]");
	By Activity_Togle = By.xpath("//*[@id='connection_perms_dlg']/div[2]/ul/li[1]/div[1]/input");
	By Save = By.xpath("//button[@id='right-button']");
	By Dashboard = By.xpath("//span[contains(text(),'Dashboard')]");
	By Not_Confirming = By.xpath("//button[@id='confirm_button_yes']");
	By Task_List = By.xpath("(//img[@id='dashboard_complete_task'])[1]");
	By Ok_button = By.xpath("//button[@value='0']");
	By Help = By.xpath("//div[@id='help-drop-down-container']/span");
	By Caresync_101 = By.xpath("//a[contains(text(),'CareSync 101')]");
	By Settings = By.xpath("(//span[contains(text(),'Settings')])[1]");
	By Account_Info = By.xpath("//span[contains(text(),'Account Info')]");
	By Manage_MemberShips = By.xpath("//button[contains(text(),'Manage Memberships')]");
	By Notification_Settings = By.xpath("//button[contains(text(),'Notification Settings')]");
	By CareSync_calender = By.xpath("//button[contains(text(),'Calendar Sync')]");
	By Share = By.xpath("//span[contains(text(),'Share')]");
	By Tell_A_Friend = By.xpath("//span[contains(text(),'Tell a Friend')]");
	By Tell_A_Friend_popup = By.xpath("//a[@title='Close']");
	By Gift = By.xpath("(//a[contains(text(),'Gift CareSync')])[1]");

	public void Personal_Info() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.jsclick(Personal_Info, "Clicked on Personal Info Settings");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void care_givers() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(care_givers, "Clicked on CareGivers");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Sharing_setings() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Sharing_setings, "Clicked on share settings");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Toggle_All() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.wait(2000,"wait time");
			performAction.clickandwait(Toggle_All, "Clicked on Toggle All");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Health_Info_Settings() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.wait(2000,"wait time");
			performAction.clickandwait(Health_Info_Settings, "Clicked on Helath info settings");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Cancel() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.wait(2000,"wait time");
			performAction.jsclick(Cancel, "Clicked on Cancel");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Personal_Info_settings() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.wait(2000,"wait time");
			performAction.clickandwait(Personal_Info_settings, "Clicked on personal info settings");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Personal_Document_settings() {

		try {
			performAction = new ActionKeywords(driver);
			performAction.wait(2000,"wait time");
			performAction.clickandwait(Personal_Document_settings, "Clicked on personal document settings");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Activity() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.wait(2000,"wait time");
			performAction.clickandwait(Activity, "Clicked on Activity");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Activity_Togle() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.wait(2000,"wait time");
			performAction.clickandwait(Activity_Togle, "Clicked on Activity toggle");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Save() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.wait(2000,"wait time");
			performAction.jsclick(Save, "Clicked on Save");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Dashboard() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Dashboard, "Clciked on dashboard");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void Not_Confirming() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.wait(2000,"wait time");
			performAction.clickandwait(Not_Confirming, "Clicked on not confirming popup");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Task_List() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Task_List, "Clicked on task list");

			if (performAction.verify(Ok_button, "Verification")) {
				performAction.jsclick(Ok_button, "Clicked on Ok ");
			} else {
				System.out.println("No popup present ");
			}
			CommonMethods.pageload(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void Help() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Help, "Clicked on Help");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

	public void Caresync_101() {
		try {
			
			performAction = new ActionKeywords(driver);
			performAction.wait(2000,"wait time");
			performAction.clickandwait(Caresync_101, "Caresync 101");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Parent_child() {
		try {
			String parentwindow = driver.getWindowHandle();
			Set<String> ch = driver.getWindowHandles();
			for (String childwindow : ch) {
				if (!parentwindow.equals(childwindow)) {
					driver.switchTo().window(parentwindow);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void Settings() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Settings, "Clicked on settings");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Account_Info() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Account_Info, "Clicked on Account info");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Manage_MemberShips() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Manage_MemberShips, "Clicked on memberships");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Notification_Settings() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Notification_Settings, "Clicked on Notofication settings");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void CareSync_calender() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(CareSync_calender, "Clicked on calender sync");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Share() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Share, "Clicked on Share");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Tell_A_Friend() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.wait(2000,"wait time");
			performAction.clickandwait(Tell_A_Friend, "Clicked on Tell a friend");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Tell_A_Friend_popup() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.wait(2000,"wait time");
			performAction.clickandwait(Tell_A_Friend_popup, "Clicked on popup");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Gift() {
		try {
			performAction = new ActionKeywords(driver);
			performAction.clickandwait(Gift, "Clicked on Gift");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
