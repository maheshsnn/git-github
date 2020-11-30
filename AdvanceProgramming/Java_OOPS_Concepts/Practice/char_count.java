package Practice;

import java.util.HashMap;

public class char_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		String s="mahesh";
		
		HashMap<Character,Integer>c=new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++){
			
		if(c.containsKey(s.charAt(i)))
		{
			c.put(s.charAt(i),c.get(s.charAt(i))+1);
		}
		else
		{
			c.put(s.charAt(i),1);
		}
			
			
		}
		System.out.println(c);
	}

}
