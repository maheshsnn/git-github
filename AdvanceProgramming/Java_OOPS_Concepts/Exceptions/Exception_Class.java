package Exceptions;

public class Exception_Class {
	
	public static void main(String[] args) {
		
	
	
	try {
		int age=50;
		
		if(age>60)
		{
			throw new Userdefined_Exception("Exception in main which is a user defined exceptionssssss");
		}
		
	} catch (Userdefined_Exception s) {
		// TODO Auto-generated catch block
		s.printStackTrace();
	}

	
	
}
	}
