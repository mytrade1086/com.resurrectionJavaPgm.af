package Programs;

public class fibonacciDemo {
	
	
	public static void main(String[] args) {
		
		int first=0;
		int second=1;
		
		System.out.print(first+" "+second);
		
		
		for (int i=1;i<10;i++) {
			
			int c;
			c=first+second;
			
			System.out.print(" "+c);
			
			first=second;
			second=c;
			
		}
		
		
		
	}

}
