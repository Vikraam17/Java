package com.practice;

import java.util.Arrays;

public class bubble {
	public static void sort(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		int[] a= {1,9,2,8,4,6,5,3};
		sort(a);
		System.out.println(Arrays.toString(a));
}

}