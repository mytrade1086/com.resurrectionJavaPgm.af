package Programs;

import java.util.Arrays;

public class ArrayLargestSmallest {
	
	public static void main(String[] args) {
	
		
		int []sal= {12,34,56,65,11};
		
		
		int largest=sal[0];
		int smallest=sal[0];
		
		
		for(int i=0;i<sal.length;i++) {
			
			if(largest<sal[i]) {
				
				largest=sal[i];
				
			}
			
              if(smallest>sal[i]) {
				
            	  smallest=sal[i];
				
			}
			
		}
		System.out.println(Arrays.toString(sal)); //[12, 34, 56, 65, 11]
		System.out.println(largest); //65
		System.out.println(smallest);//11
	}

}
