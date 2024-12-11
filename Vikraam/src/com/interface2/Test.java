package com.interface2;
interface I2{
	void m1();
	default public void m2() {
		System.out.println("M2-I2");
	}
}
class C implements I2{

	@Override
	public void m1() {
		System.out.println("M1-B");
		
	}
	
	
}
public class Test {

	public static void main(String[] args) {
		I2 i2=new C();
		i2.m1();
		i2.m2();

	}

}
