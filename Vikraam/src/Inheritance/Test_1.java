package Inheritance;

class AA{
	static void m1()
	{
		System.out.println("AA-M1(static)");
	}
	void m2()
	{
		System.out.println("BB-M2(non-static)");
	}
}
class BB extends AA{
	
}
public class Test_1 {

	public static void main(String[] args) {
		BB b=new BB();
		b.m1();
		b.m2();

	}

}
