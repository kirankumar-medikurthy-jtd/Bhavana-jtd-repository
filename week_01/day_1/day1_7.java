import java.util.Scanner;
class day1_7
{
	public static void main(String[] args)
	{
		Scanner myObj=new Scanner(System.in);
		System.out.print("Enter integer value:");
		int n=myObj.nextInt();
		String str=""+n;
		System.out.println("Your String IS:"+str);
		System.out.println("type of the converted data is:"+((Object)str).getClass().getSimpleName());
	}
}


