import java.util.Scanner;
class day2_4
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
		if(str.equals(newStr))
		{
			System.out.println("Polindromic String");
		}
		else
		{
			System.out.println("Not an polindromic String");
		}
	}
}
