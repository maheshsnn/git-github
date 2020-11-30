package java_Practice;

public class recursive_print100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursive_print100.mm();
	}

	static int count = 0;

	public static void mm()

	{
		while (count <= 100) {
			count++;
			System.out.println(count);
			mm();
		}
	}
}
