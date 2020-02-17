package Programs;

public class stringReplaceAllRegexex {
	
	public static void main(String[] args) {
		
		String str="tata#$%^";
		
		String str2="sumitsu";
		
		String str3="neha deshmukh";
		String str4="poojari nt";
		
		System.out.println(str.replaceAll("[^a-zA-Z]", "")); //tata
		
		System.out.println(str4.replaceAll("[o]", ""));//"pjari nt
	} 

}
