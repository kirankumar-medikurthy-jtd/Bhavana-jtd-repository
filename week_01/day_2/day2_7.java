import java.util.Scanner;
class day2_7
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your number:");
		int n=obj.nextInt();
		String str=""+n;
		int count=0;
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(0) != 0 )
			{
				if(str.contains("0"))
				{
					count++;
				}
				
			}
		}
		System.out.println(count);
		if(count > 0)
		{
			System.out.println("Duck number");
		}
		else
		{
			System.out.println("Not a Duck number");
		}
	}
}
