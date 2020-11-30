package java_Practice;

public class characters_alternatively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "xyz";
		String p = "abc";

		String r = "";

		for (int i = 0; i < s.length(); i++) {
			r += s.charAt(i);

			if (i < p.length()) {
				r += p.charAt(i);
			}
		}

		System.out.println(r);

	}

}
