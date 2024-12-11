package com.interface3;
interface I1{
	void m1();
	default void m2() {
		System.out.println("M2-Default-I1");
	}
	static void m3() {
		System.out.println("M3-static-I1");
	}
}

class A implements I1{
	void m4(){
		System.out.println("M4-A");
	}

	@Override
	public void m1() {
		System.out.println("M1-A-I1");		
	}
}
public class functionalInterface {

	public static void main(String[] args) {
		I1 i1=new A();
		i1.m1();
		i1.m2();
		I1.m3();
		A a=(A)i1;
		a.m1();
		a.m2();
		I1.m3();
		a.m4();
		

	}

}
