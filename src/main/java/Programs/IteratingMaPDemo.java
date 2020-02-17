package Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class IteratingMaPDemo {

	public static void main(String[] args) {

		Map<String, String> hm = new LinkedHashMap<String, String>();

		hm.put("name", "sumit");
		hm.put("place", "bhandara");
		hm.put("edu", "BE");
		// #1 Using keySet
		Set<String> ks = hm.keySet();
		for (String s : ks) {
			System.out.println("Keys is: " + s + " value is :" + hm.get(s));
//			Keys is: edu value is :BE
//			Keys is: name value is :sumit
//			Keys is: place value is :bhandara
		}

		// #2
		Set<Entry<String, String>> es = hm.entrySet();
		for (Entry<String, String> k : es) {
         System.out.println("Key :"+k.getKey() + " value: " + k.getValue());

		}

	}

}
