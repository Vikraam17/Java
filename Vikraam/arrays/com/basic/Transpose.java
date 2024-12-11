package com.basic;

import java.util.Arrays;

public class Transpose {

	public static void main(String[] args) {
		int[][] a= { {1,2,3},{4,5,6},{7,8,9}};
		int[][] b=transpose(a);
		for(int[] k:b) {
//			System.out.println(Arrays.toString(k));
			for(int n:k)
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}
	static int[][] transpose(int[][] a){
		int len=a.length;
		int[][] b=new int[len][len];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[j][i]=a[i][j];
			}
		}
		return b;
	}
}
