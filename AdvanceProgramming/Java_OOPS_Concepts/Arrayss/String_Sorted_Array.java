package Arrayss;

public class String_Sorted_Array {
	
	public static void main(String[] args) {
		
		String[] names= {"mahesh","aaaa","ssssss","ccccc"};
		
		int leng=names.length;
		
		for(int i=0;i<leng;i++)
		{
			
			for(int j=i+1;j<leng;j++)
			{
				
				if(names[i].compareTo(names[j])>0)
				{
					
					String temp=names[i];
					names[i]=names[j];
					
					names[j]=temp;
					
				}
			}
			
			System.out.println(names[i]);
		}
	}

}
