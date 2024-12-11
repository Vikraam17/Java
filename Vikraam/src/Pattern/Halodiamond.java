package Pattern;

import java.util.Scanner;
public class Halodiamond
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<sum;j++)
				System.out.print(" ");

			int flag=((i-1)*2)+1;
			for(int j=1;j<=flag;j++)
			{
				if(j==1||j==flag)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			sum--;

			System.out.println();
		}
		int flag=((n-1)*2)+1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			flag-=2;
			for(int j=1;j<=flag;j++)
			{
				if(j==1||j==flag)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}

