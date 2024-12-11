package constructor;

import java.util.Scanner;

public class demo6 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=9;
		int m=n;
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		int sum=0;
		n=m;
		while(n>0) {
			int j=n%10;
			int prod=1;
			for(int i=1;i<=count;i++) {
				prod*=j;
			}
			sum+=prod;
			n/=10;
		}
		if(m==sum) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not-Armstrong");
		}
		
		
	}
}
