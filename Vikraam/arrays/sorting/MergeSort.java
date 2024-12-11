package sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] a= {1,3,5,9,7,6,2,4,8};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[] a) 
	{
		if(a.length==1) return;
		int[] left=new int[a.length/2];
		int[] right=new int[a.length-left.length];
//		for(int i=0;i<left.length;i++) {
//			left[i]=a[i];
//		}
//		for(int j=0;j<right.length;j++) {
//			right[j]=a[left.length+j];
//		}
		System.arraycopy(a, 0, left, 0, left.length);
		System.arraycopy(a, left.length, right, 0, right.length);
		sort(left);
		sort(right);
		merge(left,right,a);
	}
	public static void merge(int[] a,int[] b,int[] c) {
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j])
				c[k++]=a[i++];
			else
				c[k++]=b[j++];
		}
		while(i<a.length)
			c[k++]=a[i++];
		while(j<a.length) 
			c[k++]=b[j++];
	}

}
