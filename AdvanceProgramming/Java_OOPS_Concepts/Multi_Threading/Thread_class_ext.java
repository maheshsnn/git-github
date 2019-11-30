package Multi_Threading;

public class Thread_class_ext {

	public static void main(String[] args) throws Exception {

		Runnable obj1 = new Runnable() {

			public void run() {

				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					System.out.println("Hi");
				}

			}
		};

		Runnable obj2 = new Runnable() {

			public void run() {
				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					System.out.println("Hello");
				}
			}

		};
		
		//creating lambda class

		Thread t1 = new Thread(new Runnable() {
			public void run() {

				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					System.out.println("Hi");
				}

			}
		});
		
		//creating lambda class

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					System.out.println("Hello");
				}
			}

		});

		
		//creating lambda class pure lamda
		Thread t3 = new Thread(() -> {

			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println("Hi");
			}

		});
		
		
		//creating lambda class pure lamda
		Thread t4 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println("Hello");
			}

		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

	

		// System.out.println("bye");

	}

}

/*
 * class A extends Thread {
 * 
 * public void run() {
 * 
 * for (int i = 0; i < 5; i++) { try { Thread.sleep(1000); } catch
 * (InterruptedException e) { } System.out.println("Hi"); }
 * 
 * }
 * 
 * }
 */

/*
 * class B extends Thread { public void run() { for (int i = 0; i < 5; i++) {
 * try { Thread.sleep(1000); } catch (InterruptedException e) { }
 * System.out.println("Hello"); } }
 * 
 * }
 */