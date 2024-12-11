package com.basic;

public class demo {

	public static void main(String[] args) {
		int[] a= {10,20,30};
		int[] b=a;
		b[0]=20;
		System.out.println(a[0]);
		System.out.println(b[0]);
	}

}
