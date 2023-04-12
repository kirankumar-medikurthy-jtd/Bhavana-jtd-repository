import java.util.Scanner;
class day1_8
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Your String:");
		String str=obj.nextLine();
		String newStr="";
		for(int i=str.length()-1;i>=0;i--)
		{
			newStr+=str.charAt(i);
		}
		System.out.println("Your reverse String is:"+newStr);
	}
}
