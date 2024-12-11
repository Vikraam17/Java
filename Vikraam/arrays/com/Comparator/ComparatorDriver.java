package com.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDriver {

	public static void main(String[] args) {
		String[] c= {"Sql","C","Java","Javascript","Html"};
		Arrays.sort(c,new lencomparator());
		for(String n:c) {
			System.out.println(n);

	}
	}

}
