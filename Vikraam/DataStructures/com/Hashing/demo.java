package com.Hashing;

import java.util.*;

public class demo {

	public static void main(String[] args) {
		Student s1=new Student("Viky",97);
		Student s2=new Student("Dheepa",99);
		Student s3=new Student("Viky",97);
		Set s=new Set();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.display();
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		
	}

}
