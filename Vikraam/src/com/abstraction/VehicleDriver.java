package com.abstraction;

abstract class Vehicle{
	abstract void start();
	abstract void accelarate();
	abstract void stopped();
}
class BMW extends Vehicle{
	@Override
	void start()
	{
		System.out.println("BMW - Started");
	}

	@Override
	void accelarate() {
		System.out.println("BMW - Going");
	}

	@Override
	void stopped() {

		System.out.println("BMW - Stopped");
		
	}
}
class BENZ extends Vehicle{
	@Override
	void start()
	{
		System.out.println("BENZ - Started");
	}

	@Override
	void accelarate() {
		System.out.println("BENZ - Going");
		
	}

	@Override
	void stopped() {

		System.out.println("BENZ - Stopped");
		
	}
}
class AUDI extends Vehicle{
	@Override
	void start()
	{
		System.out.println("AUDI - Started");
	}

	@Override
	void accelarate() {
		System.out.println("AUDI - Going");
		
	}

	@Override
	void stopped() {

		System.out.println("AUDI - Stopped");
		
	}
}
public class VehicleDriver {

	public static void main(String[] args) {
		Vehicle v = new BMW();
		v.start();
		v.accelarate();
		v.stopped();
		System.out.println("===============");
		v = new BENZ();
		v.start();
		v.accelarate();
		v.stopped();
		System.out.println("===============");
		v = new AUDI();
		v.start();
		v.accelarate();
		v.stopped();

	}

}
