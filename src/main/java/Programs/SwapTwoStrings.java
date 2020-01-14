package Programs;

public class SwapTwoStrings {

	public static void main(String[] args) {

		// Swap Strings variable without using third

		String fname = "james";
		String lname = "bond";

		fname = fname + lname; // jamesbond
        lname = fname.substring(0, fname.indexOf(lname)); // james

		fname = fname.substring(lname.length());
        System.out.println(fname);
		System.out.println(lname);
	}

}
