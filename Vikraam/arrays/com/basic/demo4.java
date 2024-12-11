package com.basic;

interface animal
{
	void sound();
}
class dog implements animal{
	@Override
	public void sound() {
		System.out.println("Bow...Bow...");
	}
	public void jump() {
		System.out.println("Dog Jumping");
	}
}
class cat implements animal{

	@Override
	public void sound() {
		System.out.println("meowwwwwwwwwwww");
	}
	public void killRat() {
		System.out.println("Killed Rat");
	}
	
}
public class demo4 {

	public static void main(String[] args) {
		animal[] a=new animal[4];
		a[0]=new dog();
		a[1]=new cat();
		a[2]=new cat();
		a[3]=new dog();
		for(animal n:a)
		{
			n.sound();
			if(n instanceof dog)
			{
				dog d=(dog)n;
				d.jump();
			}
			if(n instanceof cat)
			{
//				cat c=(cat)n;
//				c.killRat();
				((cat)n).killRat();
			}
			System.out.println("----------------");
		}
		
	}

}
