package com.Comparator;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee[] e= {new Employee("Gibson",230000),
				new Employee("Sudeep",300000),
				new Employee("Muthu",550000),
				new Employee("Jothish",900000),
				new Employee("Viky",800000)
		};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Order by value:");
		String o=sc.next();
		if(o.equalsIgnoreCase("name"))
		{
			System.out.println("Enter the Order:");
			String x=sc.next();
			if(x.equalsIgnoreCase("Asc")) {
				Arrays.sort(e,new EmployeeName());
			}
			else if(x.equalsIgnoreCase("Desc")) {
				Arrays.sort(e,new EmployeeNameDesc());
			}
			
		}
		else if(o.equalsIgnoreCase("sal")) {
			System.out.println("Enter the Order:");
			String x=sc.next();
			if(x.equalsIgnoreCase("Asc")) {
				Arrays.sort(e,new EmployeeSal());
			}
			else if(x.equalsIgnoreCase("Desc")) {
				Arrays.sort(e,new EmployeeSalDesc());
			}
			
		}
		else if(o.equalsIgnoreCase("id")) {
			System.out.println("Enter the Order:");
			String x=sc.next();
			if(x.equalsIgnoreCase("Asc")) {
				Arrays.sort(e,new EmployeeId());
			}
			else if(x.equalsIgnoreCase("Desc")) {
				Arrays.sort(e,new EmployeeIdDesc());
			}
			
		}
		for(Employee n:e) {
			System.out.println(n);
		}
	}
}
