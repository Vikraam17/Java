package com.interface2;
interface I3{
	default void m1() {
		System.out.println("I3-M1");
	}
	
}
interface I4{
	default void m1() {
		System.out.println("I4-M1");
	}
}
class D implements I3,I4{

	@Override
	public void m1() {
		I3.super.m1();
		I4.super.m1();
		System.out.println("D-M1");
	}
	
}
public class demo1 {

	public static void main(String[] args) {
		
		I4 i4=new D();
		i4.m1();
	}

}
