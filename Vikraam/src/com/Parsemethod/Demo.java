package com.Parsemethod;

public class Demo {

	public static void main(String[] args) {
		String i="10";
		String j="12.55";
		String k="true";
		byte e=Byte.parseByte(i);
		int a=Integer.parseInt(i);
		short s=Short.parseShort(i);
		long l=Long.parseLong(i);
		double b=Double.parseDouble(j);
		boolean c=Boolean.parseBoolean(k);
		float f=Float.parseFloat(j);
		System.out.println(a);
		System.out.println(e);
		System.out.println(s);
		System.out.println(l);
		System.out.println(f);
		System.out.println(b);
		System.out.println(c);
	}

}
