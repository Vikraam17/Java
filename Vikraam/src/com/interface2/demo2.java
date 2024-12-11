package com.interface2;
interface I5{
	default void m1() {
		System.out.println("I5-M1");
	}
	public static void m2() {
		System.out.println("I5-M2");
	}
	private void m3() {
		System.out.println("I5-M3");
	}
}
class E implements I5{
	
}

public class demo2 {

	public static void main(String[] args) {
		I5 i=new E();
		i.m1();
		I5.m2();
	}

}
