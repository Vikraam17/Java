package com.abstraction;

abstract class A{
	abstract void m1();
}
abstract class B extends A{
	@Override
	void m1() {
		System.out.println("M1-B");
	}	
	abstract void m2();
}
class C extends B{

	@Override
	void m2() {
		System.out.println("M2-C");
		
	}
	
}
public class demo {
	
	public static void main(String[] args) {
		//A a=new B(); //CTE
		B b=new C();
		b.m1();
		b.m2();
		A a=new C();
		a.m1();
		//a.m2(); //CTE
		
	}
	
}
