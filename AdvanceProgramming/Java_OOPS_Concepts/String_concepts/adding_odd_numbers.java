package String_concepts;

public class adding_odd_numbers {
	
	public static void main(String[] args) {
		
		int sum=0;
		int[] x={1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2==1)
			{
				System.out.println(x[i]);
				
				sum=sum+x[i];
				
			}
			
			System.out.println(sum);
		}
	}
	
	
	
	

}
