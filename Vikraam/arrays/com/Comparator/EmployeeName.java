package com.Comparator;

import java.util.Comparator;

public class EmployeeName implements Comparator{
	public int compare(Object args1,Object args2) {
		String s1=((Employee)args1).name;
		String s2=((Employee)args2).name;
		return s1.compareTo(s2);
	}
	
}
class EmployeeNameDesc implements Comparator{
	public int compare(Object args1,Object args2) {
		String s1=((Employee)args1).name;
		String s2=((Employee)args2).name;
		return s2.compareTo(s1);
	}
	
}
