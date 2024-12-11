package programs2;

public class SecMaxOccurenceValue {

	public static void main(String[] args) {
		String s="jjjjgaaaavaaavvvvaagggggggggggkkkkkkkrrrrrrrrrrrrrrr";
		char maxChar=' ';
		int maxCount=0;
		int secMax=0;
		char SecMaxChar=' ';
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			int count=1;
			if(ch[i]=='\u0000')continue;
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\u0000';
				}
			}
			if(count>maxCount) {
				maxCount=count;
				maxChar=ch[i];
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
			if(count>secMax && count<maxCount) {
				secMax=count;
				SecMaxChar=ch[i];
			}
			
		}
		System.out.println(maxChar+" = "+maxCount);
		System.out.println(SecMaxChar+" = "+secMax);

	}

}
