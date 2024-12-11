package Basic;

class A<T> {
		void m1(T a) {
			System.out.println("M1 Starts");
		}
}
public class demo{
	public static void main(String[] args) {
		A<String> a1=new A<String>();
		a1.m1("abc");
		A<A> a2=new A<A>();
		a2.m1(new A());
	}
}
