package program4;

public class MissingVowels {

	public static void main(String[] args) {
		String s="jspiders";
		String cont="aeiou";
		s=s.toLowerCase();
		for(int i=0;i<cont.length();i++) {
			char ch=cont.charAt(i);
			if(s.indexOf(ch)==-1) {
				System.out.println(ch);
			}
		}
		
	}

}
