package com;

import java.util.Scanner;
public class palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n,count=1;
		boolean flag=true;
		while(n>9)
		{
			count*=10;
			n/=10;
		}
		n=num;
		int n1=num;
		while(n>9)
		{

			int a=n1/count;
			a%=10;

			int b=n%10;

			if(a!=b)
			{
				flag=false;
				break;
			}
			n/=10;
			count/=10;
		}
		if(flag == true)
		System.out.println("Palindrom");
		else
		System.out.println("Not Palindrom");
	}
}
