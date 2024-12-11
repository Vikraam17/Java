package com.interfacei;
interface I4{
	void m1();
}
interface I2 extends I4{
	void m2();
}
interface I3{
	void m3();
}
class A{
	public void m4() {
		System.out.println("M4-A");
	}
}
class C extends A implements I2,I3{

	@Override
	public void m1() {
		System.out.println("M1-I1");
		
	}

	@Override
	public void m2() {
		System.out.println("M2-I2");
		
	}

	@Override
	public void m3() {
		System.out.println("M3-I3");
		
	}
	
}
public class Test2 {

	public static void main(String[] args) {
		I4 i1=new C();
		i1.m1();
		I2 i2=new C();
		i2.m1();
		i2.m2();
		A a=new C();
		a.m4();
		C b=new C();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
	}

}
