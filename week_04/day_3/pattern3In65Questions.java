/*

	Write a program to print below pattern
	* * * * *
	*
	*

*/

import java.util.Scanner;

class pattern3In65Questions
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int row= obj.nextInt();
		
		for(int i=0;i<=Math.ceil(row/2);i++)
		{
			if(i==0)
			{
				for(int j=0;j<row;j++)
				{
					System.out.print("*"+" ");
				}
			}
			else
			{
				for(int j=0;j<1;j++)
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println();
			
		}
	}
}
