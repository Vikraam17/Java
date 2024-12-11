package programs;

public class AddNumbers2 {

	public static void main(String[] args) {
		String s1="ab12cd34";
		char[] ch = s1.toCharArray();
		int sum=0;
		int n=0;
		int i=0;
		while(i<ch.length) {
			while(i<ch.length&&(ch[i]>='0'&&ch[i]<='9')) {
				n=(n*10)+(ch[i]-'0');
				i++;
			}
			sum+=n;
			i++;
			n=0;
		}
		System.out.println(sum); //12+34=46

	}

}
