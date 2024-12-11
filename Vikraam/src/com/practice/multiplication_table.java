package com.practice;

import java.util.Scanner;

public class multiplication_table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		int prod=1;
		prod=sum*n;
		System.out.println(prod);
	}

}
