package Programs;


class A{

static int count;
public A() {
	
	count++;
}
}

class B  extends A{

	public static void main(String[] args) {	
		A a1=new A();
		A a2=new A();
		A a3=new A();
		A a4=new A();
		System.out.println(count);

	}

}

