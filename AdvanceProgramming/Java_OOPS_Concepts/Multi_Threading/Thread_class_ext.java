package Multi_Threading;

public class Thread_class_ext {

	public static void main(String[] args) throws Exception {

		A obj1 = new A();
		B obj2 = new B();


obj1.start();
Thread.sleep(10);
obj2.start();
		
		
		
		
		obj1.join();
		obj2.join();
		
		System.out.println("bye");

	}

}

class A extends Thread {

	public void run() {

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println("Hi");
		}

	}

}

class B extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println("Hello");
		}
	}

}