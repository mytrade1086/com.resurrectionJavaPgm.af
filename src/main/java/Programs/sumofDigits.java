package Programs;

public class sumofDigits {
	
	public static void main(String[] args) {
		
		int num=54321;
		int sum=0;
		
		while(num>0) {
			
			sum=sum+num%10;
			
			num=num/10;
			
		}
		
		System.out.println(sum);//15
		
	}

}
