package program4;

public class DuplicateWords {
	public static void main(String[] args) {
		String s="Happy Happy Birthday Birthday";
		String s2="";
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			int len=s2.length()-1;
			if(i>0 && i<s1.length-1 && s2.charAt(len)!=' '){
				s2+=" ";
			}
			if(!s2.contains(s1[i])) {
				s2+=s1[i];
				
			}
		}
		System.out.println(s2);
	}
}
