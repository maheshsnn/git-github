	package com.utility;
	import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import com.base.ManageBrowser;
import com.relevantcodes.extentreports.LogStatus;

	
	public class CommonMethods  extends ManageBrowser{
		static Random r=new Random();
		/**
		 * 
		 * @param driver
		 * @param datepicked
		 */
	public static void calenderdatepicker(WebDriver driver,String datepicked){
		List<WebElement>dates=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td"));
		int sizeofrow=dates.size();
		for(int i=0;i<sizeofrow;i++){
		String name=dates.get(i).getText() ;
		if(name.equals(datepicked)){
		dates.get(i).click();
		break;
	}
	}
	}
	
	/**
	 * 
	 * @param driver
	 * @throws Exception
	 */
	public static  void pageload(WebDriver driver) throws Exception{
		Thread.sleep(5000);
		ExpectedCondition<Boolean> pageLoadCondition = new 	ExpectedCondition<Boolean>() {
	    public Boolean apply(WebDriver driver){
		return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
	}
	};
		WebDriverWait wait2 = new WebDriverWait(driver,400);
		wait2.until(pageLoadCondition);
	}
	
	/**
	 * 
	 * @param driver
	 * @param result
	 * @throws Exception
	 */
	@SuppressWarnings("unused")
	public static void CaptureScreenshot(WebDriver driver,ITestResult result) 
	{
		try {
			if(result.getStatus()==ITestResult.FAILURE)
			{
			System.out.println("Aftermethod executing");
			Propertiesfile pro=new Propertiesfile();
			DateFormat dateformat=new SimpleDateFormat("ddMMyyyyHHmmss");
			Date date=new Date() ;
			File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String dest=pro.Screenshotspath()+result.getName()+".jpeg";
			FileUtils.copyFile(scr, new File(dest));
			System.out.println("here is the screenshot path"+dest);
			Thread.sleep(3000);
			String screenpathtwo =  dest.replace(pro.Screenshotspath(), "");
			System.out.println("here is the screenshot path after replacen    "+screenpathtwo);
			String image=logger.addScreenCapture(screenpathtwo);
			Thread.sleep(3000);
			logger.log(LogStatus.FAIL, "testtile verification on failure", image);
			System.out.println("Aftermethod Executed");
			}
		} catch (WebDriverException e) {
			System.out.println("Exception at webDriver"); 
			
		} catch (Exception e) {
			System.out.println("Exception at webDriver");
		}
	
	}
	
	/**
	 * 
	 * @param driver
	 * @throws Exception
	 */
	public static void ScreenshotonSkip(WebDriver driver, String strScrName) throws Exception
	{
		System.out.println("Aftermethod on skip executing");
		Propertiesfile pro=new Propertiesfile();
		DateFormat dateformat=new SimpleDateFormat("ddMMyyyy_HHmmss");
		Date date=new Date() ;
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dest=pro.Screenshotspath()+strScrName+"_"+dateformat.format(date)+".jpeg";
		FileUtils.copyFile(scr, new File(dest));
		System.out.println("here is the screenshot path"+dest);
		Thread.sleep(3000);
		String screenpathtwo =  dest.replace(pro.Screenshotspath(), "");
		System.out.println("here is the screenshot path after replacen    "+screenpathtwo);
		String image=logger.addScreenCapture(screenpathtwo);
		logger.log(LogStatus.WARNING, "", image);
		System.out.println("Aftermethod on skip Executed");
	}
	
	public static void Screenshot_on_RunTime(WebDriver driver, String strScrName) throws Exception
	{
		System.out.println("Aftermethod on skip executing");
		Propertiesfile pro=new Propertiesfile();
		DateFormat dateformat=new SimpleDateFormat("ddMMyyyy_HHmmss");
		Date date=new Date() ;
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String dest=pro.Screenshotspath()+strScrName+"_"+dateformat.format(date)+".jpeg";
		FileUtils.copyFile(scr, new File(dest));
		System.out.println("here is the screenshot path"+dest);
		Thread.sleep(3000);
		String screenpathtwo =  dest.replace(pro.Screenshotspath(), "");
		System.out.println("here is the screenshot path after replacen    "+screenpathtwo);
		String image=logger.addScreenCapture(screenpathtwo);
		logger.log(LogStatus.FAIL, "", image);
		System.out.println("Aftermethod on skip Executed");
	}
	
	
	
	/**
	 * 
	 * @param size
	 * @param length
	 * @return
	 */
	public static   String  randominteger(int size,int length) 
	{
		int a=r.nextInt(size)+length;
		String randnum=Integer.toString(a);
		return randnum ;
	}

	/**
	 * 
	 * @param size
	 * @return
	 */
	public static String randaomstring(int size)
	{
	try	{
		String randomstrings=RandomStringUtils.randomAlphabetic(size).toUpperCase();
		return randomstrings;
	}
	catch(Exception e){
	return e.getMessage();
	}
	}
	}
