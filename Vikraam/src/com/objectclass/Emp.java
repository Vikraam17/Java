package com.objectclass;

public class Emp {

	String name;
	int age;
	int id;
	long mnum;
	public Emp(String s,int age,int id,long mnum) {
		name =s;
		this.age=age;
		this.id=id;
		this.mnum=mnum;
	}
	public String toString() {
		return name+" "+age+" "+id+" "+mnum;
	}
	public boolean equals(Object o) {
		Emp e=(Emp)o;
		return this.name.equals(e.name)&&this.age==e.age&&this.id==e.id&&this.mnum==e.mnum;
	}
	public static void main(String[] args) {
		Emp e1=new Emp("Ram", 12, 21, 123456789);
		Emp e2=new Emp("Ram", 12, 21, 123456789);
		System.out.println(e1);
		System.out.println(e2.toString());
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
	}
}