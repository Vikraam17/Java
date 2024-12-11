package com.Assingment;

import java.util.Arrays;

public class zeroleft {

	public static void main(String[] args) {
		int[] a= {1,0,2,3,0,4,0,6};
		int[] b=new int[a.length];
		int j=a.length-1;
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]>0) {
				b[j--]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));

	}

}
