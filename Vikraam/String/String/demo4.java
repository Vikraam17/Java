package String;

public class demo4 {

	public static void main(String[] args) {
		String s1=new String("ja");
		String s2=new String("va");
		String s3=s1+s2;
		String s4=new String("java");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}

}
