package com.Assingment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class zeroRight {

	public static void main(String[] args) {
		int[] a= {1,0,2,3,0,4,0,6};
		int[] b=new int[a.length];
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				b[j]=a[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(b));

	}

}
