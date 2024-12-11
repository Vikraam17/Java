package com.Wrapper;

public class boxing_1 {
	public static void main(String[] args) {
		int a=10;
		Integer b=Integer.valueOf(a); //Boxing before version 1.5
		System.out.println("primitive = "+a);
		System.out.println("Non-primitive = "+b); 
		int i=20;
		Integer j=i; //Boxing after version 1.5
		System.out.println("primitive = "+i);
		System.out.println("Non-primitive = "+j);
	}
	

}
