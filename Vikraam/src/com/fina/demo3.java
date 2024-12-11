package com.fina;

class x{
	void m1() {
		System.out.println("x.m1");
	}
}
class y extends x{
	@Override
	final void m1() {
		System.out.println("y.m1");
	}
}
public class demo3 {
	public static void main(String[] args) {
		y a=new y();
		a.m1();
		
	}
}
