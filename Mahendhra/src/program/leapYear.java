package program;

import java.util.Scanner;

public class leapYear {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int yr=sc.nextInt();
		if((yr%4==0&&yr%100!=0)||yr%400==0) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a Leap year");
		}
	}
}
