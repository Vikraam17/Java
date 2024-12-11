package com.basic;

import java.util.Arrays;
import java.util.Scanner;

public class demo6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter the value of "+i+" index : ");
			a[i]=sc.nextInt();
		}
		//Print array elements without any loop
		
		System.out.println(Arrays.toString(a));
		
		//Sum of the arrays elements
		
		int sum=0;
		for(int x:a) {
			sum+=x;
		}
		System.out.println(sum);
	}

}
