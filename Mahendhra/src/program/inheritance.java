package program;
class AA
{
	void m1() {
		System.out.println("M1()-A");
	}
}
class BB extends AA{
	void m2() {
		System.out.println("M2()-B");
	}
}
public class inheritance {
	public static void main(String[] args) {
		
		BB b=new BB();
		b.m2();
		b.m1();
	}
}
//		inheritance i=new inheritance();
//		i.add();
//		i.add(30,40);
//	}
//	void add()
//	{
//		int a=10;
//		int b=20;
//		System.out.println(a+b);
//	}
//	void add(int i,int j) {
//		System.out.println(i+j);
//	}
