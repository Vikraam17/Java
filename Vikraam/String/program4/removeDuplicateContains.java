package program4;

public class removeDuplicateContains {
	public static void main(String[] args) {
		String s="jjaaavaavvva";
		String s2="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!s2.contains(ch+"")) {
				s2+=ch;
			}
		}
		System.out.println(s2);
	}
}
