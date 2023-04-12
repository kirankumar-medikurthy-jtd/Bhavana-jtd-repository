import java.util.HashSet;  
import java.util.Set;  
import java.util.Scanner;
import java.util.Arrays;

class day1_10
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Array Length:");
		int n=obj.nextInt();
		int[] arr=new int[n];
		Set<Integer> set = new HashSet<>();  
		Set<Integer> set1 = new HashSet<>(); 
		System.out.println("Enter Array elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=obj.nextInt();
		}
		System.out.println("even:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				set.add(arr[i]);
			}
		}
		System.out.println(set);
		System.out.println("odd:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==1)
			{
				set1.add(arr[i]);
			}
		}
		System.out.println(set1);
		System.out.println("List of array eliments:"+set+""+set1);
		
	}
}
