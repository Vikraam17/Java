package programs2;

public class StringCount {
		public static void main(String[] args) {
			String s="jsp123@#!OSN";
			int lw=0;
			int up=0;
			int nc=0;
			int sp=0;
			char ch[]=s.toCharArray();
			for(int i=0;i<s.length();i++) {
				if(ch[i]>='a'&&ch[i]<='z')lw++;
				else if(ch[i]>='A'&&ch[i]<='Z')up++;
				else if(ch[i]>='0'&&ch[i]<='9')nc++;
				else sp++;
			}
			System.out.println("Lower case = "+lw);
			System.out.println("Upper case = "+up);
			System.out.println("Number = "+nc);
			System.out.println("Special character = "+sp);
		}
}
