package java_Practice;

public class sum_of_number_inaString {
	
	public static void main(String[] args) {
		
		String s="AB12CD34";
		int sum=0;
		char[]ch=s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(ch[i]))
			{
				sum=sum+Character.getNumericValue(ch[i]);
			}
		}
		
		System.out.println(sum);
	}

}
