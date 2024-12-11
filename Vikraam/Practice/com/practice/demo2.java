package com.practice;
class parent{
	int x;
	parent(){
		System.out.println("hello child");
	}
}
class child extends parent{
	int x;
	child(){
		super();
		System.out.println("child hi");
	}
}
public class demo2 {
	public static void main(String[] args) {
		child c=new child();
	}
}
