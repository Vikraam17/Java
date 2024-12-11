package com.method;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dot2 {
	public static void main(String[] args) {
		String s="abab.bb.ac.dea";
		String exp="[.]";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
		int count=0;
		while(m.find())count++;
		System.out.println(count);
	}
}
