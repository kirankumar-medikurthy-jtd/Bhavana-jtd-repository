import java.util.Scanner;

class day1_5
{
	public static void main(String[] args)
	{
		Scanner myObj=new Scanner(System.in);
		System.out.print("Enter length of the array:");
		int n=myObj.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Array Elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=myObj.nextInt();
		}
		
		System.out.println("Your Array Elements Are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
