package com.Interview;

import java.util.Scanner;

public class WIthoutAnyStringFunctionCount {
		public static void main(String[] args) {
			Scanner sc=new Scanner("Jspiders is good Institute");
			sc.useDelimiter("");
			int count=0;
			while(sc.hasNext()) {
				sc.next();
				count++;
			}
			System.out.println(count);
			sc.close();
		}
}
