package constructor;
class Father{
	String name="james";
}
class son extends Father{
	String name="Smith";
	void sonData() {
		System.out.println("Father name is : " +super.name);
	}
}
public class Family {
	public static void main(String[] args) {
		son s=new son();
		s.sonData();
	}
}
