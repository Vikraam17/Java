package com.BinarySearch;

public class Node {
		int key;
		Node left=null;
		Node right=null;
		public Node(int k) {
			key=k;
		}
		public Node(int k,Node l,Node r) {
			key=k;
			left=l;
			right=r;
		}
}
