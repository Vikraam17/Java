package programs;

public class Palindrom {
		public static void main(String[] args) {
			String s="Madam";
			if(isPalindrom(s)) {
				System.out.println(s+" is palindrom");
			}
			else {
				System.out.println(s+ " Is not palindrom");
			}
		}
		public static boolean isPalindrom(String s) {
			char ch[]=s.toUpperCase().toCharArray();
			int i=0;
			int j=ch.length-1;
			while(i<j) {
				if(ch[i]!=ch[j]) {
					return false;
				}
				i++;
				j--;
			}
			return true;
			
		}
}
