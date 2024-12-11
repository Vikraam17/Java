package Inheritance;

class animal
{
	void eat()
	{
		System.out.println("Animal Eating");
	}
}
class Dog extends animal
{
	void bark()
	{
		System.out.println("bow bow....");
	}
}
class puppy extends Dog
{
	void weep()
	{
		System.out.println("weeping.....");
	}
}
public class multi_level {

	public static void main(String[] args) {
		animal a=new animal();
		a.eat();
		Dog d=new Dog();
		d.eat();
		d.bark();
		puppy p=new puppy();
		p.eat();
		p.bark();
		p.weep();

	}

}
