package Arrayss;

public class Student_class {

	public static void main(String[] args) {
		int total = 0;

		int[] Marks = { 10, 20, 30, 75, 45, 60 };

		int siz = Marks.length;

		for (int i = 0; i < siz; i++) {

			total = total + Marks[i];

			if (Marks[i] < 35) {

				System.out.println("fail for marks   " + Marks[i]);

			}

			else {
				System.out.println("Pass for marks " + Marks[i]);

			}

		}

		System.out.println("Total marks are    " + total);

	}

}
