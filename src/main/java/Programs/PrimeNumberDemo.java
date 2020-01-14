package Programs;

public class PrimeNumberDemo {
	
	static int count=0;
	//number divisible by itself only
	
	//range 2 to 50
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
for(int i=3;i<100;i++) {
		
	count=0;
		for(int j=2;j<i;j++) {
			
			
			if(i%j==0) {
				
				count++;
				//boolean flag=true;
				//System.out.println(i);
				//break;
			}
			
			
	
		
		
		

	}
		
		if(count==0) {
			System.out.println(i);
	}
}
	}
}



