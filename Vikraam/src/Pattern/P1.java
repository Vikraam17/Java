package Pattern;

import java.util.Scanner;
public class P1 {
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<sum;j++)
				System.out.print(" ");
			int c1=((i-1)*2)+1;
			for(int j=1;j<=c1;j++)
			{
				System.out.print("*");
			}
			sum--;
			System.out.println();
		}
	}
}
