package program3;

public class charFirstLetter {
	public static void main(String[] args) {
		String s="vikraam viswanathan prema";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(ch[0]>='a'&&ch[0]<='z') {
				ch[i]-=32;
				continue;
			}
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==' '&&ch[j]>='a'&&ch[j]<='z') {
					ch[j]-=32;
					break;
				}
			}
		}
		System.out.println(ch);
	}
}
