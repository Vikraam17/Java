package com.Innerclass;

public class Outer {
	int i=10;
	class Inner{
		int j=20;
		void m1() {
			System.out.println("M1-Inner class");
		}
	}
	public static void main(String[] args) {
		Outer o=new Outer(); //Way-1
		System.out.println(o.i);
		Outer.Inner k=o.new Inner(); //Way-1
		System.out.println(k.j);
		k.m1();
		System.out.println("==============");
		Outer.Inner a=new Outer().new Inner(); //Way-2
		System.out.println(a.j);
		a.m1();
		System.out.println("==============");
		new Outer().new Inner().m1(); //Way-3

	}

}
