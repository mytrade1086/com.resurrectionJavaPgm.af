package Programs;
public class MultiThreadingImplementingRunnable implements Runnable {

	public void run() {
		System.out.println("Current Thread  is: "+Thread.currentThread().getName());  
		for (int i = 91; i < 96; i++) {
			System.out.println(i);
			
		}
	}

	public static void main(String[] args) {
		
		 System.out.println(Thread.currentThread().getName());  
		MultiThreadingImplementingRunnable mt = new MultiThreadingImplementingRunnable();
		Thread t1 = new Thread(mt);
		MultiThreadingImplementingRunnable2 mt1 = new MultiThreadingImplementingRunnable2();
		Thread t2 = new Thread(mt1);
		t1.start();
		System.out.println(t1.getName());
		System.out.println("Current Thread  is: "+Thread.currentThread().getName());  
		// t1.start(); //java.lang.IllegalThreadStateException if we start twice
		t2.start();
		System.out.println(t2.getName());
		
	}

}

class MultiThreadingImplementingRunnable2 implements Runnable {

	public void run() {
		 System.out.println("Current Thread  is: "+Thread.currentThread().getName());  
		for (int i = 1; i < 6; i++) {
			System.out.println(i);
		}
	}
}