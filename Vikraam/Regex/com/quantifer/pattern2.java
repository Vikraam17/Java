package com.quantifer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern2 {
		public static void main(String[] args) {
			String s="ababbabbbabbbbabbbbb";
			String exp="ab{1,}";
			Pattern p=Pattern.compile(exp);
			Matcher m=p.matcher(s);
			while(m.find()) {
				System.out.println(m.group());
			}
		}
}

