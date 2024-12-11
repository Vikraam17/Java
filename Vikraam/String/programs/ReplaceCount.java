package programs;

public class ReplaceCount {
	public static void main(String[] args) {
		String s="Javaca";
		int count =s.length()-s.replace("a"," ").length();
		System.out.println(count);
	}
}
