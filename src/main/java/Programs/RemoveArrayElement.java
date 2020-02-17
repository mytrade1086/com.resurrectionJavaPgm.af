package Programs;

import java.util.Arrays;

public class RemoveArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {23,27,34,4,43,2};
		
		int delete=34;
		
		System.out.println("Before Change"+Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			
			if(delete==a[i]) {
				
				
				for(int j=i;j<a.length-1;j++) {
					
					a[j]=a[j+1];
				}
				break;
				
				
				
			}
		}
		
		
		System.out.println("Post change"+Arrays.toString(a));
		
	}

}
