package collection;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class test3 {

	public static void main(String[] args) {
		List<Integer> a=Arrays.asList(10,20,30,40,50,60,70,80);
		ListIterator<Integer> l=a.listIterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		System.out.println("------------------------");
		while(l.hasPrevious()) {
			System.out.println(l.previous());
		}
	}

}
