package com.interfacei;
interface Regulator{
	void incrementSpeed();
	void dreceasedSpeed();
}
interface Switch{
	void On();
	void Off();
}
class Fan implements Regulator,Switch
{

	@Override
	public void On() {
		System.out.println("Fan is On");
		
	}

	@Override
	public void Off() {
		System.out.println("Fan is Off");
		
	}

	@Override
	public void incrementSpeed() {
		System.out.println("Speed Increased");
		
	}

	@Override
	public void dreceasedSpeed() {
		System.out.println("Speed decreased");
		
	}
	
}
public class Demo {

	public static void main(String[] args) {
		Fan f=new Fan();
		f.On();
		f.Off();
		f.incrementSpeed();
		f.dreceasedSpeed();
		System.out.println("===================");
		Regulator r=new Fan();
		r.incrementSpeed();
		r.dreceasedSpeed();
		System.out.println("===================");
		Switch s=new Fan();
		s.On();
		s.Off();
	}

}
