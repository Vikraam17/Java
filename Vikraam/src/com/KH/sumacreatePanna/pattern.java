package com.KH.sumacreatePanna;
import java.util.Scanner;
public class pattern {
	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the Values:");
		int n = scn.nextInt();
		
		for(int i =1;i<=n;i++)
		{
			
			for(int j=1;j<=n-i;j++) 
			{
				if(j==1||i==1||i==j)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1||j==i|| i==n ||i-1==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
