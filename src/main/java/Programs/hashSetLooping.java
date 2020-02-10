package Programs;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetLooping {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("sagar");
		hs.add("advait");
		hs.add("himani");

		// Method 1: for each works with Set also
		System.out.println("Using For Each");
		for (String str : hs) {
			System.out.println(str);
//			Using For Each
//			himani
//			advait
//			sagar
		
		
		//Method 2 Iterator
		System.out.println("Using Iterator");
		Iterator<String> istr=hs.iterator();
		
		while(istr.hasNext()) {
			System.out.println(istr.next());
		}
		
//		Using Iterator
//		himani
//		advait
//		sagar

	}
}
}
