package com.Interview;

import java.util.Scanner;

public class Num_to_string {
	public static void pw(int n,String s) {
		String[] one= {" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven",
						"Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eightteen","Nineteen"};
		
		String[] two= {" "," ","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eigthty","Ninety"};
		if(n<=19) {
			System.out.print(one[n]+" ");
		}
		else {
			System.out.print(two[n/10]+" "+one[n%10]+" ");
		}
		if(n!=0) {
			System.out.print(s);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		pw(n/10000000,"crore ");
		pw((n/100000)%100,"Lakhs ");
		pw((n/1000)%100,"Thousand ");
		pw((n/100)%10,"Hundradand ");
		pw(n%100,"");
	}
}
