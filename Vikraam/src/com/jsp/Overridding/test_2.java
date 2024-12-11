package com.jsp.Overridding;

class A{
	int i=10;
}
class B extends A{
	int i=20;
}
public class test_2 {

	public static void main(String[] args) {
		A a=new A();
		System.out.println(a.i);
		B b=new B();
		System.out.println(b.i);
		A a1=new B();
		System.out.println(a1.i);

	}

}
