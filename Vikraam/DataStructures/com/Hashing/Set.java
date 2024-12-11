package com.Hashing;
import java.util.*;
public class Set {
		private Node[] a=new Node[10];
		private int count=0;
		public void add(Object k) {
			int hc=k.hashCode();
			hc=Math.abs(hc);
			int index=hc%a.length;
			if(a[index]==null) {
				a[index]=new Node(k,null);
				count++;
				return;
			}
			Node prev=null;
			Node curr=a[index];;
			while(curr!=null) {
				if(k.equals(curr.key)) {
					return;
				}
				prev=curr;
				curr=curr.next;
			}
			prev.next=new Node(k,null);
			count++;
		}
		public int size() {
			return count;
		}
		public void display() {
			for(int i=0;i<a.length;i++) {
				Node curr=a[i];
				while(curr!=null) {
					System.out.println(curr.key);
					curr=curr.next;
				}
			}
		}
}
