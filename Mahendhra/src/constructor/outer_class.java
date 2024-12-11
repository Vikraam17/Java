package constructor;

public class outer_class {
	static class inner{
		static void m1() {
			System.out.println("m1-Inner");
		}
	}
	public static void main(String[] args) {
		outer_class o=new outer_class();
		inner.m1();
	}
}
