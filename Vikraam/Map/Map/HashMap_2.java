package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_2 {

	public static void main(String[] args) {
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		m.put('A',10);
		m.put('C',20);
		m.put('E',30);
		m.put('B',40);
		m.put('J',50);
		System.out.println(m.containsKey('A')); //return boolean value
		System.out.println(m.containsValue(10)); //return boolean value
		Set<Character> s=m.keySet();
		Iterator<Character> i=s.iterator();
		while(i.hasNext()) {
			char ch=i.next();
			System.out.println(ch+"="+m.get(ch));
		}
	}

}
