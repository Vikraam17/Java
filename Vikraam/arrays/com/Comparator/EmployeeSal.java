package com.Comparator;

import java.util.Comparator;

public class EmployeeSal implements Comparator{
	public int compare(Object args1,Object args2) {
		return ((Employee)args1).sal-((Employee)args2).sal;
	}
	
}
class EmployeeSalDesc implements Comparator{
	public int compare(Object args1,Object args2) {
		return ((Employee)args2).sal-((Employee)args1).sal;
	}
	
}
