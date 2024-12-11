package com.CompareTo;

public class demo {
	public static void main(String[] args) {
		String s1="Balu";
		String s2="Bhanu";
		System.out.println(s1.compareTo(s2));
		String s3="B";
		String s4="a";
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareToIgnoreCase(s4));
	}
}
