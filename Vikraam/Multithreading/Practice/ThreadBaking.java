package Practice;
//class Cake extends Thread{
//	public void run() {
//		System.out.println("Mixing Ingredients for cake "+Cake.currentThread().getId());
//		System.out.println("Baking Cake "+Cake.currentThread().getId());
//		System.out.println("Decorating Cake "+Cake.currentThread().getId());
//	}
//}
class Cake implements Runnable{
	public void run() {
		System.out.println("Mixing Ingredients for cake "+Thread.currentThread().getId());
		System.out.println("Baking Cake "+Thread.currentThread().getId());
		System.out.println("Decorating Cake "+Thread.currentThread().getId());
	}
}
public class ThreadBaking {
	public static void main(String[] args) {
		int n=4;
		
		for(int i=0;i<n;i++) {
			Cake c=new Cake();
			Thread thread=new Thread(c);
			thread.start();
		}
	}
	
	
}
