package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {

	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(7);
		a.add(6);
		a.add(9);
		a.add(8);
		Iterator<Integer> i=a.iterator();
		while(i.hasNext()) {
			int n=i.next();
			if(n%2==0) {
				i.remove();
			}
		}
		System.out.println(a);
	}

}
