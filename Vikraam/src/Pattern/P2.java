package Pattern;

import java.util.Scanner;
public class P2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||i==j||i==n)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");

				}			
			}
			System.out.println();
		}	
	}
}
