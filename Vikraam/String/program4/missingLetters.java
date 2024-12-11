package program4;

public class missingLetters {

	public static void main(String[] args) {
		String s="jspiders";
		s=s.toLowerCase();
		for(char i='a';i<='z';i++) {
			if(s.indexOf(i)==-1) {
			System.out.print(i);
			}
		}
		
	}

}
