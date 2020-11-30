package Java_Practice;

public class Array_Number_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 0, 9, 5, 2, 3, 4, 1, 8, 6, 7 };
		int total=numbers.length;

		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
				
			}
			System.out.print(numbers[i]);
			
		}

	}

}
