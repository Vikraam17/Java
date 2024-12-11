package programs;

public class AddNumbers {
		public static void main(String[] args) {
			String s1="ab12cd345";
			int sum=0;
			char ch[]=s1.toCharArray();
			for(char s:ch) {
				if(s>='0' && s<='9') {
					sum+=(s-'0');
				}
			}
			System.out.println(sum);
		}
}
