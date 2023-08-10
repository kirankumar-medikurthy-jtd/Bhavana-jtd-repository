class SortedArrayOrNotRecursion
{
	public static void main(String[] args)
	{
		int[] array = {1,2,3,5,4};
		int size = array.length-1;
		
		sortedArray(array,size,0);
	}
	public static void sortedArray(int[] arr, int size, int i)
	{
		if(arr[i] < arr[i+1])
		{
			if(i ==  size-1)
			{
				System.out.println("This Array is 'Sorted' in Assending order");
				return;
			}
			sortedArray(arr, size, ++i);
		}
		else
		{
			System.out.println("Array is in 'Un Sorted' formet");
			return;
		}	
	}
}
