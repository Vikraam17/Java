package program;

import java.util.Scanner;

public class ArrayProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key=sc.nextInt();
		int []arr= {1,2,3,4,5,10,6,7,8,9};
		boolean b=true;
		int n=arr.length/2;
		for(int i=0;i<n;i++) {
			int m=arr[i]+arr[arr.length-1-i];
			if(m%key!=0) {
				b=false;
				break;
			}
		}
		System.out.println(b);
	}
}
