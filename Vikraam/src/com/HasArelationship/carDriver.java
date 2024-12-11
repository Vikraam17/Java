package com.HasArelationship;

public class carDriver {

	public static void main(String[] args) {
		Car c=new Car("BMW", 1234, "BLACK", new Engine(2000));
		c.e.cc=3000;
		c.display();
		Car c1=new Car("Benz",4321, "WHITE", new Engine(4000));
		c1.display();

	}

}
