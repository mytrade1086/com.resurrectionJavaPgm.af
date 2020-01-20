package Programs;

public class Recursion {

	public static void main(String[] args) {

		//writeTenTimes(8);
		WithoutLoop(5);

	}

	public static void writeTenTimes(int num) {
		if (num >= 1) {
			System.out.print("hi ");
			num = num - 1;
			writeTenTimes(num);
		}
	}
	
	
	
	public static void WithoutLoop(int num) {
		if (num >= 1) {
			System.out.print(num+" ");
			WithoutLoop(num-1);
		}
		
		//5 4 3 2 1 
		
	}
	
}
