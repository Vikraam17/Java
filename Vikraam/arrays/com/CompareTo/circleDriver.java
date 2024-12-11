package com.CompareTo;

import java.util.Arrays;

public class circleDriver {
	public static void main(String[] args) {
		circle[] a= {new circle(10),new circle(30),
				new circle(60),	new circle(70),new circle(20),new circle(50),new circle(40)};
		Arrays.sort(a);
		for(circle n:a) {
			System.out.println(n);
		}
	}
}
