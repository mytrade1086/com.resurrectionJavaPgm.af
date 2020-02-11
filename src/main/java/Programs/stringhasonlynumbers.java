package Programs;

public class stringhasonlynumbers {

	public static void main(String[] args) {

		String text = "1234is5678";
		int len = text.length();
		int nondigit = 0;
		for (int i = 0; i < len; i++) {

			if (!(Character.isDigit(text.charAt(i)))) {
				nondigit++;
			}
		}

		System.out.println(nondigit); // 2
	}

}
