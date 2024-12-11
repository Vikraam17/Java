package collection;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("java");
		a.add("c");
		a.add(0,"c++");
		a.add("python");
		a.add("react");
		a.add("js");
		System.out.println(a);
		
		a.remove(0);
		System.out.println(a);
		
		ArrayList<String> b=new ArrayList<String>();
		b.add("Viky");
		System.out.println(b);
		
		b.addAll(0,a);
		System.out.println(b);
		
		b.set(0, "vino");
		System.out.println(b);
		
		System.out.println(b.get(3));
		
		System.out.println(b.indexOf("python"));
		System.out.println(a.isEmpty());
		System.out.println(a.contains("react"));
	}

}
