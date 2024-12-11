package com.basic;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] a=new int[n][n];
		int col=-1;
		int row=0;
		char dir='r';
		for(int i=1;i<=n*n;i++) {
			switch(dir) {
			case 'r':{
				col++;
				a[row][col]=i;
				if(col==a.length-1||a[row][col+1]!=0)
					dir='d';
			}break;
			case 'd':{
				row++;
				a[row][col]=i;
				if(row==a.length-1||a[row+1][col]!=0)
					dir='l';
			}break;
			case 'l':{
				col--;
				a[row][col]=i;
				if(col==0||a[row][col-1]!=0)
					dir='u';
			}break;
			case 'u':{
				row--;
				a[row][col]=i;
				if(a[row-1][col]!=0)
					dir='r';
			}break;
			
			}
		}
		for(int[] k:a) {
			for(int m:k) {
				System.out.print(m+"\t");
			}
			System.out.println();
		}
	}

}
