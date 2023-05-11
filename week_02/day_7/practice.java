class practice
{

	/*public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5};
		int target=25;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if((Math.pow(arr[i],2)+Math.pow(arr[j],2))==target)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}*/
	
	/*public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5};
		int target=29;
		int i=0;
		while(i>=0)
		{
			for(int j=i;j<arr.length;j++)
			{
				if((Math.pow(arr[i],2)+Math.pow(arr[j],2))==target)
				{
					System.out.println(arr[i]+","+arr[j]);
				}
			}
			
			i=i+1;
		}
	}*/
	
	
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5};
		int target=26;
		int i = 0;
		int j = arr.length - 1;
		while(i < j) {
			int sum = (arr[i]*arr[i]) + (arr[j]*arr[j]);
			if(sum == target){
				System.out.println(arr[i]+" : " + arr[j]);
				break;
			}else if(sum < target) {
				i++;
			}else{
				j--;
			}
		}
		
	}
	
	
	
}
