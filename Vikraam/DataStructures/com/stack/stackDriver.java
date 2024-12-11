package com.stack;

public class stackDriver {

	public static void main(String[] args) {
		stack s=new stack();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		s.add(90);
		s.add(100);
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.size());
		System.out.println(s);
		System.out.println(s.isEmpty());

	}

}
