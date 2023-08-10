class ReversingArrayElementsUsingRecursion
{
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4,5};
		reverseArray(array, array.length-1, "");
	}
	public static void reverseArray(int[] arr, int size, String container)
	{
		if((size+1) == 0)
		{
			System.out.println("Reverse Array Is : " + "[" + container + "]");
			return;
		}
	
		container += arr[size] + " ";
		reverseArray(arr, --size, container);
		return;	
	}
}
