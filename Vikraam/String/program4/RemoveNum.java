package program4;

public class RemoveNum {

	public static void main(String[] args) {
		String s="ja12va34";
		String s1="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9') {
				s1+="";
			}
			else {
				s1+=ch;
			}
		}
		System.out.println(s1);
		
	}

}
