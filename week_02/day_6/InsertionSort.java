class InsertionSort
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,9,5,5,7};
		int n=arr.length;
		for(int i=1;i<arr.length;i++)
		{
			int k=arr[i];
			int j=i-1;
			while(j>=0 && arr[i-1]>arr[i])
			{
				arr[j+1]=arr[j];
				j--;			
			}
			arr[j+1]=k;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
