package java_Practice;

public class print_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		
		int k=0;
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=k;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			k=k+2;
		}

	}

}
