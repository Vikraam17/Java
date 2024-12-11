package program;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;


public class sort_element {

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
		
//		for(int k=0;k<key.length;k++) {
//			for(int l=0;l<key.length;l++) {
//				if(value[k]>value[l]) {
//					int t1=value[k];
//					value[k]=value[l];
//					value[l]=t1;
//					int t2=key[k];
//					key[k]=key[l];
//					key[l]=t2;
//				}
//			}
//		}
		System.out.println("keys "+Arrays.toString(key));
		System.out.println("value "+Arrays.toString(value));
	}

}
