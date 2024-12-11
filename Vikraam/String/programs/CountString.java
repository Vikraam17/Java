package programs;

public class CountString {
	public static void main(String[] args) {
		String s="banana";
		while(s.length()>0) {
			char c=s.charAt(0);
			String s2=s.replace(c+"", " ");
			int count=s.length()- s2.length();
			System.out.println(c+" "+count);
			System.out.println(s==s2);
		}
	}
}
