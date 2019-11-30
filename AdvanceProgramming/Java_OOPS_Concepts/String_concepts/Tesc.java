package String_concepts;

public class Tesc {
	
public static void main(String[] args) {
	
	String s="000001205";
	char[] ch=s.toCharArray();
	for(int i=0;i<s.length();i++){
		
		
		
		if(ch[i]=='0')
		{
			System.out.println(ch[i]);
		}
		
		else if(ch[i]!='0')
		{
			System.out.println("not equal    "+ch[i]);
			break;
		}
			
	
	
}
	}
}
