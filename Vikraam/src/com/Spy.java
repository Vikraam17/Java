package com;

import java.util.Scanner;
public class Spy {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int n=s.nextInt();
	 int sum=0;
	 int prod=1;
	 for(int i=1;i<=n/2;i++)
	 {
		 if(n%i==0)
		 {
			 sum+=i;
			 prod*=i;
		 }
	 }
	 if(sum==prod)
	 {
		 System.out.println("Spy number");
	 }
	 else
	 {
		 System.out.println("Not spy number");
	 }
	}

}
