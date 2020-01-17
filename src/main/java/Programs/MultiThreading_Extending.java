package Programs;

//There are two ways to create a thread:
//#1 By extending Thread class
//#2 By implementing Runnable interface.

class demo1 extends Thread {
	@Override
	public void run() { 
		//run method created to thread
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
	}
}

class demo2 extends Thread {
	@Override
	public void run() {
		//run method created to thread
		for (int i = 11; i < 21; i++) {
			System.out.println(i);
		}
	}
	
}

public class MultiThreading_Extending{
public static void main(String[] args) {
		
		demo1 d1=new demo1();
		demo2 d2=new demo2();	
		
		d1.start();  //Start the thread
		d2.start();	//Start the thread
		//Output will be mixed of both the threads.
	}
}
