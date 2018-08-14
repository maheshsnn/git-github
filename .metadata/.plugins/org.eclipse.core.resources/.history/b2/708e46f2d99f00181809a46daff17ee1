
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class CS_SAAS_Login extends ManageBrowser {
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
	public void SaaSlogin_Part1() throws Exception {
		logger = reports.startTest("CS_Enterprise_SaaSLogin");
		System.out.println("Executing testcase  CS_Enterprise_SaaSLogin");

		// Login
		LoginPage login = new LoginPage(driver);
		login.loginpage(pro.Clientserviceuname(), pro.Clientservicepass());

		// SaaSimage
		SAAS_Image Member_Image = new SAAS_Image(driver);
		Member_Image.SaasImage();

		// Enrollmemberwithemail
		SAAS_Enroll_Member_With_Email Enrollpatient = new SAAS_Enroll_Member_With_Email(driver);
		Enrollpatient.enrollMember_With_Email();

		// Enrollmember_Caregiver details
		CareGiver caregiver = new CareGiver(driver);
		caregiver.caregiver();

		// Enrollmember_Next
		caregiver.Enroll_Next();

		// Enrollmember without email
		SAAS_Enroll_Member_WithoutEmail memberwithoutmail = new SAAS_Enroll_Member_WithoutEmail(driver);
		memberwithoutmail.enrollMember_Without_Email();

		// Enrollmember_Next
		caregiver.Enroll_Next();

		// Temporary login access
		SAAS_Login_Access loginaccess = new SAAS_Login_Access(driver);
		loginaccess.LoginAccess_Page();

		// signout
		End_Steps end_steps = new End_Steps(driver);
		end_steps.signout();

		// Login
		login.loginpage(pro.Clientserviceusername(), pro.Clientservicepassword());

		// Image selection
		Member_Image.SaaSimage2();

		// Timer selection
		Timer timer = new Timer(driver);
		timer.timer();

		// Manage members
		Manage_Members memberinvitations = new Manage_Members(driver);
		memberinvitations.manage_Members();

		// Meaningful_Use
		Meaningful_Use Meaningfuluse = new Meaningful_Use(driver);
		Meaningfuluse.Meaningful_Use_Report();

		// HAView and share
		View_Share viewandshare = new View_Share(driver);
		viewandshare.Viewshare();

		// Backbutton
		Back_Button Backbutton = new Back_Button(driver);
		Backbutton.backbtn();

		// Services Report button
		SAAS_ServicesReport Services_Report = new SAAS_ServicesReport(driver);
		Services_Report.Servicesreport_button();

		// Services_Report_function
		Services_Report.ServicesReport_Function();

		// HAview and share
		viewandshare.Viewshare();

		// Backbutton
		Backbutton.backbtn();

		// signout
		end_steps.signout();
		System.out.println("Ended CS_SAAS_Login");
		logger.log(LogStatus.PASS, "Completed CS_SAAS_Login");

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
