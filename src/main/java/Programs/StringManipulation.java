package Programs;

public class StringManipulation extends StringGenericFunctions{

	public static void main(String[] args) {

		String demo = "this is love. extra i added";

		System.out.println(demo.length()); // 27

		System.out.println(demo.indexOf("i")); // 2 first occurrence
		System.out.println(demo.indexOf("xx")); //-1 for non existent variable
		System.out.println(demo.indexOf("i", demo.indexOf("i") + 1));// 5 Second

		System.out.println(demo.charAt(20)); // i
		//System.out.println(demo.charAt(200)); // java.lang.StringIndexOutOfBoundsException
		
		System.out.println(demo.substring(0,4)); // this start from 0th index and fetch total 4 characters .. 0 1 2 3
		
		System.out.println(demo.substring(0,demo.length())); //this is love. extra i added
		
		
		System.out.println(demo.replace("i", "")); //ths s love. extra  added    i has been repaced
		
		System.out.println(demo.replaceAll("[i]", ""));
		 
		System.out.println(demo.contains("t"));  //true
		
		
		
		String []arr=demo.split(" ");
		
		for(String s:arr) {
			
			System.err.println(s);
			
//			this
//			is
//			love.
//			extra
//			i
		}
		
		
		
		//Concatenation
		
		String dummy="love";
		String dummyNull=null;
		
		System.out.println(dummy+dummyNull);
		System.out.println(dummy.concat(dummyNull)); //Exception in thread "main" java.lang.NullPointerException
		
		
		//rep
		
		
		
		
		
		
		

		/*
		 * getOccurences(demo, 'i');
		 * 
		 * System.err.println("---------------------"); getOccurencesCount(demo,'9');
		 */

	}

	
}
