import java.util.Scanner;

class day2_2
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter Your number:");
		int num=obj.nextInt();
		String b="";
		while(num>0)
		{
			int r=num%2;
			b=r+b;
			num=num/2;
		}
		System.out.println(b);
	}
}
