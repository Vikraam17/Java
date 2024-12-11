package com.Constructor;
class C{
	int i;
	C(int i){
		this.i=i;
	}
}
class D{
	int i;
	D(int i){
		this.i=i;
	}
	void m1(C obj) {
		System.out.println(i);
	}
}
public class demo2 {
	public static void main(String[] args) {
		D d1=new D(10);
		D d2=new D(20);
		C c1=new C(30);
		d1.m1(c1);
	}
}
