package constructor;

public class child extends parent {
	static {
		System.out.println("Child is loaded");
	}
	static void respect() {
		System.out.println("respect elders");
	}
}
