package com.Innerclass;

public class Theater {
	void popcorn() {
		System.out.println("Normal Popcorn");
	}
	public static void main(String[] args) {
		Theater t=new Theater();
		t.popcorn();
		Theater t1=new Theater()
		{
			@Override
			void popcorn() {
				System.out.println("Peri..Peri...");
			}
		};
		new Theater() {
			@Override
			void popcorn() {
				System.out.println("Jolly..jolly..");
			}
		}.popcorn();
		t1.popcorn();
		new Theater()
		{
			@Override
			void popcorn() {
				System.out.println("Salty");
			}
		}.popcorn();
		System.out.println(t.getClass().getName());
		System.out.println(t1.getClass().getName());
	}
		
}
