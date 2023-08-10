class MaxNumberInAnArrayUsingRecursion
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,9,5,12};
		maxInArray(arr,0,0);
	}
	public static void maxInArray(int[] arr, int i, int max)
	{
		if(i==arr.length)
		{
			System.out.println("Maximum element in an array is : " + max);
			return;
		}
		else if(max<arr[i])
		{
			max=arr[i];
		}
		maxInArray(arr,++i,max);
	}
}
