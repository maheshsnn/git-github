package String_concepts;

public class even_index {
	
	public static void main(String[] args) {
		String s="123456789";
		
		for(int i=1;i<s.length();i++)
		{
			System.out.println("value of i  pre "+ i);
			System.out.println("The value of even index is "  +s.charAt(i));
			i=i+1;
			System.out.println("value of i  post "+ i);
		
		}
	}

}
