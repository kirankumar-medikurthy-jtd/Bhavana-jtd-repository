import java.util.Scanner;
class day2_3
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int n=obj.nextInt();
		int[] arr=new int[n];
		System.out.println("enter Array Elements");
		int count=1;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=obj.nextInt();
		}
		System.out.println("Even eliments Sum is:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				count*=arr[i];
			}
		}
		System.out.println(count);
	}
}
