package project;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		for(int n=1;n<=100;n++) {
		if(isPrime(n,n/2))
			System.out.println(n);
		}
	}
	public static boolean isPrime(int n,int i) {
		if(n<=1)return false;
		if(i==1)return true;
		if(n%i==0)return false;
		return isPrime(n,--i);
	}
} 
