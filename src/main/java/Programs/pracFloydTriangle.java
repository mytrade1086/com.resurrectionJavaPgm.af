package Programs;

public class pracFloydTriangle {
	public static void main(String args[]) {
		
		int ini=1;
		for(int i=1;i<7;i++) {
			
			for(int j=1; j<=i;j++) {
				
				System.out.print(ini++ +" ");
			}
			
			System.out.println("");
		}

		
		
	}
}

//Floyd's triangle
//****************
//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 
//16 17 18 19 20 21 