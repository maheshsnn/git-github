package Hashmap;

import java.util.HashMap;

public class HashmapforVariablestoring {
	
	
	public static void main(String[] args) {
		
		HashmapforVariablestoring mm= new HashmapforVariablestoring();
	System.out.println(mm.hmsp().get(2));
		
	}
	
	
	public HashMap<Integer, String> hmsp()
	{
	HashMap<Integer, String> month=new HashMap<Integer,String>();
	
	month.put(1, "jan");
	month.put(2, "feb");
	month.put(3, "march");
	//month.remove(1);
	
	

	return month;
	}
}
