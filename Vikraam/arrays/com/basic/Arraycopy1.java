package com.basic;

import java.util.Arrays;

public class Arraycopy1 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int n=a.length;
		int[] b=new int[n];
		System.out.println(Arrays.toString(b));
		System.arraycopy(a, 0, b, 0, n);
		System.out.println(Arrays.toString(b));
		System.arraycopy(a, 2, a, 3, 2);
		System.out.println(Arrays.toString(a));
	}

}
