package com.Assingment;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] a= {1,2,2,3,4,5,6,7,7,8,8,9};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]&&a[j]!=0) {
					a[j]=0;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
