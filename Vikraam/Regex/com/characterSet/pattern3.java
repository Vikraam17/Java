package com.characterSet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern3 {
		public static void main(String[] args) {
			String s="banana";
			String exp="([a-z][a-z])\\1";
			Pattern p=Pattern.compile(exp);
			Matcher m=p.matcher(s);
			while(m.find()) {
				System.out.println(m.group());
			}
		}
}

