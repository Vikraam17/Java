package programs2; //09/09/2024

public class MaxOccurenceValue {

	public static void main(String[] args) {
		String s="jjjjgaaaavaaavvvv";
		char maxChar=' ';
		int maxCount=0;
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
		System.out.println(maxChar+" = "+maxCount);

	}

}
