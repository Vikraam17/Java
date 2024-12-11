package com.Comparator;

import java.util.Arrays;
import java.util.Scanner;

public class StudentDriver {

	public static void main(String[] args) {
		student[] arr= { new student("viky",98),
				new student("sravani",88),
				new student("Dheepa",78),
				new student("muthu",48),
				new student("gibson",58),
				new student("pradeep",68)};
			Scanner sc=new Scanner(System.in);	
			System.out.println("Order by: ");
			String o=sc.next();
			if(o.equalsIgnoreCase("name")) {
				Arrays.sort(arr);
		}
			else if(o.equalsIgnoreCase("marks")) {
				Arrays.sort(arr,new MarkComparable());
			}
			System.out.println("------------------");
			for(student s:arr) {
				System.out.println(s);
			}

	}

}
