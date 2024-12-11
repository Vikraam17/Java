package com.basic;

public class demo1 {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int[] b= {60,70,80,90,100};
		display(a);
		display(b);
	}
	static void display(int[] a) {
		for(int n:a) {
			System.out.print(n+" ");
		}
		System.out.println();
	}

}
