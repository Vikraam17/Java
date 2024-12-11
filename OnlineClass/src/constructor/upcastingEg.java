package constructor;
class person{
	String name;
}
class student extends person{
	int sid;
}
public class upcastingEg {
	public static void main(String[] args) {
		student s1=new student();
		
		person p=s1; //upcasting
		System.out.println(p.name); //null
		System.out.println(s1.name); //null
		System.out.println(s1.sid); //0
		
		student s2=(student)p; //Downcasting
		System.out.println(s2.name); //null
		System.out.println(s2.sid); //0
	}
}
// Limitation
// with the help of parent type object reference we cannot access 
// child class members

//Downcasting:
//	converting parent type reference to the child type

//--> Upcasting:
//	Syntax
//	(target type)object reference;
	