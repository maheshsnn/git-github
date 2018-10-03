package Innerclass;

public class Outter {

	class inner {

		public void innerclass() {
			System.out.println("Inner class");
		}
	}

	public void outerclass() {

		System.out.println("Outer class");
	}

	public static void main(String[] args) {

		Outter O = new Outter();
		
		Outter.inner i=O.new inner();//creating object to acces inner class
		
	//	O.outerclass();
		
		i.innerclass();
	}

}
