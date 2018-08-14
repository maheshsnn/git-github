package mobile_Automation;

import org.testng.annotations.BeforeMethod;

import com.experitest.client.Client;
import com.experitest.client.Configuration;

public class Mobile_Scripting {
	
	
	Client client;
	
	String host="";
	int port=8889;
	String Project_directory=System.getProperty("user.dir")+System.getProperty("file.separator")+"'foldername";
	
	@BeforeMethod
	public void Appium_Beforemethod()
	{
		
		Configuration config=new Configuration();
		client=client.configure(config);
		
		client=new Client(host, port, true);
		client.launch("", true, false);
		
	}
	

}
