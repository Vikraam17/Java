package program;

import java.util.Scanner;

public class findTheIndexOfNum {
	public static void main(String[] args) {
		int []arr= {1,3,5,6};
		Scanner sc=new Scanner(System.in);
		int target=sc.nextInt();
		int index=findIndex(arr,target);
		System.out.println(index);
	}
	public static int findIndex(int[] a,int t) {
//		int j=0;
//		for(int i=0;i<a.length;i++) {
//			if(a[i]==t)return i;
//			
//			else if(a[i]>t)return i;
//			
//			else if(i==a.length-1)return i+1;
//		}
//		return j;
		int low=0,high=a.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(a[mid]==t)return mid;
			else if(a[mid]<t) {
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return low;
	}
}
