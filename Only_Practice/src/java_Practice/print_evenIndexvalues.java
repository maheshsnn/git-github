package java_Practice;

public class print_evenIndexvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "123456789";

		for (int i = 0; i < s.length(); i++) {
			
			int ss=Character.getNumericValue(s.charAt(i));
			//System.out.println(ss);

			if (i % 2 == 0 && i!=0) {
				System.out.println(s.charAt(i)+"      "+i);
			}
		}

	}

}
