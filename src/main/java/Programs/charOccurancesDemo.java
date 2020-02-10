package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class charOccurancesDemo {
	public static void main(String[] args) {

		String text = "this is sparta man";

		int length = text.length();
		// #1 Find how many 'a'
		System.out.println(length - text.replaceAll("a", "").length()); // 3

		// #2
		char[] chArray = text.toCharArray();
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        for (int i = 0; i < chArray.length; i++) {

			Integer count = m.put(chArray[i], null);
			if (count == null) {
				count = 1;
				m.put(chArray[i], count);
			}
			else {
				m.put(chArray[i], ++count);
			}
		}
		System.out.println(m);
		// 3
		// { =3, p=1, a=3, r=1, s=3, t=2, h=1, i=2, m=1, n=1}

	}

}
