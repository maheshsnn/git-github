package Multi_Threading;

public class synchronized_class {

	public static void main(String[] args) throws Exception {

		counter c = new counter();

		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <=1000; i++) {
					try {Thread.sleep(10);} catch (InterruptedException e) {}

					c.increamnet();
				}

			}

		});

		Thread t2 = new Thread(new Runnable() {// lamda code
			@Override
			public void run() {
				for (int i = 1; i <=1000; i++) {
					try {Thread.sleep(10);} catch (InterruptedException e) {}

					c.increamnet();
				}

			}
		});

		

		t1.start();
		
		Thread.sleep(05);
				
		t2.start();
		
		
		

		t1.join();
		
		t2.join();
		
		System.out.println("test              "+c.count);
	}

}

class counter {

	int count;

	public  synchronized void increamnet() {//we will get exact value with the synchronised block
		count++;
		notify();
	}
}
