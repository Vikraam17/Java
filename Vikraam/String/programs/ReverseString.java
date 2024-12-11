package programs;

public class ReverseString {
	public static void main(String[] args) {
		String s="Vikraam";
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++) {
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		for(int i=s.length()-1;i>=0;i--) {
			s2+=s.charAt(i);
		}
		System.out.println(s2);
	}
}
