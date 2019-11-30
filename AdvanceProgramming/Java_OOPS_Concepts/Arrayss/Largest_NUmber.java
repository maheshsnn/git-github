package Arrayss;

public class Largest_NUmber {

	public static void main(String[] args) {

		int[] nums = { 10, 30, 5, 40, 100, 90, 70, 80, 60, 50, 20 };

		int largest = nums[0];
		int second=nums[0];
		int smallest = nums[0];
		int secondsmallest=nums[0];

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
			
			if(nums[i]<smallest)
			{
				smallest=nums[i];
			}
			else if(nums[i]<secondsmallest)
			{
				secondsmallest=nums[i];
			}
		}
		
		System.out.println( smallest+"      "+secondsmallest); 
		System.out.println( largest+"      "+second); 
		

}}
