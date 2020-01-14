package Programs;

public class ArrayMissingNumber {

	public static void main(String[] args) {

		int[] first = { 1, 2, 3, 4,5,6,7};
		int sum = 0;
		for (int i = 0; i < first.length; i++) {
			sum = sum + first[i];
		}

		System.out.println(sum);// 16
		int sum1 = 0;
		for (int j = 1; j <= 8; j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum1);// 21
        System.out.println("Missing Number= " + (sum1 - sum)); // 5

	}

}
