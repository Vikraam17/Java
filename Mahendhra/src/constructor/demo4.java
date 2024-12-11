package constructor;

import java.util.Arrays;
import java.util.Scanner;
 
public class demo4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of string you want : ");
		int n=sc.nextInt();
		int m=2;
		int k=1;
		int s[][]=new int[m][n];
		for(int j=0;j<n;j++) {
			 for(int i=0;i<m;i++){
				s[i][j]=k;
				k++;
			}
		}
		for(int x[]:s) {
			System.out.println(Arrays.toString(x));
		}
		
	}
}
