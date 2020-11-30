package selenium;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class invocation_method {
	
	
	@BeforeClass
	public void mm()
	{
		
	}
	
	@Test(invocationCount =2)
	public void sh()
	{
		System.out.println("Test");
	}
	@Test(enabled = true)
	public void shs()
	{
		System.out.println("ex");
	}

}
