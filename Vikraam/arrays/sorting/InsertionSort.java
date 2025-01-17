package sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] a= {1,3,5,9,7,6,8,2,4};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void sort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(a[j]>-1 && key<a[j]) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
}
