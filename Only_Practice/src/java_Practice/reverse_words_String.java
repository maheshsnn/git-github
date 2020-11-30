package java_Practice;

public class reverse_words_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Mahesh is vl emp";
		
		String s1[]=s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			String x=s1[i];
			
			for(int j=x.length()-1;j>=0;j--)
			{
				System.out.print(x.charAt(j));
			}
		}
		
		

	}

}
