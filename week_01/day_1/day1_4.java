import java.util.Scanner;
class day1_4
{
	public static void main(String[] args)
	{
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=myObj.nextInt();
		
		String str="" +num;
		int arm=0;
		for(int i=0;i<str.length();i++)
		{
			int newNum=str.charAt(i)-'0';
			arm+=java.lang.Math.pow(newNum,str.length());
		}
		if(num==arm)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not an Armstrong");
		}
		
	}
}
