package Programs;

public class StringGenericFunctions {
	
	public static void getOccurences(String text, char c) {
		int start = 0;
		int occurences = 0;
		while (text.indexOf(c, start) > 0) {
			occurences++;
			int count = text.indexOf(c, start);
			System.out.println(count);
			start = count + 1;
		}
		System.out.println("Char c has " + occurences + " occurences");

	}

	public static void getOccurencesCount(String text, char ch) {
		System.out.println("");
		int count = 0;
		for (int i = 0; i < text.length() - 1; i++) {
			if (text.charAt(i) == ch) {
				++count;
			}
		}
		System.out.println(count);

	}

	

}
