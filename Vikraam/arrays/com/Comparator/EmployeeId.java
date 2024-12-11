package com.Comparator;

import java.util.Comparator;

public class EmployeeId implements Comparator{
	public int compare(Object args1,Object args2) {
		return ((Employee)args1).id-((Employee)args2).id;
	}
	
}
class EmployeeIdDesc implements Comparator{
	public int compare(Object args1,Object args2) {
		return ((Employee)args2).id-((Employee)args1).id;
	}
	
}
