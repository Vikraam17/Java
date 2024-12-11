package com.quantifer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mobileNum {
		public static void main(String[] args) {
			String s="aba98745654321bbabbb898765765432ab79878765465432bbb69876543212345abbbbb";
			String exp="[9876][0-9]{9}";
			Pattern p=Pattern.compile(exp);
			Matcher m=p.matcher(s);
			while(m.find()) {
				System.out.println(m.group());
			}
		}
}

