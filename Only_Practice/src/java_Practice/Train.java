package java_Practice;

public class Train {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Train.tain(74);
	}

	public static void tain(int s) {
		if (s > 0 && s < 73) {
			if (s % 8 == 1 || s % 8 == 4) {
				System.out.println("Lower");
			} else if (s % 8 == 2 || s % 8 == 5) {
				System.out.println("Middle");
			} else if (s % 8 == 3 || s % 8 == 6) {
				System.out.println("Upper");
			} else if (s % 8 == 7) {
				System.out.println("side Lower");
			} else {
				System.out.println("side upper");

			}
		} else {
			System.out.println("invalid");
		}
	}

}
