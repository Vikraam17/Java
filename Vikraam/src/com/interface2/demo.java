package com.interface2;

interface I1{
	void m1();
}
class A{
	public void m1() {
		System.out.println("M1-A");
	}
}
class B extends A implements I1{
	@Override
	public void m1() {
		super.m1();
		System.out.println("M1-B");
	}
}
public class demo {

	public static void main(String[] args) {
		I1 i1=new B();
		i1.m1();
		A a=new B();
		a.m1();

	}

}
