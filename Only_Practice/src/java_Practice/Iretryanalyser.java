package java_Practice;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Iretryanalyser implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult arg0) {
		int count = 0;

		int retry = 3;

		if (count < retry)

		{
			count++;
			return true;
		}

		return false;
	}
}
