package Inheritance;

class phone{
	public phone() {
		System.out.println("call");
	}
}
class cameraPhone extends phone{
	public cameraPhone() {
		this(30);
		System.out.println("camera-phone");
	}
	public cameraPhone(int px) {
		System.out.println("camera-phone "+px);
	}
}
class smartPhone extends cameraPhone{
	public smartPhone(String n) {
		this();
		System.out.println("Smart-phone "+n);
	}
	public smartPhone()
	{
		System.out.println("No-arg smartphone");
	}
}
public class Test_3 {

	public static void main(String[] args) {
		smartPhone s=new smartPhone("BSNL");

	}

}
