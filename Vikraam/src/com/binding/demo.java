package com.binding;
class AA{
	void m1()
	{
		System.out.println("M1-AA");
	}
	void m1(int i) {
		System.out.println("M1(int)-AA");
	}
}
class BB extends AA{
	@Override
	void m1()
	{
		System.out.println("M1-BB");
	}
	@Override
	void m1(int i) {
		System.out.println("M1(int)-BB");
	}
}
public class demo {
	public static void main(String[] args) {
		AA a=new BB();
		a.m1(10);
		a.m1();
	}

}
