package com.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class tree {
		public static void main(String[] args) {
			Set<Integer> s=new TreeSet<Integer>();
			s.add(10);
			s.add(20);
			s.add(30);
			s.add(50);
			s.add(40);
			
			Set<String> s1=new TreeSet();
			TreeSet<String> s2=new TreeSet();
			s1.add("viky");
			s1.add("vino");
			s1.add("muthu");
			s1.add("sudeep");
			
			s1.add("manoj");
			s1.add("suthish");
//			s1.clear();
			System.out.println(s1.contains("viky"));
			s2.addAll(s1);
			s1.add("raja");
			s1.add("rani");
			System.out.println(s);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s2.first());
			System.out.println(s2.last());
			s1.retainAll(s2);
			System.out.println(s1);
			System.out.println(s2);
			
			s1.removeAll(s2);
			System.out.println(s1);
			System.out.println(s2);
		}
}
