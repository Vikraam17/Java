package com.HasArelationship;

public class Car {
	String name;
	int carName;
	String color;
	Engine e;
	public Car(String name,int carName,String color,Engine e) {
		this.e=e;
		this.name=name;
		this.carName=carName;
		this.color=color;
		
	}
	public void display() {
		System.out.println(e.cc);
		System.out.println(name);
		System.out.println(carName);
		System.out.println(color);
		
	}
}
