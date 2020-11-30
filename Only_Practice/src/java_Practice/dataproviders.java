package java_Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviders {


	public class dp{
		
		@DataProvider(name="")
		public Object[][] dp()
		{
			return new Object[][]{{},{}};
			
		}
		
		
	}

	

}
