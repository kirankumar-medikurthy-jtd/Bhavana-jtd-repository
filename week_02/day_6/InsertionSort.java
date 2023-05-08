class InsertionSort
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,9,5,5,7};
		for(int i=1;i<arr;i++)
		{
			int k=arr[i];
			int j=i-1;
			while(j>=0 && arr[i-1]>arr[i])
			{
				arr[j+1]=arr[j];
				j--;			
			}
			arr[j]=k;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
