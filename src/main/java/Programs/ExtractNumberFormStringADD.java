package Programs;

public class ExtractNumberFormStringADD {

	public static void main(String[] args) {
		
		
		String s="this 12 love45n56";
		int sum=0;
		
		char [] all=s.toCharArray();
		for(char c:all) {
			
			if (Character.isDigit(c)) {
				
				sum=sum+Character.getNumericValue(c);
			}
		}
		
		System.out.print(sum); //1+2+4+5+5+6 =23
	}
	

}
