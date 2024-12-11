package programs2;

public class RemoveSpace {
	public static void main(String[] args) {
		String s=" ja va ";
		String temp="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch!=' ')temp+=ch;
		}
		System.out.println(temp);
	}
}
