package com.Comparator;

import java.lang.Comparable;

public class student implements Comparable {
	String name;
	int marks;
	public student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", marks=" + marks + "]";
	}
	public int compareTo(Object arg) {
		String n1=this.name;
		String n2=((student)arg).name;
		return n1.compareTo(n2);
		
	}
	
	
}
