import java.util.*;
class SecondSmallestThirdlargestInArray
{
	public static void main(String[] args)
	{
		int[] arr={1,3,5,7,8,9,3};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("second smallest : "+arr[1]);
		System.out.println("Third largest : "+(arr[arr.length-3]));
		
	}
}
