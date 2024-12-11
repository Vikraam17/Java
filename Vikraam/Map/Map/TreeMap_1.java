package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_1 {

	public static void main(String[] args) {
		Map<Character,Integer> m=new TreeMap<Character,Integer>();
		m.put('A',10);
		m.put('C',20);
		m.put('E',30);
		m.put('B',40);
		m.put('J',50);
		Set<Entry<Character,Integer>> set=m.entrySet();
		Iterator<Entry<Character,Integer>> i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
