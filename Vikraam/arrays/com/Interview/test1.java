package com.Interview;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		String a="abc";
		int n=4;
		String s=encrpyt(a,n);
		System.out.println(s);
		System.out.println(decrpyt(a,n));
		
	}
	
	public static String encrpyt(String a,int n) {
		String temp="";
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(Character.isUpperCase(ch)) {
				temp+=(char)(((((ch+n)-'A')%26)+26)%26+'A');
			}
			else if(Character.isLowerCase(ch)) {
				temp+=(char)(((((ch+n)-'a')%26)+26)%26+'a');
			}
			else
			{
				temp+=n;
			}
			
		}
		return temp;
	}
	public static String decrpyt(String a,int n) {
		String temp="";
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(Character.isUpperCase(ch)) {
				temp+=(char)(((((ch-n)-'A')%26)+26)%26+'A');
			}
			else if(Character.isLowerCase(ch)) {
				temp+=(char)(((((ch-n)-'a')%26)+26)%26+'a');
			}
			else
			{
				temp+=n;
			}
			
		}
		return temp;
	}
}