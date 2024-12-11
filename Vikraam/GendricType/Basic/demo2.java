package Basic;

import java.util.ArrayList;

public class demo2<E> {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Java");
		a1.add("c");
		a1.add("c++");
		String s1=a1.get(0);
				System.out.println(s1);
		String s2=a1.get(1);
				System.out.println(s2);
		String s3=a1.get(2);
				System.out.println(s3);
	}

}
