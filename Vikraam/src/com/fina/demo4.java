package com.fina;

class p{
	void m1() {
		System.out.println("x.m1");
	}
}
final class q extends p{
	@Override
	void m1() {
		System.out.println("y.m1");
	}
}
public class demo4 {
	public static void main(String[] args) {
		q c=new q();
		c.m1();
		
	}
}
