package xls_Writetocell;

//import org.junit.Test;
//mport java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.util.List;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;


//import static org.testng.Assert.*;
//import jxl.Sheet;
import jxl.Workbook;
//import jxl.read.biff.BiffException;






import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;


//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import jxl.write.Label;

//import bsh.org.objectweb.asm.Label;

public class Xlsoutputfile {

	WebDriver d;
	
	@BeforeMethod
	public void meth1()
	{
		
		d=new FirefoxDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS); 
			}
	@AfterMethod
	public void meth2() 
	{
		d.quit();
		
	}
	@Test
	public void meth3() throws  Exception
	{
		//d.get("http://www.gmail.com");
	
		
		//assertEquals("Gmail",d.getTitle());
		//RFeading user name and password from xl-sheet
		FileOutputStream fos=new FileOutputStream("C:\\New folder\\Akhil.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fos);
		WritableSheet ws=wwb.createSheet("Sheet1",0);
		Thread.sleep(4000);
		Label l1=new Label(0,0,"mahesh");
		Label l2=new Label(0,1,"mahesh");
		Label l3=new Label(0,2,"keerthi");
		Label l4=new Label(0,3,"keerthi");
		ws.addCell(l1);
		ws.addCell(l2);
		ws.addCell(l3);
		ws.addCell(l4);
		wwb.write();
		wwb.close();
		
	}
	
	

	
	
	}
	
	
	
		
		
		
	
