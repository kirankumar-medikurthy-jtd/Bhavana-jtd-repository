class evenNumberSumInAnArrayUsingRecursion
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5,6,7,8};
		evenSum(arr,arr.length,0,0);
	}
	public static void evenSum(int[] arr,int size,int i,int sum)
	{
		if(i==arr.length)
		{
			System.out.println("Sum of all even Numbers in Array : " + sum);
			return;
		}
		else if(i%2==1)
		{
			sum += arr[i];
		}
		evenSum(arr,size,++i,sum);
	}
}
