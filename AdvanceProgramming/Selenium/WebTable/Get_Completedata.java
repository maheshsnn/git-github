package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Get_Completedata {
	
static	WebDriver driver;
	
	
	public static void main(String[] args) {
		
		
		List<WebElement>ROWS=driver.findElements(By.xpath(""));
		List<WebElement>Col=driver.findElements(By.xpath(""));
		
	int siz=ROWS.size();
	
	for(int i=0;i<=siz;i++)
	{
		
		if(ROWS.get(i).getText().equals(""))
		{
			
		}
	}
		
		
		int x,y;
		
		x=0;
		
		for(WebElement row:ROWS)
		{
			List<WebElement >Coloumns=row.findElements(By.tagName("td"));
			
			y=0;
			
			for(WebElement Z:Coloumns)
			{
				System.out.println("Rows"+x+"Coloumns"+y+"="+Z.getText());
			}
			y++;		
		}
		
		x++;
		
	}
	
	 

}
