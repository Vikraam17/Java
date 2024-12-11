package com.practice;
class B{
	int i,j;
	B(int i){
		this.i=i;
	}
	B(int i,int j){
		this(i);
		this.j=j;
	}
	public void display() {
		System.out.println(i);
		System.out.println(j);
	}
}
public class thisconstructor {
	public static void main(String[] args) {
		B b1=new B(10,20);
		b1.display();
	}
}
