package com;

public class Demo {

	public static void main(String[] args) {
		int a=99; //100
		int b=109; // 111
		int c=209;// 208
		boolean d=c++ + a++ > ++b + --c || ++a - --c + --a > ++a - ++c + ++b - --a + c--;
		//209 + 99 > 110 + 209 || 101 - 208 + 100 > 101 - 209 + 111 - 100 + 209
		
		System.out.println(d);
	}

}