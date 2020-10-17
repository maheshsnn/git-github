package Selenium_Practice;

public class permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abc";
		// System.out.println(s.substring(2));

		printPermutn(s, "");

	}

	static void printPermutn(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans + " ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);

			printPermutn(ros, ans + ch);

		}
	}

}
