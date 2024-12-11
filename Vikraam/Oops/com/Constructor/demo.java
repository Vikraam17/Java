package com.Constructor;

class A{
	int i;
	A(int i){
		this.i=i;
	}
	
	
}
//class B extends A{
//	void m1(A a) {
//		System.out.println(a.i);
//	}
//}
public class demo {

	public static void main(String[] args) {
//		B b1=new B();
		A a1=new A(10);
		A a2=new A(20);
//		b1.m1(a1); //10
//		b1.m1(a2); //20
//		b1.m1(new A(30)); //30
	}
}
