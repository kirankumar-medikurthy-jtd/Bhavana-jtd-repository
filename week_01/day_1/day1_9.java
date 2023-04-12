import java.util.Scanner;
class day1_9
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Your Testing input:");
		String str=obj.nextLine();
		String a="qwertyuiopasdfghjklzxcvbnm";
		String n="1234567890";
		String ss="!@#$%^&*()";
		int ac=0;
		int nc=0;
		int ssc=0;
		for(int i=0;i<str.length();i++)
		{
			if(comparing(str.charAt(i),a))
			{
				ac++;
			}
			else if(comparing(str.charAt(i),n))
			{
				nc++;
			}else if(comparing(str.charAt(i),ss))
			{
				ssc++;
			}
		}
		if(ac>0 && nc>0 && ssc>0)
		{
			System.out.println("It is an Alphanumeric String");
		}
		else
		{
			System.out.println("It is not an Alphanumeric String");
		}
	}
	public static boolean comparing(char example,String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(example==str.charAt(i))
			{
				return true;
			}
		}
		return false;
	}
}
