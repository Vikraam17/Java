package com;

import java.util.Scanner;
public class prime {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean flag=true;
		if(n<=1)
		{
			flag=false;
		}
		else{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag=false;
					break;
				}
			}
		}
		if(flag == true)
		System.out.println("Prime");
		else
		System.out.println("Not Prime");
	}

}
