package com.jsp.Overridding;

class vikraamFather{
	public void marry(){
		System.out.println("marry with dheepa");
	}
}
class vikraam extends vikraamFather{
	public void marry(){
		System.out.println("I will marry dheepa");
	}
}
public class test_1 {

	public static void main(String[] args) {
		vikraamFather v=new vikraamFather();
		v.marry();
		vikraam v1=new vikraam();
		v1.marry();
		vikraamFather v2= new vikraam();
		v2.marry();

	}

}
