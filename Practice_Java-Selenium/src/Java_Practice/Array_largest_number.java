package Java_Practice;

public class Array_largest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  nums[]={10,100,102,90,101,70};
		
		
		
		int largest=nums[0];
		int second=nums[0];
		
		for(int i=1;i<nums.length;i++)
		{
			if(nums[i]>largest)
			{
				largest=nums[i];
			
			}
			else if(nums[i]>second)
			{
				second=nums[i];
			}
			
		}
		System.out.println(largest);
		System.out.println(second); 
		

	}

}
