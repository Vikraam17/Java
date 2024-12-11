package com.searching;

public class LinearRecursion {

	public static void main(String[] args) {
		int[] a= {0,1,2,3,4,5,6,7,8,9};
		System.out.println(search(a,9,0));
	}
	public static int search(int[] a,int key,int i) {
		if(i==a.length)return -1;
		if(a[i]==key && i<a.length) return i;
		return search(a,key,++i);
	}
}