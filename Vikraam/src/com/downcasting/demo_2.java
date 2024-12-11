package com.downcasting;
class X{
	static void m1() {
		System.out.println("m1-X");
	}
}
class Y extends X{
	static void m1() {
		System.out.println("m1-Y");
	}
	void m2() {
		System.out.println("m2-Y");
	}
}
public class demo_2 {

	public static void main(String[] args) {
		X x=new Y(); //UPCASTING
		x.m1();
//---------------------------//
		Y y=(Y)x; //DOWN CASTING
		y.m1();
		y.m2();

	}

}
