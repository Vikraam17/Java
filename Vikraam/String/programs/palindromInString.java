package programs;

public class palindromInString {

	public static void main(String[] args) {
		String s="banana";
		//int count=0;
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				if(isPalindrom(s,i,j)) {
					System.out.println(s.substring(i, j+1));
				}
			}
		}

	}
	public static boolean isPalindrom(String s,int st,int end) {
		char[] c=s.toCharArray();
		int i=st;
		int j=end;
		while(i<j) {
			if(c[i]!=c[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
