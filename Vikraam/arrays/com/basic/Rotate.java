package com.basic;

import java.util.Arrays;
import java.util.Scanner;
public class Rotate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int[] a= {1,2,3,4,5,6};
		int n=m%a.length;
		for(int i=1;i<=n;i++) {
			rotate(a);
		}
		//System.out.println(n);
		System.out.println(Arrays.toString(a));
	}
	static void rotate(int[] a) {
		int ele=a[a.length-1];
		for(int i=a.length-2;i>=0;i--) {
			a[i+1]=a[i];
		}
		a[0]=ele;
	}

}
