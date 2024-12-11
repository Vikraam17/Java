package programs;

public class ReplaceString {
	public static void main(String[] args) {
		String s="Java";
		String s1=s.replace('a', 'o');
		System.out.println(s1);
		System.out.println(s1.replace('o', 'a'));
	}
}
