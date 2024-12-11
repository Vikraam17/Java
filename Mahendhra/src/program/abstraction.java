package program;

abstract class A{
	abstract void m1();
}
class B extends A{
	@Override
	void m1() {
		System.out.println("M1-A");
	}
}

public class abstraction {
	public static void main(String[] args) {
		B b=new B();
		b.m1();
	}
}
