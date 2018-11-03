package String_concepts;

public class Get_alphabets_only {

	
	public static void main(String[] args) {
		
		
		String s="word@#$&^%$#@( word 1234";
		
		System.out.println(s.replaceAll("[^a-zA-Z]",""));
		
		
	}
}
