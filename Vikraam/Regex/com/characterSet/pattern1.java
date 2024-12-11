package com.characterSet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern1 {
		public static void main(String[] args) {
			String s="a2Ac4Gd5Htyy9K";
			String exp="([a-z][0-9])([A-Z])";
			Pattern p=Pattern.compile(exp);
			Matcher m=p.matcher(s);
			while(m.find()) {
				System.out.println(m.group());
			}
		}
}
