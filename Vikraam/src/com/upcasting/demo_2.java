package com.upcasting;

class AA{
	static void m1() {
		System.out.println("M1-AA");
	}
}
class BB extends AA{
	static void m1() {
		System.out.println("M1-BB");
	}
}
public class demo_2 {

	public static void main(String[] args) {

		AA a=new BB(); // upcasting
		a.m1();

	}

}
