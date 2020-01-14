package Programs;

public class CheckNumericOnlystring {
	
	//In process code
	
	public static void main(String[] args) {
		
		String str="1234.78";
		
		int len=str.length();
		
		try {
			
			int num=Integer.parseInt(str);
			System.out.println("All numbers integer" );
			
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Entered number is not integer");
			
			double num=Double.parseDouble(str);
			System.out.println("Double it is" );
		}
		
		
		
		
		
				
				
	}

}
