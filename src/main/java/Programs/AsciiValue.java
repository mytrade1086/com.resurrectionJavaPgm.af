package Programs;

public class AsciiValue {

	public static void main(String[] args) {
//Notice that printf method is used
		for (int i = 0; i < 128; i++) {
			System.out.printf("%d :%c \n", i, i);
		}
	}

}
