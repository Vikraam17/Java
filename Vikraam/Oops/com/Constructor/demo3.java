package com.Constructor;

class E{
	int i;
	E(int i){
		this.i=i;
	}
	void m1(E obj) {
		System.out.println(i);
		System.out.println(obj.i);
	}
}
public class demo3 {

	public static void main(String[] args) {
		E e1=new E(10);
		E e2=new E(20);
		e1.m1(e2); //10 20
		e2.m1(e1); //20 10
		e2.m1(e2); //20 20
		e1.m1(e1); //10 10
		e2.m1(new E(30)); //20 30

	}

}
