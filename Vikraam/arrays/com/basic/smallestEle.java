package com.basic;

public class smallestEle {

	public static void main(String[] args) {
		int[] a= {5,6,7,8,4,3,2,6,9};
		int minIndex=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]< a[minIndex]) minIndex=i;
		}
		System.out.println("Smallest number is : "+a[minIndex]);
	}
}
