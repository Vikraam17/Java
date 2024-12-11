package com.basic;

public class MatrixMultiple {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},
					{5,3,1},
					{4,1,6}
		};
		int[][] b= {
				{4,1,2},
				{3,3,1},
				{6,7,9}
		};
		int[][] c=new int[a.length][a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i].length;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for(int[] arr:c) {
			for(int n:arr) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}

	}

}
