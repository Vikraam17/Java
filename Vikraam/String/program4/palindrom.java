package program4;

public class palindrom {
	public static void main(String[] args) {
		String s="malayalam";
		String bigPalindrome="";
		for(int i=0;i<s.length();i++) {
			for(int j=i+3;j<s.length();j++) {
				String str=s.substring(i,j);
				if(isPalindrom(str)) {
					if(str.length()>bigPalindrome.length())
					bigPalindrome=str;
					System.out.println(str);
				}
				
			}
		}
		System.out.println("================");
		System.out.println(bigPalindrome);
	}
	public static boolean isPalindrom(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
