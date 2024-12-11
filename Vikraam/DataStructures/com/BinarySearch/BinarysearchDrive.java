package com.BinarySearch;

public class BinarysearchDrive {
	public static void main(String[] args) {
		BinarySearchTree t=new BinarySearchTree();
		t.add(10);
		t.add(50);
		t.add(40);
		t.add(30);
		t.add(20);
		t.add(60);
		t.add(70);
		System.out.println(t.add(70));
		System.out.println(t.add(50));
		System.out.println(t.add(80));
		System.out.println(t.size());
		t.LevelOrder();
		t.postOrder();
		t.preOrder();
		t.inOrder();
		System.out.println(t.first());
		System.out.println(t.last());
		t.remove(20);
		t.remove(80);
		t.remove(10);
		t.inOrder();
	}
}
