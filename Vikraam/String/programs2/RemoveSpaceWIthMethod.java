package programs2;

public class RemoveSpaceWIthMethod {
	public static void main(String[] args) {
		String s=" ja va ";
		System.out.println(s.length());
		String s1=s.replaceAll(" ","");
		System.out.println(s1);
		System.out.println(s.length());
		System.out.println(s1.length());
	}
}
