package String_concepts;

import java.util.HashMap;

public class Count_of_character_otherway {
	
	public static void main(String[] args) {
		
	
	String s="AAAABBMMXXYYYZZZZ";
	
	char[] ch=s.toCharArray();
	
	HashMap<Character,Integer>mapcount=new HashMap<Character,Integer>(); 
		
	
	
	for(char x:ch)
	{
		
	if(mapcount.containsKey(x))
	{
		
		mapcount.put(x,mapcount.get(x)+1);
		
	}
	else
	{
		mapcount.put(x,1);
	}
		
	}
	
	System.out.println(mapcount);
	}
}
