package Inheritance;

class animal_2
{
	void eat()
	{
		System.out.println("Animal Eating");
	}
}
class Dog_2 extends animal_2
{
	void bark()
	{
		System.out.println("bow bow....");
	}
}
class puppy_2 extends Dog_2
{
	void weep()
	{
		System.out.println("weeping.....");
	}
}

class cat extends animal_2{
	void sound(){
		System.out.println("meowwwwwwwwwwwwwwwwwww");
	}
}
public class hirarical{

	public static void main(String[] args) {
		animal_2 a=new animal_2();
		a.eat();
		Dog_2 d=new Dog_2();
		d.eat();
		d.bark();
		puppy_2 p=new puppy_2();
		p.eat();
		p.bark();
		p.weep();
		cat c=new cat();
		c.eat();
		c.sound();

	}

}
