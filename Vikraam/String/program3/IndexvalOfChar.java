package program3;

public class IndexvalOfChar {

	public static void main(String[] args) {
		String s="jspiders";
		char ch[]=s.toCharArray();
		char c='s';
		int i=indexOfCh(ch,c);
		System.out.println(i);
	}
	public static int indexOfCh(char[] ch,char key) {
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==key)
				return i;
		}
		return -1;
	}

}
