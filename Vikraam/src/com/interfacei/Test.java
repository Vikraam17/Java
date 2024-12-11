package com.interfacei;

interface I1{
	int i=10;
	void m1();
}
class B implements I1{

	@Override
	public void m1() {
		System.out.println("M1-B");
		
	}
}
public class Test {

	public static void main(String[] args) {
		B b=new B(); //Object creation for B class
		b.m1();
		System.out.println(b.i);
		I1 i=new B(); //upcasting
		i.m1();
		System.out.println(i.i);
		B a=(B)i; //Downcasting
		a.m1();
		System.out.println(a.i);
	}

}
