package com.basic;

import java.util.Arrays;

public class DiffrentSize {

	public static void main(String[] args) {
		int[][] a=new int[3][];
		a[0]=new int[4];
		a[1]=new int[3];
		a[2]=new int[5];
		for(int[] b:a) {
			System.out.println(Arrays.toString(b));
		}
	}

}
