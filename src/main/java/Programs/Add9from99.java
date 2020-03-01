package Programs;

public class Add9from99 {
	
	//Works till 98
	
	//Add all 9 till 59

	static int total;
	public static void main(String[] args) {
	
        int num=59;
			while(num!=0) {		
			if((num%10)==9) {				
				total=total+9;		
			}
			num--;
			}	
		System.out.println(total);
	}

}
