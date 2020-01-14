package Programs;

public class ReverseStringOnPlace {

	public static void main(String[] args) {

		String text = "this is sparta for you";
        String[] arr = text.split(" ");
        StringBuffer sb = new StringBuffer();
        
        StringBuffer sb2 = new StringBuffer(); //error
        sb2=null;
        
        System.out.println(sb2);

		for (String str : arr) {
			System.out.println(str);
			sb = sb.append(new StringBuffer(str).reverse().append(" "));
		}

		System.out.println(sb.toString().trim());

	}

}
