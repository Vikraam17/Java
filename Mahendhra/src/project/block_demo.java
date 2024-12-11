package project;


public class block_demo {
	static
	{
		System.out.println("Static-block");
	}
	{
		System.out.println("Non-Static-block");
	}
	block_demo(){
		System.out.println("Constructor ");
	}
	public static void main(String[] args) {
		new block_demo();
		new block_demo();
	}
	static {
		System.out.println("Static-block-2");
	}
	{
		System.out.println("Non-Static block-2");
	}
}
