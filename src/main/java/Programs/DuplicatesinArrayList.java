package Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesinArrayList {

	public static void main(String[] args) {
		// 
		
		
		ArrayList<String> ar=new ArrayList<String>();
		
		ar.add("sumit");
		ar.add("neha");
		
		ar.add("neha");
		ar.add(("love"));
		
		Set<String> str=new HashSet<String>();
		
		
		for(String ars:ar) {
			
			str.add(ars); 
			System.out.println(str.add(ars));
			
		}
		
		
System.out.println(str); //[love, neha, sumit]
		
	}

}
