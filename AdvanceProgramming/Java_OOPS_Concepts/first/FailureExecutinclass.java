package first;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class FailureExecutinclass {

	public static void main(String[] args) 
	{
		TestNG runner=new TestNG();
		
		List<String>list=new ArrayList();
		list.add("G:\\Auto\\AdvanceProgramming\\test-output\\Suite\\testng-failed.xml");
		runner.setTestSuites(list);
		runner.run();
	}

}
