import java.util.Scanner;  // Import the Scanner class

class day1_3
{
	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter Number:");
		int num = myObj.nextInt();              // Read user input
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		//System.out.println(count);
		if(count==2)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
	}
}
