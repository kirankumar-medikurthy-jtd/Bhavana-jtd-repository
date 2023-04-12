import java.util.Scanner;  // Import the Scanner class

class day1_1
{
	public static void main(String[] args) 
	{
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter Number:");
		int num = myObj.nextInt();              // Read user input
		if(num%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}
}
