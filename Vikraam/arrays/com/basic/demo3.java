package com.basic;
class pen
{
	String color;

	public pen(String color) {
		this.color = color;
	}
	@Override
	public String toString()
	{
		return color;
	}
	
}
public class demo3 {

	public static void main(String[] args) {
		pen[] arr=new pen[4];
		arr[0]=new pen("black");
		arr[1]=new pen("blue");
		arr[2]=new pen("white");
		arr[3]=new pen("green");
		for(pen p:arr) {
			System.out.println(p);
		}

	}

}
