package Programs;

import java.util.HashMap;
import java.util.HashSet;
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
       
       
       
       
    //using Set
       
       Set<String> s=new HashSet<String>();
       
       for(String str:lang) {
    	  
    	   if(!(s.add(str))) {
    		   
    		 System.out.println("Duplicates are:"+str);  
    	   }
    	   
       }
//       
//       Duplicates are:java
//       Duplicates are:c
       
       
       
       int [] demo= {2,4,3,1,7,2,55,88,66,66,4,1};
       int count;
       for(int i=0;i<demo.length;i++) {
    	   count=0;
    	   for(int j=0;j<demo.length;j++) {
    		   
    		   if(demo[i]==demo[j]) {
    			  count++;
    			  
    		   }
    		 
    	   }
    	   System.out.println(demo[i] +" appears "+count +" times.");
       }
       
       
       
       
       
      

	}
}
