package Java_Practice;

public class Array_StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] names={"Mahesh","Akhil","Chandu","Chandu"};
		
		int total=names.length;
		
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(names[i].compareTo(names[j])>0)
				{
					String temp=names[i];
					names[i]=names[j];
					names[j]=temp;
					
				}
				if(names[i].compareTo(names[j])==0)
				{
					names[j]=names[total-1];
					total--;
					j--;
				}
			}
			System.out.println(names[i]);
		}
		

	}

}
