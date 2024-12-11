package com.HasArelationship;

public class simCard {
	String name;
	long number;
	public simCard(String name,long number) {
		this.name=name;
		this.number=number;
	}
	public void simDisplay()
	{
		System.out.println("Name of simCard : "+name);
		System.out.println("Number of simCard : "+number);
	}

}
