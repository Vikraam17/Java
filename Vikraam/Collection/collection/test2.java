package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class test2 {

	public static void main(String[] args) {
		Set<String> a=new LinkedHashSet<String>();
		a.add("Viky");
		a.add("vino");
		a.add("susu");
		a.add("ram");
		Iterator<String> i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(a);
	}

}
