package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatesinArray {

	public static void main(String[] args) {
		String[] lang = { "java", "java", "cpp", "python", "c", "android", "c" };	
		//Solution 1 with Hashmap
        Map<String, Integer> m = new HashMap<String, Integer>();
		for (String s : lang) {		
			Integer count = m.get(s);
			// ### if we use int, we cant hold null. /wisely used Integer here
			if (count == null) {
				m.put(s, 1);
			}
			else {
				m.put(s,  ++count);
			}
		}
		System.out.println(m);
        //{cpp=1, python=1, java=2, c=2, android=1}


//Iterating Map
		
       Set<Entry<String,Integer>>	es=	m.entrySet();
       
       for(Entry<String,Integer>  esset: es) {
    	   System.out.println(esset.getKey()+" :: "+esset.getValue());
    	   
//    	   cpp :: 1
//    	   python :: 1
//    	   java :: 2
//    	   c :: 2
//    	   android :: 1
    	   
       }
       
       
      

	}
}
