package Multi_Threading;

public class Runnable_class {

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
		Runnable obj2 = new Runnable()
				{
			public void run() {

				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					System.out.println("Hello");
				}

			}};

		// obj1.run();
		// obj2.run();

		Thread t1 = new Thread(obj1) ;
		Thread t2 = new Thread(obj2) ;
		
		
		t1.start();
		Thread.sleep(10);
		t2.start();

		t1.join();
		t2.join();

		System.out.println("bye");

	}

}
