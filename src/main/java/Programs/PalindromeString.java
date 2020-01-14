package Programs;

import java.util.Scanner;

public class PalindromeString {
	
	static String rev=null;
	static String str;

	
	public static void main(String[] args) {
		
		
		
		
		
		Scanner sn=new Scanner(System.in);
		str=sn.next();
		
		System.out.println(str);
		System.out.println(str.length());
		
		int len=str.length();
		rev="";
		while(len!=0) {
			
			
			rev=rev+str.charAt(len-1);
			
			len--;
		}
		
		
		
		
		System.out.println(rev);
	}
	
}

