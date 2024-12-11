package program;

import java.util.Scanner;
public class demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int st=sc.nextInt();
		int end=sc.nextInt();
		for(int n=st;n<=end;n++) {
			if((n%4==0&&n%100!=0)||n%400==0) {
				System.out.println(n);
			}
		}
		
	}
}
