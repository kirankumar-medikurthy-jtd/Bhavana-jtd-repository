import java.util.Scanner;

class day2_1
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter Your number:");
		int num=obj.nextInt();
		String str=""+num;
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			int x=str.charAt(i)-'0';
			count+=x;
		}
		System.out.println(count);
	}
}
