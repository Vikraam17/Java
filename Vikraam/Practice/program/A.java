package program;

class AA {
	void m1() {
		System.out.println("A-Class m1");
	}
}
class B extends AA{
	void m1() {
		System.out.println("B-class m1");
	}
	void m2() {
		System.out.println("B-class m2");
	}
}
public class A{
	public static void main(String[] args) {
		AA a=new AA();
		a.m1();
		
		
	}
}
