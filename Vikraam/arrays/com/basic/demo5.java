package com.basic;

public class demo5 {

	public static void main(String[] args) {
		Object[] o=new Object[4];
		o[0]=25;
		o[1]=12.35;
		o[2]=true;
		o[3]="vikraam";
		for(Object a:o)
		{
			System.out.println(a);
		}
		System.out.println((Integer)o[0]*4);
	}

}
