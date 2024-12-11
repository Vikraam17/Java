package com.DoubleLinkedList;

public class DoubleLinkedListDriver {

	public static void main(String[] args) {
		DoubleLinkedList l=new DoubleLinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(4,60);
		l.remove(0);
		System.out.println(l.size());
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}

	}

}
