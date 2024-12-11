package Map;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_1 {

	public static void main(String[] args) {
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		m.put('A',10);
		m.put('C',20);
		m.put('E',30);
		m.put('B',40);
		m.put('J',50);
		System.out.println(m);
		m.put('A', 60);
		System.out.println(m);
	}

}
