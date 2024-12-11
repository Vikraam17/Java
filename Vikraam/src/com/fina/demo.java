package com.fina;

public class demo {
	
	int i=10;
	final int j=20;
	public static void main(String[] args) {
		demo d=new demo();
		System.out.println(d.i);
		d.i=30;
		System.out.println(d.i);
		//d.j=40; //CTE
		System.out.println(d.j);

	}

}
