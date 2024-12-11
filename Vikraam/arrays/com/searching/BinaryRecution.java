package com.searching;

public class BinaryRecution {

	public static void main(String[] args) {
		int[] a= {0,1,2,3,4,5,6,7,11,8,9};
		System.out.println(search(a,9,0,a.length-1));
	}
	public static int search(int[] a,int key,int st,int end) {
		int mid=(st+end)/2;
		if(a[mid]==key)return mid;
		if(key<a[mid]) 
			return search(a,key,st,mid-1);
		else if(key>a[mid]) 
			return search(a,key,mid+1,end);
		return -1;
	}
}