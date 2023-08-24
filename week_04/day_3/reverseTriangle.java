/*

	Write a program to print below pattern
	* * * *
	* * *
	* *
	*
*/

import java.util.Scanner;

class reverseTriangle
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		
		System.out.print("Enter number of rows Here : ");
		
		int n=obj.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
