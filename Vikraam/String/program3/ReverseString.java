package program3;

public class ReverseString {
	public static void main(String[] args) {
		String s="java is easy";
		String s2="";
		int i=0;
		int j=0;
		while(j<s.length()) {
			while(j<s.length()&&s.charAt(j)!=' ')
				j++;
			String temp="";
			int k=j-1;
			while(k>=i) {
				temp+=s.charAt(k);
				k--;
			}
			s2+=temp;
			if(j<s.length()) {
				s2+=" ";
			}
			j++;
			i=j;
		}
		System.out.println(s2);
	}
}
