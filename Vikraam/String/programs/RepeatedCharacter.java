package programs;

public class RepeatedCharacter {

	public static void main(String[] args) {
		String s="success";
		char[] c=s.toCharArray();	
		int i=0;
		String rs="";
		while(i<s.length()) {
			char ch=c[i];
			rs+=ch;
			i++;
			while(i<s.length() && ch==c[i]) {
				rs+=c[i];
				i++;
			}
			if(rs.length()>1) {
				System.out.println(rs);
			}
			rs="";
		}
	}
}
