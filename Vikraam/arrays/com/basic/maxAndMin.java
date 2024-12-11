package com.basic;

public class maxAndMin {

	public static void main(String[] args) {
		int[] a= {5,6,7,8,4,3,2,6,9};
		int minIndex=0;
		int maxIndex=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]< a[minIndex]) minIndex=i;
			if(a[i]> a[maxIndex]) maxIndex=i;
		}
		System.out.println("Smallest number is : "+a[minIndex]);
		System.out.println("Biggest number is : "+a[maxIndex]);
	}
}
