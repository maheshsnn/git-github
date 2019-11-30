package String_concepts;

public class Recurssive {
	
	//print numbers without using loop
static	int count=0;
	
	static void p()
	{
		count++;
		
		if(count<=100)
		{
			System.out.println(count);
			p();
		}
	}
	
	public static void main(String[] args) {  
	p();  
	}  
	

}
