package com.method;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class alpgroup {
	public static void main(String[] args) {
		String s="abacadaeaf";
		String exp="a[bcd]";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		while(m.find())
		System.out.println(m.group());
	}
}
