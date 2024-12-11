package program;

import java.util.Arrays;

public class StringMethod {
		public static void main(String[] args) {
			String s="Java Programming";
			
			//toUpperCase()
			System.out.println("s.toUpperCase() : "+s.toUpperCase());
			
			//toLowerCase()
			System.out.println("s.toLowerCase() : "+s.toLowerCase());
			
			//length()
			System.out.println("s.length() : "+s.length());
			
			//startsWith(String)
			System.out.println("s.startsWith() : "+s.startsWith("Ja"));
			
			//endsWith(String)
			System.out.println("s.endsWith() : "+s.endsWith("g"));
			
			//toCharArray()
			char ch[]=s.toCharArray();
			System.out.println("s.toCharArray() : "+Arrays.toString(ch));
			
			//charAt(index)
			System.out.println("s.charAt(index) : "+s.charAt(2));
			
			//indexOf(String)
			System.out.println("s.indexOf(String) : "+s.indexOf("a"));
			
			//lastIndexOf(String)
			System.out.println("s.lastIndexOf(String) : "+s.lastIndexOf("a"));
			
			//substring(start)
			System.out.println("s.substring(Start) : "+s.substring(2));
			
			//substring(Start,end+1)
			System.out.println("s.substring(Start,end+1) : "+s.substring(2,10));
			
			//contains(String)
			System.out.println("s.contains(String) : "+s.contains("a"));
			
			//replace(old,new)
			System.out.println("s.replace(old,new) : "+s.replace("Java","C"));
			
			//trim()
			String s1=" java ";
			System.out.println("s1.trim() : "+s1.trim());
			
			//concat(String)
			System.out.println("s1.concat(String) : "+s1.concat(" is Easy"));
		}
}
