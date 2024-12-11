package com.Innerclass;

public class A {

	static int i=10;
	
	static class B{
		static int j=20;
		void m1() {
			System.out.println("M1-B");
		}
	}
	public static void main(String[] args) {
		A.B b=new A.B();
		b.m1();
		System.out.println(A.i);
		System.out.println(B.j);
		System.out.println(A.B.j);

	}
	
}
