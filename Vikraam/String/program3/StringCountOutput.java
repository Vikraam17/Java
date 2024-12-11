package program3;

public class StringCountOutput {

	public static void main(String[] args) {
		String s="Hello world";
		String s1="";
		char[] ch=s.toCharArray();
		char[] res=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			boolean flag=false;
			char count='1';
			if(ch[i]>='0'&&ch[i]<='9')continue;
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					ch[j]=++count;
					flag=true;
				}
			}
			if(flag) {
				ch[i]='1';
			}
			
		}
		System.out.println(ch);
	}
}
