package String;

public class demo6 {
		public static void main(String[] args) {
			String s1="Java";
			String s2="Java";
			String s3=new String(s2);
			System.out.println(s1==s2);
			System.out.println(s1==s3);
			System.out.println(s2==s3);
		}
}
