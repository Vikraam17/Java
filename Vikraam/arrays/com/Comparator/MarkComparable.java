package com.Comparator;

import java.util.Comparator;

public class MarkComparable implements Comparator {
	public int compare(Object arg1,Object arg2) {
		return ((student)arg1).marks-((student)arg2).marks;
	}
}
