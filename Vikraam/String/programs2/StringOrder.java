package programs2;

public class StringOrder {
		public static void main(String[] args) {
			String s="jsp123@#!OSN";
			String lw="";
			String up="";
			String nc="";
			String sp="";
			char ch[]=s.toCharArray();
			for(int i=0;i<s.length();i++) {
				if(ch[i]>='a'&&ch[i]<='z')lw+=ch[i];
				else if(ch[i]>='A'&&ch[i]<='Z')up+=ch[i];
				else if(ch[i]>='0'&&ch[i]<='9')nc+=ch[i];
				else sp+=ch[i];
			}
			s=lw+up+nc+sp;
			System.out.println(s);
		}
}
