package com.practice;


class emp {
    String name;
    int age;
    int id;
    long mobileno;
    emp(String name,int age,int id,long mobileno){
    	this.name=name;
    	this.age=age;
    	this.id=id;
    	this.mobileno=mobileno;
    }
}
public class demo{
	public static void main(String[] args) {
		emp a[]=new emp[5];
		a[0]=new emp("Vikraam",10,101,987654321);
		a[1]=new emp("Ram",12,102,987654321);
		a[2]=new emp("Dheepa",13,103,987654321);
		a[3]=new emp("Vino",15,104,987654321);
		a[4]=new emp("Niru",16,105,987654321);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i].name+" ");
			System.out.print(a[i].age+" ");
			System.out.print(a[i].id+" ");
			System.out.print(a[i].mobileno);
			System.out.println();
		}
		
		}
}