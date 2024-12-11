package programs2;

public class lowToUpSwap {
	public static void main(String[] args) {
		String s="AAAbbb";
		String temp="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z') {
				ch+=32;
				temp+=ch;
			}
			else if(ch>='a'&&ch<='z') {
				ch-=32;
				temp+=ch;
			}
		}
		System.out.println(temp);
	}
}
