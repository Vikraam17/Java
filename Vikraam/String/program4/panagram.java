package program4;

public class panagram {

	public static void main(String[] args) {
		String s="a quick brown fox jumps over the lazy dog";
		if(isPanagram(s)) {
			System.out.println("Given string is panagram");
		}
		else
			System.out.println("Given string is not panagram");
		
	}
	public static boolean isPanagram(String s)
	{
		s=s.toLowerCase();
		if(s.length()<26) {
			return false;
		}
		for(char ch='a';ch<='z';ch++) {
			if(s.indexOf(ch)==-1)return false;
		}
		return true;
	}

}
