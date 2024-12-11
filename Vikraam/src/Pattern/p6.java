package Pattern;

import java.util.Scanner;

public class p6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		for(int i=1;i<=n;i++) {
			int x=i;
			int y=n;
			for(int j=1;j<=m;j++)
			{
				System.out.print(x+" ");
				x+=y;
				y--;
			}
			m--;
			System.out.println();
		}

	}

}
