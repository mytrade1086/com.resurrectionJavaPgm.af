/**
 * 
 */
package Programs;
import java.util.HashSet;
import java.util.Set;

/**
 * @author sunshine
 *
 */
public class StringsecondOccurrence {
	/**
	 * Find second last occurrence of a character sumit bhag w a n t r a u t 01234
	 * 56789 10 11 12 13 14 15 16 17 18
	 */
	public static void main(String[] args) {
		String s = "sumit bhagwant raut";
		// lets find occurence of t
		// Method 1 using lastIndexOf()
		System.out.println(s.length()); // 19 is the physical length hence 0 to 18 index
		System.out.println(s.indexOf("t")); // 4 first occur
		System.out.println(s.lastIndexOf("t")); // 18 LAST occur
		System.out.println(s.lastIndexOf("t", (s.lastIndexOf("t") - 1))); // 13 second last index
		// Method 2
		Set<Character> hs = new HashSet<Character>();
		for (int i = s.length() - 1; i >= 0; i--) {

			if (s.charAt(i) == 't') {
				if (!(hs.add((s.charAt(i))))) {
					System.out.println("Second Occurrence via set:" + i);
					// Second Occurrence via set:13
					break;
				}
			}

		}
	
		//Method 3:
		char[]ch=s.toCharArray();
		int tcounter=0;
		for (int i=ch.length-1;i>=0;i--) {
			
			if(ch[i]=='t') {
				tcounter++;
				if(tcounter==2) {					
					System.out.println("Occurence of t from char aray method "+(i));
					//Occurence of t from char aray method13
					break;	
				}		
			}
		}		
	}
}
