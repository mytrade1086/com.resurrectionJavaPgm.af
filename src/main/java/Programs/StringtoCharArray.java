package Programs;

public class StringtoCharArray {

	public static void main(String[]args) {
		
		char []ch="sumit".toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			System.out.println(Character.toString(ch[i]));
//			s
//			u
//			m
//			i
//			t

		}
		
		
		if (!Character.isUpperCase(ch[0])){
			ch[0]=Character.toUpperCase(ch[0]);
		}
		
		
		for(int i=0;i<ch.length;i++) {
			
			System.out.println(Character.toString(ch[i]));
//			S           **********************
//			u
//			m
//			i
//			t

		}
		
		
		System.out.println(new String(ch));//Sumit
	}
}
