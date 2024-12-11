package com.HasArelationship;

public class Mobile {
	String name;
	String color;
	int ram;
	int rom;
	simCard s;
	public Mobile(String name,String color,int ram,int rom) {
		this.name=name;
		this.color=color;
		this.ram=ram;
		this.rom=rom;
	}
	public void insertSim(simCard s) {
		this.s=s;
	}
	public void display() {
		if(s!=null)
			s.simDisplay();
		else
			System.out.println("Simcard is not added");
		System.out.println(name);
		System.out.println(color);
		System.out.println(ram);
		System.out.println(rom);
	}

}
