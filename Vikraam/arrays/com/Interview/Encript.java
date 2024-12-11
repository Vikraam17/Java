package com.Interview;

public class Encript {

	public static void main(String[] args) {
		String s="abc";
		int n=3;
		String encryption=encrypt(s,n);
		String decryption=decrypt(s,n);
		System.out.println("Original String = "+s);
		System.out.println("Encryption = "+encryption);
		System.out.println("Decryption = "+decryption);
		
		
	}
	public static String encrypt(String s,int n) {
		String temp="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch)) {
				temp+=(char)(((((ch+n)-'A')%26)+26)%26+'A');
			}
			else if(Character.isLowerCase(ch)) {
				temp+=(char)(((((ch+n)-'a')%26)+26)%26+'a');
			}
			else {
				temp+=ch;
			}
		}
		return temp;
	}
	public static String decrypt(String s,int n) {
		String temp="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch)) {
				temp+=(char)(((((ch-n)-'A')%26)+26)%26+'A');
			}
			else if(Character.isLowerCase(ch)) {
				temp+=(char)(((((ch-n)-'a')%26)+26)%26+'a');
			}
			else {
				temp+=ch;
			}
		}
		return temp;
	}
}