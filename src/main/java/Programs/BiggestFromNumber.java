package Programs;

import org.apache.logging.log4j.util.SystemPropertiesPropertySource;

public class BiggestFromNumber {
	static int biggest;

	public static void main(String[] args) {

		// Find the biggest number from below. i.e 9
		String str = "1238975";
		char[] ch = str.toCharArray();
		if (Character.isDigit(ch[0])) {
			biggest = Character.getNumericValue(ch[0]);
		}

		for (int i = 0; i < ch.length; i++) {
			if (biggest < Character.getNumericValue(ch[i])) {
				biggest = Character.getNumericValue(ch[i]);
			}
		}
		System.out.println(biggest);
	}
}
