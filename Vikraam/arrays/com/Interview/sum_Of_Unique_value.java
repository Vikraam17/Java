package com.Interview;

public class sum_Of_Unique_value {
	public static void main(String[] args) {
		int[] arr= {1,3,6,3,4,4};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					sum+=arr[i]+arr[j];
				}
			}
		}
		System.out.println(sum);
	}
}
