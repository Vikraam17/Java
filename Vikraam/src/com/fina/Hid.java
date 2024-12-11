package com.fina;

class A{
	public static void m2() {
		System.out.println("m1-A");
	}
}
class B extends A{
	public static void m2() {
		System.out.println("m1-B");
	}
}
public class Hid {
	public static void main(String[] args) {
		B b=new B();
//		A a=new A();
//		a.m2();
		b.m2();
//		B.m2();
	}
	

}
