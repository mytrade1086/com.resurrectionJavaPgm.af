package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UBSGroupingQuestion {
// find pairs of Numbers
	public static void main(String[] args) {
		int[] a = { 10, 30, 20, 10, 20 ,50,60,50,70,90};

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			Integer inc = hm.put(a[i], 700);   //Dummy key
			if (inc == null) {               // mao returns null on first entry
				hm.put(a[i], 1);
			} else {
				hm.put(a[i], ++inc);       //pre increment inc on second attempt
			}
			//System.out.println(hm);
		}
		
		Set<Integer> key = hm.keySet();
		for (Integer k : key) {
			System.out.println(k + ":" + hm.get(k) / 2);
		}

	}

}
