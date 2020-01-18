package Programs;

class incr {
	int counter;
	public void raiseCounter() {
		counter++;
	};
}

public class MultiThreadingSynchronized {
	public static void main(String[] args) throws InterruptedException {

		 final incr inc = new incr();
		Thread t = new Thread(new Runnable() {

			public void run() {

				for (int i = 1; i <= 10000; i++) {
					inc.raiseCounter();
					//System.out.println(inc.counter);
				}
			}

		});
		//
		t.start();
		//t.join();
		
		
		
		
		Thread t2 = new Thread(new Runnable() {

			public void run() {

				for (int i = 1; i <= 10000; i++) {
					inc.raiseCounter();
					//System.out.println(inc.counter);
				}
			}

		});
		//
		t2.start();
		t2.join();
		System.out.println(inc.counter);

	}

}