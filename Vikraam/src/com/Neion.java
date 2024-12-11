package com;

import java.util.Scanner;
public class Neion {
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int n=sc.nextInt();
			int sq=n*n;
			int sum=0;
			for( ;sq>0;sq/=10)
			{
				int r=sq%10;
				sum+=r;
			}
			if(n==sum)
				System.out.println("neion number");
			else
				System.out.println("not neion number");
		}
	}