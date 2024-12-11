package com.Lists;

public class LinkedListDriver {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(4,50);
		//l.remove(4);
		for(int i=0;i<l.size();i++) {
			int n=(Integer)l.get(i);
			System.out.print(n + " "); //l.get(i)
		}
		System.out.println();
		l.reverse();
		for(int i=0;i<l.size();i++) {
			int n=(Integer)l.get(i);
			System.out.print(n + " "); //l.get(i)
		}
	}

}
