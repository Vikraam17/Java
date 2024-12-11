package Queue;

import java.util.NoSuchElementException;

public class Queue {
	private Node first;
	private int count;
	
	public int size() {
		return count;
	}
	
	public void add(Object ele) {
		if(first==null) {
			first=new Node(ele,null);
		}
		else {
			Node curr=first;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=new Node(ele,null);
		}
		count++;
	}
	public Object peek() {
		if(first==null) {
			throw new NoSuchElementException();
		}
		return first.ele;
	}
	public Object poll() {
		if(first==null) {
			throw new NoSuchElementException();
		}
		Object ele=first.ele;
		first=first.next;
		count--;
		return ele;
	}
	public void display() {
		Node curr=first;
		while(curr!=null) {
			System.out.println(curr.ele);
			curr=curr.next;
		}
	}
}
