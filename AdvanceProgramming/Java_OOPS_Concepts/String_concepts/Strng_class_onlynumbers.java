package String_concepts;

public class Strng_class_onlynumbers {
	
	public static void main(String[] args) {
		
		String s=null;//="this is my id 12345 error 571";
		
		
		String s1="mahesh";
		String ss=null;
		
		
		String s2="Mokshitha";
		String temp=null;
		StringBuilder br=new StringBuilder(s1);
		
		//System.out.println(s2.replaceAll("M", "**"));
		
		for(int i=0;i<s1.length();i++)
		{
			if(i%2==0)
			{
		//	char c=s1.charAt(i);
			
			br.setCharAt(i,'*');
				
				// ss=s1.replace(s.charAt(i),'*');
			
			}
			System.out.println(br);
		}
		
/*		temp=s1;
		s1=s2;
		s2=temp;
		
		System.out.println(s1);
		System.out.println(s2);
		
		*/
		s=s1+s2;
		
		 /*s1=s.substring(s1.length());
		System.out.println(s1);
		 s2=s.substring(0,s.length()-s1.length());
		 System.out.println(s2);
		*/
		
	}

}
