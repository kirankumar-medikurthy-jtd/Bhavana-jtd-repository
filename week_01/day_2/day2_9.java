import java.util.Scanner;
class day2_9
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter your number:");
		int n=obj.nextInt();
		int count=1;
		for(int i=n;i>0;i--)
		{
		 	count *=i;
		}
		System.out.println(n+" Factorial is: "+count);
	}
}
