package Programs;

public class ValueFromFloat {
	public static int intvalue;
	public static float floatvalue;
	
	public static void main(String[] args) {	
		 intvalue=123;
		 floatvalue=1234.5678f;
		 		 
		//#Get value before decimal from floatvalue
		 System.out.println((int)floatvalue); //1234
		 
		// #2.Get value postDecimal
		 System.out.println((String.valueOf(floatvalue)).substring((String.valueOf(floatvalue).indexOf(".")+1))); //5677
	
	}
}
