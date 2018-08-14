
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.ManageBrowser;
import com.configurations.GridConfiguration;
import com.pageobjects.LoginPage;
import com.pageobjects.Member_Login_6;
import com.relevantcodes.extentreports.LogStatus;
import com.utility.CommonMethods;

public class CS_Member_Login_Part6 extends ManageBrowser {

	WebDriver driver;

	@BeforeMethod
	@Parameters({ "browser" })
	public void setUp(String browser) throws Exception {
		System.out.println("*******************");
		GridConfiguration gc = new GridConfiguration();
		driver = gc.getDriver(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.get("https://csdev.caresync.com/login");
	}

	@Test(groups = { "Regression", "Smoke" })
	public void CS_memberlogin_part6() throws Exception {
		logger = reports.startTest("MemberLogin_part6");
		System.out.println("Executing testcase  CS_MemberLogin_part6");

		// Required Objects
		LoginPage login = new LoginPage(driver);
		login.loginpage(pro.USERNAME(), pro.PASSWORD());

		Member_Login_6 member_Login_6 = new Member_Login_6(driver);
		// member_Login_6.member_login_6();

		member_Login_6.myDay();

		member_Login_6.medications();

		member_Login_6.medication_checkbox();

		member_Login_6.done_click();

		member_Login_6.notNow_popup();

		member_Login_6.myDay();

		member_Login_6.medication_reminder();

		member_Login_6.care_manager();

		member_Login_6.myDay();

		member_Login_6.appointments();

		member_Login_6.care_manager();

		member_Login_6.myDay();

		member_Login_6.track_measurement();

		member_Login_6.care_manager();

		member_Login_6.myDay();

		member_Login_6.care_splan();

		member_Login_6.type_icon();

		member_Login_6.type();

		member_Login_6.textarea();

		member_Login_6.addbutton();

		member_Login_6.day_one();

		member_Login_6.health_profile();

		member_Login_6.personal_info();

		member_Login_6.health_profile();

		member_Login_6.providers_titles();

		member_Login_6.summary_button();

		member_Login_6.healthcondition_title();

		member_Login_6.summary_button();

		member_Login_6.medication_title();

		member_Login_6.summary_button();

		member_Login_6.allergies_title();

		member_Login_6.summary_button();

		member_Login_6.document_title();

		member_Login_6.summary_button();

		member_Login_6.appts_title();

		member_Login_6.health_profile();

		member_Login_6.emergency_contacts();

		member_Login_6.health_profile();

		member_Login_6.view_share();

		member_Login_6.view_child();

		member_Login_6.download_bluebutton();

		member_Login_6.download_bluebutton();

		member_Login_6.email_button();

		member_Login_6.email_button();

		member_Login_6.fax_button();

		member_Login_6.fax_button();

		member_Login_6.back_page();

		member_Login_6.history_button();

		member_Login_6.filter_range();

		member_Login_6.daterange_one();

		member_Login_6.view_share();

		member_Login_6.view_child();

		member_Login_6.download_bluebutton();

		member_Login_6.download_bluebutton();

		member_Login_6.email_button();

		member_Login_6.email_button();

		member_Login_6.fax_button();

		member_Login_6.fax_button();

		member_Login_6.back_page();

		System.out.println("Ended CS_MemberLogin_Part6");
		logger.log(LogStatus.PASS, "Completed CS_MemberLogin_part6");
	}

	@AfterMethod
	public void tearup(ITestResult result) throws Exception {
		CommonMethods.CaptureScreenshot(driver, result);
	}

	@AfterClass
	public void teardown() {
		reports.endTest(logger);
		driver.close();
	}
}
