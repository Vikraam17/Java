package com.interface3;
interface washable{
	
}
class car implements washable{
	
}
class bike implements washable{
	
}
class laptop{
	
}
class TV{
	
}
class washer{
	public static void wash(Object o) {
		if(o instanceof washable) {
			System.out.println(o.getClass().getSimpleName()+" is washed");
		}
		else {
			System.out.println(o.getClass().getSimpleName()+" is not washed");
		}
	}
}
public class markerinterface {
	public static void main(String[] args) {
		washer.wash(new car());
		washer.wash(new bike());
		washer.wash(new laptop());
		washer.wash(new TV());
	}
}
