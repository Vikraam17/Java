package com.basic;

public class demo2 {

	public static void main(String[] args) {
		int[] arr= {10,20,30};
		m1(arr);
		for(int n:arr)
			System.out.println(n);
	}
	static void m1(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]++;
		}
		System.out.println("M1-Executed");
	}
}
