package Programs;

public class ternaryOperator {

	public static void main(String[] args) {
	
		int a=10;
		int b=20;
		int c=30;
		
		
		int largestofab=a>b?a:b; //if a>b then return a or then return b
		System.out.println(largestofab); //20 b is returned
		
		int largest=c>largestofab?c:largestofab;
		
		System.out.println(largest); //30 "c" is returned
		
	}

}
