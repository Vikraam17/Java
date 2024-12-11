package com.jsp.Overridding;

class a_1{
	public animal m1()
	{
		System.out.println("M1-A-1");
		return new animal();
	}
}
class b_1 extends a_1{
	@Override
	public animal m1(){
		super.m1();
		System.out.println("M1-B-1");
		return new animal();
	}
}
public class animal {
	public static void main(String[] args) {
		b_1 b=new b_1();
		b.m1();
	}
}