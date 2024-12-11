package com.CompareTo;

import java.util.Arrays;

public class BookDriver {

	public static void main(String[] args) {
		Book[] b= {new Book("SQL"),new Book("JAVA"),new Book("JAVASCRIPT"),new Book("REACT"),
				new Book("Python"),new Book("MongoDB")};
		Arrays.sort(b);
		for(Book n:b) {
			System.out.println(n);
		}
	}

}
