package String_concepts;

public class alterantively {
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		String str1="ABC";
		String str2="XYZ";
		
		String str3="";
		
		if(str1.length()>=str2.length()){
            for(int i=0;i<=str1.length()-1;i++){
                str3+=str1.charAt(i);
                if(i<str2.length()){
                    str3+=str2.charAt(i);
                }
            }
        }
		
		
		System.out.println("*******  "+str3);
	}

}
