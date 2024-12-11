package com.upcasting;

class vechicle{
	
}
class BMW extends vechicle {
	
}
class Benz extends vechicle{
	
}
class Audi extends vechicle{
	
}
class bike{
	
}
class Driver{
	public static void driver(vechicle v) {
		System.out.println("Driving");
	}
}
public class vehicleDriver {

	public static void main(String[] args) {
		Driver.driver(new BMW());
		Benz b=new Benz();
		Driver.driver(b);
		Driver.driver(new Audi());
		//Driver.driver(bike); //CTE
		

	}

}
