package propertiesfile_loadind;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Properties_file {
	
	Properties prop;
	
	public void loadfile() throws IOException
	{
		File f=new File("");
		FileInputStream fis=new FileInputStream(f);
		prop =new Properties();
		prop.load(fis);
		
		
	}
	
	public String username()
	{
		
		String uname=prop.getProperty("username");
		return uname;
	}
	
	

}
