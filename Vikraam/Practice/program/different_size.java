package program;

import java.util.Arrays;

public class different_size {

	public static void main(String[] args) {
		int a[][]=new int[3][];
		a[0]=new int[5];
		a[1]=new int[4];
		a[2]=new int[6];
		for(int[] n:a) {
				System.out.println(Arrays.toString(n));
		}
	}
}