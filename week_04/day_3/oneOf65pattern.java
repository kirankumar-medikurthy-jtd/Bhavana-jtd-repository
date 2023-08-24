/*

Patterns
* * * *
* *
* *
* * * *

*/

import java.util.Scanner;

class oneOf65pattern
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter number of rows here : " );
		int n=obj.nextInt();
		
		//System.out.println(n);
		
		for(int i=0;i<n;i++)
		{
			if(i==0 || i==n-1)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print("*"+" ");
				}
			}
			else
			{
				for(int j=0;j<2;j++)
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
		
		
	}
}


