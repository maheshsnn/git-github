package String_concepts;

public class star_print {
	
	
	public static void main(String[] args) {
		star_print.star135();
		star_print.star12345();
	}
	
	
	public static void star135()
	{
		int k=1;
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<k;j++)
			{
				System.out.print("*");
			}
			k=k+2;
			System.out.println();
		}
		
	}
		public static void star12345()
		{
			//int k=1;
			for(int i=0;i<=5;i++)
			{
				
				for(int j=0;j<=i;j++)
				{
					System.out.print("*");
				}
				//k=k+2;
				System.out.println();
			
		
	}

}}
