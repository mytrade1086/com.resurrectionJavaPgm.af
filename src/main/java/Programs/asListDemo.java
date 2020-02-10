package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class asListDemo {
	    public static void main(String[] argv) 
	        throws Exception 
	    { 
	  
	        try { 
	  
	            // creating Arrays of String type 
	            String a[] = new String[] { "A", "B", "C", "D" }; 
		            // getting the list view of Array 
	            List<String> list = Arrays.asList(a); 
	  	            // printing the list 
	            System.out.println("The list is: " + list); 
	            System.out.println("using Arrays.toString()"+ Arrays.toString(a));         
	            System.out.println("Length of array before removing C "+a.length);
	            //System.out.println(list.remove(2));//java.lang.UnsupportedOperationException
	           // Since the returned List is a fixed-size List, we can’t add/remove elements.
	            
	            System.out.println(a.length);
	            System.out.println("Length of array after removing C "+a.length);
	            
	            
	            
	        } 
	  
	        catch (NullPointerException e) { 
	            System.out.println("Exception thrown : " + e); 
	        } 
	        
	        
	        String x[] = new String[] { "X", "Y", "Z", "ZZ" }; 
	        List<String> list2 =  new ArrayList(Arrays.asList(x));
	        list2.remove("ZZ"); //wont throw any exception
	        
	        System.out.println("list2 :"+list2);
	        System.out.println("Original Array :"+Arrays.toString(x));
	       // list2 :[X, Y, Z]
	        //Original Array :[X, Y, Z, ZZ]
	        
	      
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	    } 
	} 
	
	

