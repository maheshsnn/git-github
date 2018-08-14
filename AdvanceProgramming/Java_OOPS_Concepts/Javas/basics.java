package Javas;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class basics {

	public static void main(String[] args) {

		//basics.fibonacci();
		
		basics.largest();

	}
	
	
	public void handlingWindows(WebDriver driver){
		
		String parentwindow=driver.getWindowHandle();
		
	Set<String>wins=driver.getWindowHandles();
	
	
	Iterator<String> itr=wins.iterator();
	
	
	while(itr.hasNext())
	{
		String child=itr.next();
		
		if(!parentwindow.equals(child))
		{
			driver.switchTo().window(child);
		}
				
	}
	
	
	
	
	/*for(String child:wins)
	{
		
		if(!parentwindow.equals(child))
		{
			driver.switchTo().window(child);
		}
	}*/
		
		
	}
	
	public static void largest()
	{
		
		int[] al={1,2,3,4,5};
		
		int largest=al[0];
		
		
for(int i=0;i<=al.length-1;i++)
{
		
	if(al[i]>largest)
	{
		largest=al[i];
		
	}

	
}
System.out.println(largest);

		
		
	}
	
	
	public static void palindrome()
	{
		
		int n=383,sum=0,r,temp;
		
		temp=n;
		
		while(n>0){
		
		r=n%10;
		
		sum=(sum*10)+r;
		
		n=n/10;
		
		}
		
	}

	public static void fibonacci() {
		int n1 = 0, n2 = 1, n3;

		int count = 10;
		System.out.println(n1 + "  " + n2);

		for (int i = 2; i <= count; i++) {
			n3 = n1 + n2;

			System.out.println(n3);

			n1 = n2;
			n2 = n3;

		}

	}
}
