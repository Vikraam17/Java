package com.practice;

import java.util.Arrays;

public class selection {
	public static void sort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index]) index=j;
			}
			if(i!=index) {
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
			}
		}
	}
	public static void main(String[] args) {
		
			int[] a= {1,9,2,8,4,6,5,3};
			sort(a);
			System.out.println(Arrays.toString(a));
	}

}
