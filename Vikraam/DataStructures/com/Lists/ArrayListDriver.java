package com.Lists;

public class ArrayListDriver {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		System.out.println("SIZE= "+a.size());
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		a.add(6,55);
		System.out.println("SIZE= "+a.size());
		for(int i=0;i<a.size();i++) {
			int n=(Integer)a.get(i);
			System.out.println(n);
		}
		System.out.println("========================");
		System.out.println(a);
		

	}

}
