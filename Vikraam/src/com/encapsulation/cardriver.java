package com.encapsulation;
class car{
	private String name;
	private int carNum;
	private String color;
	private double price;
	public car(String name, int carNum, String color, double price) {
		super();
		this.name = name;
		this.carNum = carNum;
		this.color = color;
		this.price = price;
	}
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
}
public class cardriver {

	public static void main(String[] args) {
		car c=new car("Benz", 1001, "Black", 3000000);
		System.out.println(c.getName());
		System.out.println(c.getCarNum());
		System.out.println(c.getColor());
		System.out.println(c.getPrice());
		c.setCarNum(1002);
		c.setColor("Green");
		System.out.println("================");
		System.out.println(c.getName());
		System.out.println(c.getCarNum());
		System.out.println(c.getColor());
		System.out.println(c.getPrice());
		
		
		
		

	}

}
