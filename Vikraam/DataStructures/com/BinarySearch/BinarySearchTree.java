package com.BinarySearch;

import java.util.*;

public class BinarySearchTree {
		private Node root=null;
		private int count=0;
		private boolean flag;
		public boolean add(int k) {
			flag=true;
			root=addNode(root,k);
			return flag;
		}
		public Node addNode(Node n,int k) {
			if(n==null) {
			n=new Node(k);
			count++;
			return n;
			}
			if(k<n.key) {
				n.left=addNode(n.left,k);
			}
			else if(k>n.key) {
				n.right=addNode(n.right,k);
			}
			else {
				flag=false;
			}
			return n;
		}
		public int size() {
			return count;
		}
		public void LevelOrder() {
			Queue<Node> q=new LinkedList<Node>();
			if(root!=null) q.add(root);
			while(!q.isEmpty()) {
				Node n=q.poll();
				System.out.print(n.key+" ");
				if(n.left!=null)q.add(n.left);
				if(n.right!=null)q.add(n.right);
			}
			System.out.println();
		}
		public void postOrder() {
			postOrder(root);
			System.out.println();
		}
		private void postOrder(Node n) {
			if(n==null)return;
			postOrder(n.left);
			postOrder(n.right);
			System.out.print(n.key+" ");
		}
		public void preOrder() {
			preOrder(root);
			System.out.println();
		}
		private void preOrder(Node n) {
			if(n==null) return;
			System.out.print(n.key+" ");
			preOrder(n.left);
			preOrder(n.right);
		}
		public void inOrder() {
			inOrder(root);
			System.out.println();
		}
		private void inOrder(Node n) {
			if(n==null) return;
			inOrder(n.left);
			System.out.print(n.key+" ");
			inOrder(n.right);
		}
		public int first() {
			Node n=minNode(root);
			return n.key;
		}
		private Node minNode(Node n) {
			if(n.left==null) return n;
			return minNode(n.left);
		}
		public int last() {
			Node n=MaxNode(root);
			return n.key;
		}
		private Node MaxNode(Node n) {
			if(n.right==null) return n;
			return MaxNode(n.right);
		}
		public void remove(int k) {
			root=removeNode(root,k);
		}
		private Node removeNode(Node n, int k) {
			if(n==null) {
				return null;
			}
			if(k<n.key) {
				n.left=removeNode(n.left,k);
			}
			else if(k>n.key) {
				n.right=removeNode(n.right,k);
			}
			else {
				if(n.left==null && n.right==null) {
					n=null;
				}
				else if(n.right ==null) {
					n=n.left;
				}
				else if(n.left ==null) {
					n=n.right;
				}
				else
				{
					Node minNode=getMinNode(n.right);
					int temp=n.key;
					n.key=minNode.key;
					minNode.key=temp;
					n.right=removeNode(n.right,k);
				}
			}
			return n;
			
		}
		Node getMinNode(Node n) {
			if(n.left==null)return n;
			return getMinNode(n.left);
		}
}
