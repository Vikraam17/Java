package com.practice;

interface I1{
	abstract void m2();
}
abstract public class Oops {

	abstract void m1();

}
class a extends Oops implements I1{
	private int n;
	private int m;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}
	@Override
	public void m1() {
		System.out.println("M1-executed");
	}
	@Override
	public void m2() {
		System.out.println("M2-executed");
	}
	public void m2(int i) {
		System.out.println("M2-With One Arguments");
	}
	public void m2(int i,int j) {
		System.out.println("M2-With Two Arguments");
	}
}
