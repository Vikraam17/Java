package program;

import java.util.Scanner;
class eg
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		//i
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				
				if(i==1 || (j==(n/2)+1) ||i==n )
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
		System.out.println();
		//l
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				
				if(j==1 ||i==n )
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
		// o
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				
				if(i==1 || j==1 ||j==n||i==n)
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
		//v
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n*2;j++)
			{
				if(i==j ||(i+j==(n*2)+1))
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
		//e
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				
				if(i==1 || j==1|| (i==(n/2)+1) ||i==n)
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


		System.out.println();
		//y
		int x=n;
		if(n%2!=0)
		{
			x+=1;
		}
		for(int i=1;i<x;i++)
		{
			for(int j=1;j<=x;j++)
			{
				
				if((i<=x/2) && (i+j==x || i==j )|| (i>x/2 && j==x/2))
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


		// o
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				
				if(i==1 || j==1 ||j==n||i==n)
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

		//u
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				
				if(j==1 ||j==n||i==n)
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
		System.out.println();
		//
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<7;j++)
			{
				if((i==0 && j%3!=0) || (i==1 && j%3==0) || (i-j==2 ) || (i+j==8))
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
