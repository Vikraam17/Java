package com;

import java.util.Scanner;
public class Perfect {
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int n=sc.nextInt();
			//int num=n;
			int sum=0;
			for(int i=1;i<=n/2;i++)
			{
				if(n%i==0)
				sum=sum+i;
			}
			if(n==sum)
				System.out.println("perfect number");
			else
				System.out.println("not perfect number");
		}
	}