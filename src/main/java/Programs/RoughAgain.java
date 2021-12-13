package Programs;

public class RoughAgain {

	public static void main(String[] args) {
		
//		int num=54320;
//		int rev=0;
//		while(num>0) {
//			rev=rev*10+num%10;
//			num=num/10;
//		}
//		System.out.println(rev);
//	}
		
//		int num=10;
//		int fact=1;
//		while(num>=1) {
//		 fact=fact*num;
//		 num--;
//	 }
//	 
//	 System.out.println(fact);
	 
	 
	// 0 1 1 2 3 5 8 13 21 34 55
		//fibonacci
		int f=0,s=1;
		System.out.print(f +" "+s);
		for(int i=0;i<5;i++) {
			int c=f+s;//1	
			System.out.print(" "+c);
			f=s;
			s=c;	
			
		}
		
		
		
	 
	 
	 
	 
	 
	 
	
}
}
