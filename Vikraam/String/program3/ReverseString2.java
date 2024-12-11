package program3;

public class ReverseString2 {
	public static void main(String[] args) {
		String s="java is easy";
		String s2="";
		int i=s.length()-1;
		int j=s.length()-1;
		while(i>=0) {
			while(i>=0&&s.charAt(i)!=' ')
				i--;
			String temp="";
			int k=i+1;
			while(k<=j) {
				temp+=s.charAt(k);
				k++;
			}
			s2+=temp;
			if(i>0) {
				s2+=" ";
			}
			i--;
			j=i;
		}
		System.out.println(s2);
	}
}
