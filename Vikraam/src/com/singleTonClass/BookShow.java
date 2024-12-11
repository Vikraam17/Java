package com.singleTonClass;

public class BookShow {

	public static void main(String[] args) {
		Theater user1=Theater.getInstance();
		System.out.println(user1.seat);
		user1.BookTicket(25);
		System.out.println("=================");
		Theater user2=Theater.getInstance();
		System.out.println(user2.seat);
		user2.BookTicket(20);
		System.out.println("=================");
		Theater user3=Theater.getInstance();
		System.out.println(user3.seat);
		user3.BookTicket(10);
		System.out.println("=====================");

	}

}
