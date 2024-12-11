package programs2; //09/09/2024

public class SecMinOccurence {

	public static void main(String[] args) {
		String s="pppppppjjjjaaaavccaaavvvvaabbb";
		char[] ch=s.toCharArray();
		int minValue=s.length();
		//char minChar=' ';
		int secMinValue=s.length();
		char secMinChar=' ';
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
				//minChar=ch[i];
			}
		}
		ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			int count=1;
			if(ch[i]=='\u0000')continue;
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\u0000';
				}
			}
			if(secMinValue>count && minValue<count) {
				secMinValue=count;
				secMinChar=ch[i];
			}
		}
		System.out.println(secMinChar+" = "+secMinValue);

	}

}
