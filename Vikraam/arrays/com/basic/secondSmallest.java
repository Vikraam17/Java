package com.basic;

public class secondSmallest {

	public static void main(String[] args) {
		int[] a= {5,6,7,8,4,3,2,1,6,9};
		int first=a[0];
		int second=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]==first)continue;
			if(a[i]< first) 
			{
				second=first;
				first=a[i];
			}
			
			else if(a[i]<second || first==second)
			{
				second=a[i];
			}
		}
		System.out.println("Smallest number is : "+first);
		System.out.println("Second Smallest number is : "+second);
	}
}
