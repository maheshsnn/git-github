package Innerclass;

public class Class_Withstatic_Inner_Outerclass {
	
static	class inner{
		
		public void innerclass()
		{
			System.out.println("inner class");
		}
	}
	
	public void outerclass()
	{
		System.out.println("outer class"); 
		
	}
	
	public static void main(String[] args) {
		inner i=new inner();
		i.innerclass();
		
	}

}
