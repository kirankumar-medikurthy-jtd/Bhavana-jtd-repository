import java.util.Scanner;
class day1_6
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
		
		int prd=1;
		//System.out.println("Product of total Array Elements:"+prd);
		for(int i=0;i<arr.length;i++)
		{
			prd*=arr[i];
		}
		System.out.println("Product of total Array Elements:"+ prd);
	}
}
