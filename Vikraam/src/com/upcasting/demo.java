package com.upcasting;

class A{
	void m1() {
		System.out.println("M1-A");
	}
}
class B extends A{
	void m1() {
		System.out.println("M1-B");
	}
}
public class demo {

	public static void main(String[] args) {

		A a=new B(); // upcasting
		a.m1();

	}

}
