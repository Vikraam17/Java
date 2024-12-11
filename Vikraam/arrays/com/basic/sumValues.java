package com.basic;

public class sumValues {

	public static void main(String[] args) {
		int[] a= {4,3,5,6,7,8,2,9,1};
		int n=10;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==n) {
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}

	}

}
