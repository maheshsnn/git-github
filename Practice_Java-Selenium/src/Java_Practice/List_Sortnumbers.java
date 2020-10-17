package Java_Practice;

import java.util.ArrayList;
import java.util.List;

public class List_Sortnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<Integer>num=new ArrayList<>();
	num.add(10);
	num.add(102);
	num.add(100);
	num.add(100);
	num.add(90);
	num.add(80);
	num.add(70);
	num.add(101);
	System.out.println(num);
	
	for(int i=0;i<num.size();i++)
	{
		for(int j=i+1;j<num.size();j++)
		{
			if(num.get(i)>num.get(j))
			{
				int temp=num.get(i);
				num.set(i, num.get(j));
				num.set(j, temp);
			}
			
			if(num.get(i)==num.get(j))
			{
				num.remove(j);
			//	System.out.println("removed element is "+num.get(i));
			}
			
		}
		System.out.println(num.get(i));
	}
	
	}

}
