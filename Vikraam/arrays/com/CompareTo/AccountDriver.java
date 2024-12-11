package com.CompareTo;

import java.util.Arrays;

public class AccountDriver {
	public static void main(String[] args) {
		Account[] a=new Account[5];
		a[0]=new Account(15500.80);
		a[1]=new Account(23456.90);
		a[2]=new Account(34740.56);
		a[3]=new Account(45678.98);
		a[4]=new Account(35500.87);
		Arrays.sort(a);
		for(Account n:a) {
			System.out.println(n);
		}
	}
}
