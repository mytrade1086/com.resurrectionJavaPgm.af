package Programs;

public class StringReplaceSpecialSymbol {

	public static void main(String[] args) {

		String[] str = { "? 1,999+", "? abd 3,999+", "? 2,999+" };

		for (int i = 0; i < str.length; i++) {

			if (str[i].contains("?")) {

				String strnew = str[i].replace("?", "");
			
				System.out.println(strnew);
				
			}
			
		}
	}
}


//1,999+
//abd 3,999+
//2,999+
