package Innerclass;
abstract class demo{
	abstract void m2();
}
class outer {

	public static void main(String[] args) {
		int i=10;
		class inner {
			void m1() {
				System.out.println("Inner - method");
			}
		}
		inner j=new inner();
		j.m1();
	}
}
		
//		outer o=new outer();
//		outer.Inner i=o.new Inner();
//		i.m1();
//		demo d=new demo() {
//			void m2() {
//				System.out.println("Demo-M2");
//			}
//		};
//		d.m2();
//		new demo() {
//			void m2() {
//				System.out.println("Demo-m2-2");
//			}
//		}.m2();
//	}
//}
