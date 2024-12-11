package com.Interview;

import java.util.Scanner;

public class Sum_of_Cube_ofAllNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int m=sc.nextInt();
		int n=4;
		int m=9;
		int sum=0;
		for(int i=n;i<=m;i++) {
			sum=sum+(i*i*i);
		}
		System.out.println(sum);

	}

}
