package Innerclass;
class Employee{
	String name;
	int id;
	String role;
	Employee(String name, int id, String role) {
		this.name = name;
		this.id = id;
		this.role = role;
	}
	public void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(role);
	} 
}
public class factory_method {  
	public static void main(String[] args) {
		Employee e1=new Employee("Poorna",102,"Java Developer");
		Employee e2=getInstance("Viky",101,"developer");
		e2.display();
	}
	public static Employee getInstance(String name,int id,String role) {
		return new Employee(name,id,role);
	}
}
