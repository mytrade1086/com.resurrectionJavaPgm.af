package Programs;

import java.util.Arrays;

import org.apache.logging.log4j.core.appender.SyslogAppender;

public class arrayEqual {

	public static void main(String[] args) {

		int[][] a = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };
		int[][] b = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };

		// Printing Rows
		for (int[] row : a) {
			System.out.println(Arrays.toString(row));
		}

//		[1, 2]
//		[3, 4, 5]
//		[6, 7, 8, 9]

		System.out.println("a.length gives " + a.length); // 3 Rows

		for (int i = 0; i < a.length; i++) {
			if (a.length != b.length) {
				System.out.println("Row count is different in both the arrays");
				break;
			}

			for (int j = 0; j < a[i].length; j++) {
				if (a[i].length != b[i].length) {
					System.out.println("Col count is different at Row level");
					break;
				}
				if (a[i][j] != b[i][j]) {
					System.out.println("Items not equal");
					break;
				}
				
				else{
					
					System.out.print(a[i][j] +" equals "+b[i][j]+" ");
					
					
					
//					1 equals 1 2 equals 2 
//					3 equals 3 4 equals 4 5 equals 5 
//					6 equals 6 7 equals 7 8 equals 8 9 equals 9 
					
				}
				
			}
			System.out.println("");
		}
//		1 2 
//		3 4 5 
//		6 7 8 9 

		System.out.println("Are two arrays equal " + a.equals(b)); // will give false as its a reference comparison

		System.out.println("Are two arrays equal " + Arrays.equals(a, b)); // Are two arrays equal false

		System.out.println("Are two arrays equal " + Arrays.deepEquals(a, b)); // Are two arrays equal true
		
		

	}

}
