package com.characterSet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
		public static void main(String[] args) {
			String s="ABCde124@#$%%*KHUifdfg";
			String exp="[^A-Za-z0-9]";
			Pattern p=Pattern.compile(exp);
			Matcher m=p.matcher(s);
			while(m.find()) {
				System.out.println(m.group());
			}
		}
}
