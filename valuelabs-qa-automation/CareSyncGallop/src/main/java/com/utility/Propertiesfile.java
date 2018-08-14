	package com.utility;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.util.Properties;
	
	public class Propertiesfile{
	Properties prop;
	
	/**
	* @Function to read properties file
	* @throws Exception
	*/
	public	Propertiesfile() throws Exception{
	try	{
	File config=new File("C:\\valuelabs-qa-automation\\CareSyncGallop\\Inputs\\Caresynproperties");
	FileInputStream fis=new FileInputStream(config);
	prop=new Properties();
	prop.load(fis);
	}
	catch (FileNotFoundException e){
	System.out.println("Properties file not found please check in Propertiesfile.class");
	e.printStackTrace();
	}
	}
	/**
	* @functions
	* @return
	*/
	public String URL()	{
	String uname=prop.getProperty("Applicationurl");
	return uname;
	}
	/**
	 * 
	 * @return
	 */
	public String Excel(){
	String uname=prop.getProperty("Excelpath");
	return uname;
	}
	/**
	 * 
	 * @return
	 */
	public String USERNAME(){
	String uname=prop.getProperty("freeaccountusername");
	return uname;
	}
	/**
	 * 
	 * @return
	 */
	public String PASSWORD(){
	String pass=prop.getProperty("password");
	return pass;
	}
	/**
	 * 
	 * @return
	 */
	public String UnameHealthAssistant(){
	String unameHealthAssistant=prop.getProperty("usernameHA");
	return unameHealthAssistant;
	}
	/**
	 * 
	 * @return
	 */
	public String PassHealthAssistant()	{
	String passHealthAssistant=prop.getProperty("passwordHA");
	return passHealthAssistant;
	}
	/**
	 * 
	 * @return
	 */
	public String Clientservicesusername(){
	String clientserviceunam=prop.getProperty("ClientserviceUsername");
	return clientserviceunam;
	}
	/**
	 * 
	 * @return
	 */
	public String Clientservicespassword(){
	String Clientservicepass=prop.getProperty("Clientservicepassword");
	return Clientservicepass;
	}
	/**
	 * 
	 * @return
	 */
	public String  chrome(){
	String CHROMEPATH=prop.getProperty("chromedriverpath");
	return CHROMEPATH;
	}
	/**
	 * 
	 * @return
	 */
	public String IE(){
	String IEPATH=prop.getProperty("IEdriverpath");
	return IEPATH;
	}
	/**
	 * 
	 * @return
	 */
	public String Firefox(){
	String FIREFOXPATH=prop.getProperty("firefoxdriver");
	return FIREFOXPATH;
	}
	/**
	 * 
	 * @return
	 */
	public String HAusername(){
	String HelathAssistantUname=prop.getProperty("username1");
	return HelathAssistantUname;
	}
	/**
	 * 
	 * @return
	 */
	public String HAPassword(){
	String HelathAssistantpass=prop.getProperty("password1");
	return HelathAssistantpass;
	}
	/**
	 * 
	 * @return
	 */
	public String HAusernameAlt(){
	String HelathAssistantUnamealt=prop.getProperty("username2");
	return HelathAssistantUnamealt;
	}
	/**
	 * 
	 * @return
	 */
	public String HAPasswordalt(){
	String HelathAssistantpassalt=prop.getProperty("password2");
	return HelathAssistantpassalt;
	}
	/**
	 * 
	 * @return
	 */
	public String Clientserviceuname(){
	String csl=prop.getProperty("username3");
	return csl;
	}
	/**
	 * 
	 * @return
	 */
	public String Clientservicepass(){
	String csp=prop.getProperty("password3");
	return csp;
	}
	/**
	 * 
	 * @return
	 */
	public String Clientserviceusername(){
	String csls=prop.getProperty("username4");
	return csls;
	}
	/**
	 * 
	 * @return
	 */
	public String Clientservicepassword(){
	String csps=prop.getProperty("password4");
	return csps;
	}
	/**
	 * 
	 * @return
	 */
	public String CSRUsername(){
	String csls=prop.getProperty("CSRUsername");
	return csls;
	}
	/**
	 * 
	 * @return
	 */
	public String CSRPassword(){
	String csps=prop.getProperty("CSRPassword");
	return csps;
	}
	/**
	 * 
	 * @return
	 */
	public String Imagepath(){
	String ImageLocation=prop.getProperty("image");
	return ImageLocation;
	}
	/**
	 * 
	 * @return
	 */
	public String Textdocument(){
	String docs=prop.getProperty("TextDocument");
	return docs;
	}
	/**
	 * 
	 * @return
	 */
	public String geckodriver(){
	String gecko=prop.getProperty("gecko");
	return gecko;
	}
	/**
	 * 
	 * @return
	 */
	public String ExtentPath(){
	String extentpath=prop.getProperty("Extentreportspath");
	return extentpath;
	}
	/**
	 * 
	 * @return
	 */
	public String Screenshotspath(){
	String scrnshotpath=prop.getProperty("screenshotspath");
	return scrnshotpath;
	}
	/**
	 * 
	 * @return
	 */
	public String gridnodepath(){
	String gridnode=prop.getProperty("GridNode");
	return gridnode;
	}
	
	public String GmailURL(){
		String gmailurl=prop.getProperty("GmailURL");
		return gmailurl;
		}
	
	public String Mandatoryfields(){
		String mandatoryfields=prop.getProperty("MandatoryFields");
		return mandatoryfields;
		}
	}
