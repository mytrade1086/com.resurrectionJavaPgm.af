package Programs;

public class stringReplaceAllRegexex {
	
	public static void main(String[] args) {
		
		String str="tata#$%^";
		
		System.out.println(str.replaceAll("[^a-zA-Z]", "")); //tata
		
	} 

}
