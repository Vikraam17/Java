package com.HasArelationship;

public class mobileDriver {
	public static void main(String[] args) {
		Mobile m1=new Mobile("Oppo", "Green", 8, 128);
		m1.display();
		Mobile m2=new Mobile("SAMSUNG", "Black", 8, 256);
		m2.insertSim(new simCard("Airtel",987654321));
		m2.display();
	}

}
