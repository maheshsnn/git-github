package java_Practice;

public class replacealla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ABC123*&%$#";

		String r = s.replaceAll("[^A-Z,0-9]", "!");
		System.out.println(r);

	}

}
