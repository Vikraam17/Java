package com.abstraction;

abstract class shape{
	String color;
	public shape(String color) {
		this.color=color;
	}
	abstract void area();
	abstract void display();
}
class Rectangle extends shape{

	int length;
	int breadth;
	public Rectangle(String color,int length,int breadth) {
		super(color);
		this.length=length;
		this.breadth=breadth;
	}

	@Override
	void area() {
		System.out.println(length*breadth);
	}
	@Override
	void display() {
		System.out.println(length);
		System.out.println(breadth);	
	}
}
class circle extends shape{
	int radius;
	public circle(String color,int radius) {
		super(color);
		this.radius=radius;
	}
	@Override
	void area() {
		double res=3.14*radius*radius;
		System.out.println(res);
	}
	@Override
	void display() {
		System.out.println(radius);
	}
}
public class Test 
{

	public static void main(String[] args) 
	{
		shape s=new Rectangle("Black",5,10);
		s.area();
		s.display();
		s=new circle("white",20);
		s.area();
		s.display();
	}


}
