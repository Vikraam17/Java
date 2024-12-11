package program3;

public class uniqueCharacter {
	public static void main(String[] args) {
		String s="jaavaaamm";
		String res="";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			boolean flag=false;
			if(ch[i]=='\u0000')continue;
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					ch[j]='\u0000';
					flag=true;
				}
			}
			if(flag) {
				ch[i]='\u0000';
			}else {
				res+=ch[i];
			}
		}
		System.out.println(res);
	}
}
