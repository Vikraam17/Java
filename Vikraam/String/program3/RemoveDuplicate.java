package program3;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String s="jjjaaavvvaaa";
		String s1="";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]=='\u0000')continue;
			for(int j=i+1;j<s.length();j++) 
			{
				if(ch[i]==ch[j]) {
					ch[j]='\u0000';
				}
			}
			s1+=ch[i];
		}
		System.out.println(s1);
	}
}
