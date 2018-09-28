package Multi_Threading;

public class lambda_class {

	public static void main(String[] args) throws Exception {

		/*Runnable obj1 = () -> {//lamda code

			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println("Hi");
			}

		};
		Runnable obj2 = () -> {//lamda code

			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println("Hello");
			}

		};
*/
		// obj1.run();
		// obj2.run();

		Thread t1 = new Thread( () -> {//lamda code

			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println("Hi");
			}

		});
		Thread t2 = new Thread( () -> {//lamda code

			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println("Hello");
			}

		});

		t1.start();
		Thread.sleep(10);
		t2.start();

		t1.join();
		t2.join();

		System.out.println("bye");

	}

}
