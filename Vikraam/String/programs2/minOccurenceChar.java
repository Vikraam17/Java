package programs2; //09/09/2024

public class minOccurenceChar {

	public static void main(String[] args) {
		String s="pppppppjjjjaaaavaaavvvvaa";
		char[] ch=s.toCharArray();
		int minValue=s.length();
		char minChar=' ';
		for(int i=0;i<s.length();i++) {
			int count=1;
			if(ch[i]=='\u0000')continue;
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\u0000';
				}
			}
			if(count<minValue) {
				minValue=count;
				minChar=ch[i];
			}
		}
		System.out.println(minChar+" = "+minValue);

	}

}
