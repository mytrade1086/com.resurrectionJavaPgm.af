package Programs;

public class Factorial {

	public static void main(String[] args) {
		factorial(12);// 479001600
		factorial(5);
	}
	public static void factorial(int num) {
		int factorial = 1;
		while (num >= 1) {
			factorial = factorial * num;
			num--;
		}
		System.out.println(factorial);
	}
}
