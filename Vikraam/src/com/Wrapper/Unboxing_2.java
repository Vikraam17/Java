package com.Wrapper;

public class Unboxing_2 {

	public static void main(String[] args) {
		Integer i=new Integer(10);
		int a=i.intValue();
		System.out.println("Integer value(Non-primitive) = "+i);
		System.out.println("Unboxing (primitive)= "+a);
		Integer j=new Integer(20);
		int b=j;
		System.out.println("Integer value(Non-primitive) = "+j);
		System.out.println("Unboxing (primitive)= "+b);
		Integer k=30;
		int c=k;
		System.out.println("Integer value(Non-primitive) = "+k);
		System.out.println("Unboxing (primitive)= "+c);

	}

}
