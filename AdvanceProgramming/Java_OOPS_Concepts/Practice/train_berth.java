package Practice;

public class train_berth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		train(10);

	}

	public static void train(int s)

	{
		if (s > 0 && s < 73) {
			if (s % 8 == 1 || s % 8 == 4) {
				System.out.println("Lower");

			} else if (s % 8 == 2 || s % 8 == 5) {
				System.out.println("middle");

			} else if (s % 8 == 3 || s % 8 == 6) {
				System.out.println("upper");

			} else if (s % 8 == 7) {
				System.out.println("side Lower");

			} else if (s % 8 == 1 || s % 8 == 4) {
				System.out.println("side  upper");

			} else {
				System.out.println("Invalid seats");
			}
		}

	}

}
