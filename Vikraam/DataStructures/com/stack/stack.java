package com.stack;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class stack {
		private Object[] a =new Object[10];
		private int count=0;
		
		public int size() {
			return count;
		}
		public void add(Object e) {
			if(count>=a.length) {
				increace();
			}
			a[count++]=e;
		}
		private void increace() {
			Object[] newArr=new Object[a.length*2];
			for(int i=0;i<a.length;i++) {
				newArr[i]=a[i];
			}
			a=newArr;
		}
		public String toString() {
			return Arrays.toString(a);
		}
		public boolean isEmpty() {
			return count==0;
		}
		public Object peek() {
			if(count==0) {
				throw new NoSuchElementException();
			}
			return a[count-1];
		}
		public Object pop() {
			Object last=a[count-1];
			a[count-1]=null;
			count--;
			return last;
		}
}
