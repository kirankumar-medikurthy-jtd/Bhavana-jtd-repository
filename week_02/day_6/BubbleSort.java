class BubbleSort
{

	public static void main(String[] args)
	{
		int[] arr={9,2,7,5,1};
		int n=arr.length;
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
			
	}

}
