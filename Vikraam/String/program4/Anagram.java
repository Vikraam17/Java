package program4;

public class Anagram {

	public static void main(String[] args) {
		String s1="god";
		String s2="dog";
		if(isAnagram(s1,s2)) {
			System.out.println(s1+ " and "+ s2+" String is an anagram");
		}
		else {
			System.out.println(s1+ " and "+ s2+" String is not an anagram");
		}

	}
	public static boolean isAnagram(String s1,String s2) {
		while(true) {
			
			if(s1.length()!=s2.length())
				return false;
			if(s1.length()==0&&s2.length()==0)
				return true;
			char ch=s1.charAt(0);
			s1=s1.replace(ch+"", "");
			s2=s2.replace(ch+"", "");
		}
		
	}

}