package com.quantifer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class idCheck { 
		public static void main(String[] args) {
			String s="sdfghjkl98765@gmail.comdszdxfcgvhbjn@gmail.comdfxtygjbn";
			String exp="[a-z0-9]{1,}@gmail.com";
			Pattern p=Pattern.compile(exp);
			Matcher m=p.matcher(s);
			while(m.find()) {
				System.out.println(m.group());
			}
		}
}

