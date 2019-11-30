package String_concepts;

public class Reverse_Sringword {
	
	public static void main(String[] args) {
		
		
		String s="Mahesh is the employee of valuelabs";
		
		
		String[] ss=s.split(" ");
		
		
		System.out.println(ss.length);
		
		for(int i=0;i<=ss.length-1;i++)
		{
			String sss=ss[i];
			
			for(int j=sss.length()-1;j>=0;j--)
			{
				System.out.print(sss.charAt(j));
				
			}
			
		
		}
		
		
		
		
	}

}
