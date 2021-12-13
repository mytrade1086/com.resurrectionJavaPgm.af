package Programs;

public class AnagramMyApproach {

	public static void main(String[] args) {
		String str1 = "neh apo";
		String str2 = "eh apno";
		str1 = str1.replaceAll("[\s]", "");
		str2 = str2.replaceAll("[\s]", "");

		if (str1.length() != str2.length()) {
			System.out.println(" Lenth not equal");
		}
		else {
			for (int i = 0; i < str1.length(); i++) {
				str2 = str2.replaceAll(String.valueOf(str1.charAt(i)), "");
			}

			System.out.println("str2 is " + str2.length());
		}
	}
}
