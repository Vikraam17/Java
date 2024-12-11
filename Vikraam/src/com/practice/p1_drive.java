package com.practice;

public class p1_drive {
		public static void main(String[] args) {
			p1 p=new p1();	
			p.setM(10);
			p.setN(20);
			System.out.println(p.getM());
			System.out.println(p.getN());
			System.out.println("================================");
			p1 p2=new p1();	
			p2.setM(30);
			p2.setN(40);
			System.out.println(p2.getM());
			System.out.println(p2.getN());
		}
}
