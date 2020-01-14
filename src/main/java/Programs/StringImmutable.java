package Programs;

public class StringImmutable {

	public static void main(String[] args) {
		// 
		
		String name="java";
		String name2="java";
		
		System.out.println(name.hashCode());
		System.out.println(name2.hashCode());
//		3254818
//		3254818
		
		
		System.out.println(name.concat("test")); //javatest
		System.out.println(name);  //java

	}

}
