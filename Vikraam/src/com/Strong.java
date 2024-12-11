package com;

import java.util.Scanner;
public class Strong
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			int prod=1;
			for(int i=1;i<=r;i++){
				prod*=i;
			}
			sum+=prod;
			n=n/10;
		}
		if(sum==num)
		System.out.println("Strong Number");
		else
		System.out.println("Not Strong Number");
	}
}

