package com.quantifer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern1 {
		public static void main(String[] args) {
			String s="abbcddefggia";
			String exp="[a-z][a-z]{2}";
			Pattern p=Pattern.compile(exp);
			Matcher m=p.matcher(s);
			while(m.find()) {
				System.out.println(m.group());
			}
		}
}

