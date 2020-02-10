package Programs;

public class countNumbers {

	
	public static void main(String[] args) {
		
		
		int num=5456;
		int count=0;
		while(num>0) {
			
			
			num=num/10;
			count++;
		}
		
		System.out.println(count);
	}
}
