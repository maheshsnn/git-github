package String_concepts;

import java.util.HashMap;

public class Count__of_character {
	
	public static void main(String[] args) {
		
		String s="AAABBBCCDEEEEEFFFFFFF";
		
		
		
		HashMap<Character,Integer>mapcount=new HashMap<Character,Integer>();
		
		
		for(int i=0;i<s.length();i++)
		{
			
			if(mapcount.containsKey(s.charAt(i)))
			{
				mapcount.put(s.charAt(i), mapcount.get(s.charAt(i))+1);
			}
			
			 else
	            {
	                //If char is not present in charCountMap,
	                //putting this char to charCountMap with 1 as it's value
	 
				 mapcount.put(s.charAt(i), 1);
	            }
			
		}
		System.out.println(mapcount);
		
		
	}

}
