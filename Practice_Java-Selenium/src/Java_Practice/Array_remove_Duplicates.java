package Java_Practice;

public class Array_remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]={0,1,2,2,3,5,5,6,6,7,4};
		
		int total=nums.length;
		
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(nums[i]>nums[j]){
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;}
				
				if(nums[i]==nums[j])
				{
					nums[j]=nums[total-1];
					total--;
					j--;
				}
			
			}
			System.out.println(nums[i]);
			
			
		}
		

	}

}
