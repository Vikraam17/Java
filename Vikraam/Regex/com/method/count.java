package com.method;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class count {
	public static void main(String[] args) {
		String s="ababbbacdea";
		String exp="ab";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		int count=0;
		while(m.find())count++;
		System.out.println(count);
	}
}
