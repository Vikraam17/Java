package com.characterSet;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddNum {
		public static void main(String[] args) {
			String s="ABCde124@#$%%*K2345678HUifdfg";
			String exp="[0-9]";
			Pattern p=Pattern.compile(exp);
			Matcher m=p.matcher(s);
			int add=0;
			while(m.find()) {
				add+=Integer.parseInt(m.group());
			}
			System.out.println(add);
		}
}
