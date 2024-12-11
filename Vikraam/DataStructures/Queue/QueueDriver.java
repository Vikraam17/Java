package Queue;

public class QueueDriver {
	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);
		q.add(80);
		q.add(90);
		q.display();
		System.out.println("===================");
		System.out.println("peek = "+q.peek());
		System.out.println("poll = "+q.poll());
		System.out.println("peek = "+q.peek());
		System.out.println("poll = "+q.poll());
		System.out.println("peek = "+q.peek());
		System.out.println("poll = "+q.poll());
		System.out.println("peek = "+q.peek());
		System.out.println("poll = "+q.poll());
		System.out.println("====================");
		q.display();
	}
		
}
