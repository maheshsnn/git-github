package java_Practice;

import java.util.HashMap;

public class hasmap_charcount {

	public static void main(String[] args) {

		String s = "Mahesh";
		

		HashMap<Character,Integer>mp=new HashMap<>();
		
	for(int i=0;i<s.length();i++)
	{
		
		if(mp.containsKey(s.charAt(i)))
		{
			mp.put(s.charAt(i), mp.get(s.charAt(i))+1);
		}
		else
		{
			mp.put(s.charAt(i), 1);
		}
	}
	System.out.println(mp);
		
	}

}
