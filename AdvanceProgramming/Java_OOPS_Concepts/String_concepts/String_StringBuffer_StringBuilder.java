package String_concepts;

public class String_StringBuffer_StringBuilder {
	
	
	//String is immutable
	//String buffer and String builder us mutable
	
	
	/*
	 * String buffer is synchronized and thread safe execution time high
	 * String builder is non-synchronised and multiple thread execution can be done due to which excution time is less
	 * 
	 */
	public static void main(String[] args) {
		StringBuilder br = new StringBuilder("mahesh");
		br.reverse();
		System.out.println(br);
		
	}

}
