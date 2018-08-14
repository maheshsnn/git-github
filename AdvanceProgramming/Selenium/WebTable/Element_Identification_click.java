package WebTable;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Element_Identification_click {
	
	static WebDriver d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		d=new FirefoxDriver();
		d.get("http://aponline.gov.in/apportal/contact/sec_select.asp?sid=1%22");
		new Select(d.findElement(By.id("Select1"))).selectByVisibleText("Agriculture and Co-Operation");
		List<WebElement>coloumns=d.findElements(By.xpath("//table[@ id='Table9']/tbody/tr/td"));
		
			

		int si=coloumns.size();
				
			
		
		for(int i=0;i<si;i++)
		{
		String l=coloumns.get(i).getText();
		
		//al.add(l);
	//	System.out.println(l);
		if(l.equals("Sri  Budithi Rajasekhar, IAS "))
		{					
			System.out.println("the string is "+ l);
			
		//if we want to click on the wanted link
			//coloumns.get(i).click();
			
			break;
		}
		
		
		}
	//System.out.print(al);
		
	}

}
