package com.abstraction1;
import java.util.Scanner;
interface payable{
	void pay();
}
class UPI implements payable{

	@Override
	public void pay() {
		System.out.println("Paid by UPI");
		
	}
	
}
class Creditcard implements  payable{
	@Override
	public void pay() {
		System.out.println("Paid by Credit Card");
	}
}
class Debitcard implements payable{
	@Override
	public void pay() {
		System.out.println("paid by Debit card");
	}
}
class Factory{
	public static payable getInstance() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		System.out.println("1.UPI\n2.Credit Card\n3.Debit Card");
		int n=sc.nextInt();
		if(n==1) {
			return new UPI();
		}
		else if(n==2) {
			return new Creditcard();
		}
		else if(n==3) {
			return new Debitcard();
		}
		return null;
	}
}
public class demo {
	public static void main(String[] args) {
		payable p=Factory.getInstance();
		p.pay();
	}
}
