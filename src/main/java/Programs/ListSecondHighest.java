package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSecondHighest {

	
	public static void main(String[] args) {
		List<Integer> newlist=new ArrayList<Integer>();
		newlist.add(45);
		newlist.add(4);
		newlist.add(745);
		newlist.add(44445);
		
		Collections.sort(newlist);
		System.out.println(newlist.get(1));// second in ascending  45
		
		Collections.sort(newlist, Collections.reverseOrder());
		System.out.println(newlist.get(1));// second in Descending 745
	}
	
	
	
	
	
}
