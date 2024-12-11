package com.CompareTo;

public class Book implements Comparable{
	String title;
	public Book(String t) {
		title=t;
	}
	@Override
	public int compareTo(Object args) {
		String t1=title;
		String t2=((Book)args).title;
		return t1.compareTo(t2);
	}
	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
	
}
