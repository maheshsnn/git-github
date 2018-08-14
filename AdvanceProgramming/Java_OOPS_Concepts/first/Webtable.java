package first;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Webtable {
	
	WebDriver d;
@BeforeMethod
public void setUp() throws Exception
{
	//d=new FirefoxDriver();
	
	System.out.println("launching firefox browser"); 
	
	System.setProperty("webdriver.gecko.driver", "G://lib//geckodriver.exe");
	
  	d= new FirefoxDriver();
	
    //passing url to the browser
	d.get("https://symmetrycrm.com.au/#/");
	d.manage().window().maximize();
}
@AfterMethod
public void tearDown()
{
	d.close();
	d.quit();
}
@Test
public void dynamicTable(String nn)throws Exception
{
	d.get("http://aponline.gov.in/apportal/contact/sec_select.asp?sid=1%22");
	new Select(d.findElement(By.id("Select1"))).selectByIndex(12);
	List<WebElement>ROWS=d.findElements(By.xpath("//table[@ id='Table9']/tbody/tr"));
	System.out.println("No of ROWS"+ROWS.size());
	List<WebElement>COLOUMNS=d.findElements(By.xpath("//table[@ id='Table9']/tbody/tr/td"));
	System.out.println("No of COLOUMNS"+COLOUMNS.size());
	
	int XX,YY;
	XX=1;
	for(WebElement rows:ROWS)
	{
		List<WebElement>coloumns=rows.findElements(By.xpath("td"));	
		YY=1;
				for(WebElement zz:coloumns)	
					
				{
					System.out.println("Rows#1"+XX+",Col#1"+YY+",Text="+zz.getText());
					YY++;
				}
				XX++ ;
				
				for(int i=0;i<COLOUMNS.size();i++)
				{
					
				String u=COLOUMNS.get(i).getText();
				System.out.println(u);
				if(u.equals(nn))
				{
					
					System.out.println("this is to get a partivular test" +u);
					break;
					
				}
				
				}
	}
	}
}
	
	

