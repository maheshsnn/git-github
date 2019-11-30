package Practice;

import java.util.ArrayList;

public class Integer_Sum_String {

	public static void main(String[] args) {

		String a = "jklmn489pjro635ops";

		int num = 0;
		String s = "";

		for (int i = 0; i < a.length(); i++) {

			if (Character.isDigit(a.charAt(i))) {

				// Adding all the numbers

				int Numeric = Character.getNumericValue(a.charAt(i));

				num = num + Numeric;

				// Adding numbers in string format

				s = s + a.charAt(i);

			}

		}
		System.out.println(num);
		System.out.println("s    " + s);

	}
}