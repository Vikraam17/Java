package com.binding;

class vehicle{
	void Start() {
		
	}
	void accelarate() {
		
	}
	void stop() {
		
	}
}
class BMW extends vehicle{
	void Start() {
		System.out.println("BMW-Starts");
	}
	void accelarate() {
		System.out.println("BMW-Going");
	}
	void stop() {
		System.out.println("BMW-Stopped");
	}
}

class BENZ extends vehicle{
	void Start() {
		System.out.println("Benz-Starts");
	}
	void accelarate() {
		System.out.println("Benz-Going");
	}
	void stop() {
		System.out.println("Benz-Stopped");
	}
}

class AUDI extends vehicle{
	void Start() {
		System.out.println("AUDI-Starts");
	}
	void accelarate() {
		System.out.println("AUDI-Going");
	}
	void stop() {
		System.out.println("AUDI-Stopped");
	}
}
class Driver
{
	static void drive(vehicle v) 
	{
		v.Start();
		v.accelarate();
		v.stop();
	}
}

public class VehicleDriver {

	public static void main(String[] args) {
		Driver.drive(new BENZ());
		System.out.println("=================");
		Driver.drive(new BMW());
		System.out.println("=================");
		Driver.drive(new AUDI());

	}

}
