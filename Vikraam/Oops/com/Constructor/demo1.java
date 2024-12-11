package com.Constructor;
class bike{
	String color;
	bike(String c){
		color=c;
	}
}
class Garage{
	void changeColor(bike b) {
		b.color="white";
		System.out.println("Color Changed");
	}
}
public class demo1 {

	public static void main(String[] args) {
		bike b1=new bike("Black");
		System.out.println(b1.color);
		Garage g1=new Garage();
		g1.changeColor(b1);
		System.out.println(b1.color);
		
	}

}
