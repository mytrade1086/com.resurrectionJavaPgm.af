package Programs;

public class oddEvenCount {

	static int countodd = 0;
	static int counteven = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 57494312;

		while (num > 0) {

			int endDigit = num % 10;

			num = num / 10;

			if (endDigit % 2 == 0) {
				counteven++;

			}

			else if (endDigit % 2 != 0) {
				countodd++;

			}
		}

		System.out.println("Even :" + counteven);
		System.out.println("odd :" + countodd);
		
		//Even :3
		//odd :5
	}

}
