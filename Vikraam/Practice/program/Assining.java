package program;

public class Assining {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		for(int[] n:a) {
			for(int m:n) {
				System.out.print(m+"\t");
			}
			System.out.println();
			System.out.println();
		}
	}
}
