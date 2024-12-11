package com.encapsulation;
class A{
	private int i;
	public A(int i) {
		this.i=i;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}	
}

public class demo {
	public static void main(String[] args) {
		A a=new A(10);
		System.out.println(a.getI());
		a.setI(20);
		System.out.println(a.getI());
	}
}
