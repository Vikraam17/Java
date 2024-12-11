package com.practice;

import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
		int[] a= {1,2,5,3,6,7,9,4,8};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	public static void sort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index])
					index=j;
			}
				if(i!=index) {
					int temp=a[i];
					a[i]=a[index];
					a[index]=temp;
				}
				
		}
	}
//	public static void sort(int[] a) {
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a.length-1-i;j++) {
//				if(a[j]>a[j+1]) {
//					int temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//			}
//		}
//	}

}
