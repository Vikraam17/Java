package Inheritance;

class A{
	int i=10;
}
class B extends A{
	int j=20;
}
public class single {

	public static void main(String[] args) {
	B b=new B();
	System.out.println(b.i);
	System.out.println(b.j);
	A a=new A();
	System.out.println(a.i);
	//System.out.println(a.j);

	}

}
