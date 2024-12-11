package com.upcasting;

class X {
	int i=10;
	static int j=20;
	void m1() {
		System.out.println("x - non static -m1");
	}
	static void m2() {
		System.out.println("x - static -m2");
	}
	X(){
		System.out.println("x-cons");
	}
}
class Y extends X{
	int i=30;
	static int j=40;
	@Override
	void m1() {
		System.out.println("y - non static -m1");
	}
	static void m2() {
		System.out.println("y - static - m2");
	}
	Y(){
		System.out.println("y-cons");
	}
	void m3() {
		System.out.println("y - non static m3");
	}
	
}
public class All_demo {

	public static void main(String[] args) {
		X x=new Y();
		System.out.println(x.i);
		System.out.println(x.j);
		x.m1();
		x.m2();
		//x.m3(); // CTE

	}

}
