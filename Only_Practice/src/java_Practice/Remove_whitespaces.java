package java_Practice;

public class Remove_whitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ma h e s h";
		StringBuilder br = new StringBuilder();

		char[] ch = s.toCharArray();
		int l = s.length();

		for (int i = 0; i < l; i++) {
			if (!Character.isWhitespace(ch[i])) {
				br.append(ch[i]);

			}

		}
		System.out.print(br);

	}

}
