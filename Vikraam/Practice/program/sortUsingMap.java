package program;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;


public class sortUsingMap {

	public static void main(String[] args) {
		int []a= {6,6,2,4,5,7,1,1,1,1,2,3,5};
		Map<Integer,Integer> m=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++) {
			m.put(a[i],m.getOrDefault(a[i],0)+1);
		}
		System.out.println(m); 
		int key[]=new int[m.size()];
		int value[]=new int[m.size()];
		int i=0;
		int j=0;
		for(Map.Entry<Integer,Integer> mm: m.entrySet()) {
			if(i<m.size() && j<m.size()) {
			 key[i++]=mm.getKey();
			 value[j++]=mm.getValue();
			}
		}
		System.out.println(Arrays.toString(key));
		System.out.println(Arrays.toString(value));

		for(int k=0;k<key.length;k++) {
			for(int l=0;l<key.length-1-k;l++) {
				if(value[l]<value[l+1]) {
					int t1=value[l];
					value[l]=value[l+1];
					value[l+1]=t1;
					int t2=key[l];
					key[l]=key[l+1];
					key[l+1]=t2;
				}
			}
		}
		System.out.println("keys "+Arrays.toString(key));
		System.out.println("values "+Arrays.toString(value));
		int q=0;
		for(int k=0;k<key.length;k++) {
			while(value[k]>0) {
				a[q]=key[k];
				q++;
				value[k]--;
			}
		}
		System.out.println("Sorted array " + Arrays.toString(a));
	}

}
