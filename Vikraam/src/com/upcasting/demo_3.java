package com.upcasting;

class C{
		int i=10;
		static int j=20;
}
class D extends C{
		int i=30;
		static int j=40;
}
public class demo_3 {

	public static void main(String[] args) {

		C c=new D();
		System.out.println(c.i);
		System.out.println(c.j);

	}

}
