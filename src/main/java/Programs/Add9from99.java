package Programs;

public class Add9from99 {
	
	//Works till 98
	//Add all 9 till 59

	static int total;
	static String num="";
	public static void main(String[] args) {
	
		for(int i=0;i<100;i++) {
			
			if(String.valueOf(i).contains("9")) {	
				 num=num+i;
			}
		}
		
		System.out.println(num);//9192939495969798990919293949596979899
		System.out.println(num.replaceAll("[^9]*", ""));//99999999999999999999
		System.out.println(num.replaceAll("[^9]*", "").length()*9);//180
		
}
}
