package com.downcasting;
class A{
	void m1() {
		System.out.println("m1-A");
	}
}
class B extends A{
	void m1() {
		System.out.println("m1-B");
	}
	void m2() {
		System.out.println("m2-B");
	}
}
public class demo {

	public static void main(String[] args) {
		A a=new B(); //UPCASTING
		a.m1();
//---------------------------//
		B b=(B)a; //DOWN CASTING
		b.m1();
		b.m2();

	}

}
