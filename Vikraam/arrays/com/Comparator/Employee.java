package com.Comparator;
import java.lang.Comparable;
public class Employee implements Comparable{
	String name;
	int sal;
	int id;
	private static int n=1000;
	public Employee(String name2, int sal2) {
		this.id=n;
		this.name = name2;
		this.sal = sal2;
		n++;
	}
	@Override
	public String toString() {
		return "Employee [ id=" +id +",name=" + name + ",sal=" + sal + "]";
	}
	public int compareTo(Object args) {
		String n1=name;
		String n2=((Employee)args).name;
		return n1.compareTo(n2);
	}
}
