package first;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class classonfailure extends TestListenerAdapter
{

	public void onTestFailure(ITestResult tr) 
	{
		try
		{
		
		File scr=((TakesScreenshot)Configurations.d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("G:\\SELENIUM NOTES\\"+tr.getName()+".png"));
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	
	}
	
}
