package constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class demo3 {
	public static void main(String[] args) {
		List<Integer> a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		ListIterator<Integer> l=a.listIterator();
		
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		System.out.println("================");
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}
	}
}
