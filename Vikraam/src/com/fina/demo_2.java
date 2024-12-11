package com.fina;


public class demo_2 {
	
	final int i;
	demo_2(int i){
		this.i=i;
	}
	public static void main(String[] args)
	{
		demo_2 d=new demo_2(10);
		System.out.println(d.i);
		demo_2 d1=new demo_2(20);
		System.out.println(d1.i);
	}
}
