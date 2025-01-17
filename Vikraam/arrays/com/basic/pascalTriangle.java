package com.basic;

import java.util.Scanner;

public class pascalTriangle {
	static int[][] pascal(int size){
		int[][] a=new int[size][];
		for(int i=0;i<a.length;i++)
		{
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++)
			{
				if(j==0||i==j) {
					a[i][j]=1;
				}
				else
				{
					a[i][j] = a[i-1][j-1] + a[i-1][j];
				}
			}
		}
		return a;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int space=size-1;
		int[][] b=pascal(size);
		for(int[] n:b) {
			for(int i=0;i<space;i++) {
				System.out.print(" ");
			}
			for(int x:n) {
				System.out.print(x+" ");
			}
			System.out.println();
			space--;
		}

	}
	
}
