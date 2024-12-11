package constructor;
class A{
	static void m1() {
		System.out.println("M1-A");
	}
	void m1(int i) {
		System.out.println("M1-with arg");
	}
}
class B extends A{
	static void m1() {
		System.out.println("M1-B");
	}
	@Override
	void m1(int i) {
		System.out.println("M1-with arg");
	}
}
public class demo1 {
	public static void main(String[] args) {
		System.out.println("Main-Starts");
		A a=new B();
		a.m1();
		a.m1(10);
		System.out.println("Main-ends");
	}
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
}
