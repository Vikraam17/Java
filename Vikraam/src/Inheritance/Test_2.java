package Inheritance;

class DD{
	DD(){
		System.out.println("DD-cons");
	}
}
class EE extends DD{
	EE(){
		System.out.println("EE-cons");
	}
}
class FF extends EE{
	FF(){
		System.out.println("FF-cons");
	}
}
public class Test_2 {
	public static void main(String[] args) {
		FF c=new FF();
	}

}
