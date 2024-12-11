package program;

class parent{
	int x=10;
}
class c extends parent{
	int x=20;
	c(){
		System.out.println(x);
		System.out.print(super.x);
	}
}
public class Sup_demo {
	public static void main(String[] args) {
		c b=new c();
	}
	
}
