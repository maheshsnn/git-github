package String_concepts;

import java.util.ArrayList;

public class Largest_number_inarraylist {
	
	public static void main(String[] args) {
		
		ArrayList <Integer>al=new ArrayList<Integer>();
		
		al.add(10);
		al.add(100);
		al.add(15);
		al.add(50);
		//System.out.println(al);
		
		int largest=al.get(0);
		int secondlargest=al.get(0);
		
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)>largest)
			{
				largest=al.get(i);
				
			}
			else if(al.get(i)>secondlargest)
			{				
				secondlargest=al.get(i);
			}
		}
		System.out.println("largest is "+largest);
		System.out.println("secondlargest is "+secondlargest);
		
		
	}

}
