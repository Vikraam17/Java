package programs2;

public class VowelsCount {
	public static void main(String[] args) {
		String s="java";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.toLowerCase().charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		System.out.println(count);
	}
}
