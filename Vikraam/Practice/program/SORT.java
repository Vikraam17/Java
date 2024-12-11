package program;

import java.util.Arrays;

public class SORT {
	public static void main(String[] args) {
		int []n= {6,6,2,4,5,7,1,1,1,1,2,3,5};
		sort(n);
		System.out.println(Arrays.toString(n));
		//System.out.println(Arrays.toString(sortnum(n)));
	}
	public static void sort(int[] n) {
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n.length-1-i;j++) {
				if(n[j]>n[j+1]) {
					int temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
		}
	}
	public static int[] sortnum(int[] a) {
		int []n=new int[a.length];
		int []b=new int[a.length];
		int k=0;
		int m=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i+1;j<a.length-i;j++) {
				if(a[i]==a[j]){
					count++;
					n[k]=a[i];
					k++;
				}
			}
			if(count>0) {
				n[k]=a[i];
				k++;
			}
			else if((i!=0&&a[i-1]!=a[i])||i==0){
				b[m]=a[i];
				m++;
			}
		}
		System.out.println(Arrays.toString(n));
		System.out.println(Arrays.toString(b));
		int i=0;
		while(k<a.length) {
			n[k]=b[i++];
			k++;
		}
		return n;
	}
}
