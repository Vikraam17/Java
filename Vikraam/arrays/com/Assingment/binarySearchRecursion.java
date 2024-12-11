package com.Assingment;

public class binarySearchRecursion {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		System.out.println(search(a,0,a.length-1,8));
	}
	public static int search(int[] a, int st, int end, int key) 
	{
            
        int mid = (st + end) / 2;
        if (a[mid] == key) return mid;
        if (key < a[mid]) {
            return search(a, st, mid - 1, key);
        } 
        else if(key >a[mid]) {
            return search(a, mid + 1, end, key);
        }
        return -1;
    }
} 
