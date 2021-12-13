package Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class listToarrayDemo {

	public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
		al.add("amit");
		al.add("preeti");
		al.add("neha");
		al.add("desh");

		
		//#Method 1 Looping arraylist
		
		String[] strArr = new String[al.size()];
		for (int i = 0; i < al.size(); i++) {
			strArr[i] = al.get(i);
		}
		System.out.println("Printing Array :" + Arrays.toString(strArr));
		// Printing Array :[amit, preeti, neha, desh]
		
		
		//# .toArray() method
		
		System.err.println("--Separator----------");
		
		String[]strArr2=al.toArray(new String[al.size()]);
		System.out.println("Printing Array :" + Arrays.toString(strArr2));

	}

}
