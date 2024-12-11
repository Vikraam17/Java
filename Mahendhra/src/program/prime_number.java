package program;

import java.util.Scanner;

public class prime_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int j=1;j<=n;j++) {
			boolean res=true;
			if(j<=1)
				res=false;
			else {
				for(int i=2;i<=j/2;i++) {
					if(j%i==0) {
						res=false;
						break;
					}
				}
			}
			if(res) {
				System.out.println(j);
			}
		}
		
	}
}
