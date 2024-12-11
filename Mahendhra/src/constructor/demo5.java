package constructor;

import java.util.Arrays;

public class demo5 {
	public static void main(String[] args) {
		
		String s1=new String("Hello world");
		String s2=s1.concat(" By ECE");
		String s4=new String("Hello world");
		System.out.println(s2);
//		s.reverse();
//		System.out.println(s);
		String d="a";
		String d1="b";
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.substring(0));
		System.out.println(s1.substring(0,5));
		System.out.println(s1.substring(5));
		System.out.println(s1.charAt(0));
		char[] s3=s1.toCharArray();
		System.out.println(Arrays.toString(s3));
		System.out.println(s1.indexOf('l'));
		System.out.println(s1.replace("world", "ECE"));
		System.out.println(s1.lastIndexOf('l'));
		System.out.println(s1.equals(s4));
		System.out.println(d.compareTo(d1));
		System.out.println(s1.compareTo(s4));
		System.out.println(d1.compareTo(d));
		
	}
}
