package programs2;

public class ReplaceConcicutiveChar {
	public static void main(String[] args) {
		String s="Bossssaaaaaa";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[j]='$';
					break;
				}
			}
		}
		System.out.println(ch);
	}
}
