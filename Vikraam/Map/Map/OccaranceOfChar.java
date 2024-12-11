package Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class OccaranceOfChar {

	public static void main(String[] args) {
		String s="banana";
		Map<Character,String> m=new LinkedHashMap<Character,String>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!m.containsKey(ch)) {
				m.put(ch, i+"");
			}else {
				String s1=m.get(ch)+","+i;
				m.put(ch, s1);
			}
		}
		Set<Character> set=m.keySet();
		Iterator<Character> i=set.iterator();
		while(i.hasNext()) {
			char key=i.next();
			System.out.println(key+"="+m.get(key));
		}
	}

}
