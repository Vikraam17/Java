package com.CompareTo;

public class Account implements Comparable {
	double bal;
	public Account(double b) {
		bal=b;
	}
	@Override
	public int compareTo(Object args) {
		Account a=(Account)args;
		if(bal>a.bal) return 1;
		if(bal<a.bal) return -1;
		return 0;
	}
	@Override
	public String toString() {
		return "Account[bal="+bal+"]";
	}
}
