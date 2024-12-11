package com.searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] a= {0,1,2,3,4,5,6,7,8,9};
		System.out.println(search(a,9));
	}
	public static int search(int[] a,int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key)
				return i;
		}
		return -1;
	}
} // check the element position
