package Programs;

import java.util.Arrays;

public class ArrayDeppEquals {

	public static void main(String[] args) {
	
		
		int [][] a= { {10,20},{30,40,50},{60 ,70}  };
		int [][] b= { {10,20},{30,40,50},{60 ,70}  };
		int [][] c= { {10,20},{30,50},{60 ,70}  };
		
		
		
		System.out.println(Arrays.equals(a, b)); //False
		
		int [] i= { 10,20};
		int [] j= { 10,20};
		System.out.println(Arrays.equals(i, j)); //true   //noticed that works ok for single array. But fails for 2d array
		
		
		
		
		System.out.println(Arrays.deepEquals(a, b)); //true
		System.out.println(Arrays.deepEquals(b, c));//false
		
		System.out.println(Arrays.deepEquals(c, a));//false
		
	}

}
