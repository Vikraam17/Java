package com.downcasting;

class AA{
	int i=10;
	static int j=20;
	static void m1() {
		System.out.println("M1-AA");
	}
}
class BB extends AA{
	int i=30;
	static int j=40;
	static void m1() {
		System.out.println("M1-BB");
	}
	void m2()
	{
		System.out.println("M2-BB");
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA a=new BB();
		System.out.println(a.i);
		System.out.println(a.j);
		a.m1();
		//a.m2();
		BB b=(BB)a;
		System.out.println(b.i);
		System.out.println(b.j);
		b.m1();
		b.m2();

	}

}
