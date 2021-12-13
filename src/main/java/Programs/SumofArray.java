package Programs;

public class SumofArray {
	
	public static void main(String[] args) {
		
		int[] demo= {1,2,3,4,5,6,7,8,9};
		int i=0;int j=demo.length-1;
		while(j>i) {
			
//			if((demo[i]+demo[j])==10) {	
//				System.out.println(i +" "+j);
//			}
			
			System.out.println("Prinnting "+demo[i]+demo[j]);
			i++;
			j--;
			
		}
		
	}

}
