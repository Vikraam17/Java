package com.basic;

public class printdiagonal {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j||i+j==a.length-1) {
					System.out.println(a[i][j]);
				}
			}
		}

	}

}
