
class day2_8
{
	public static void main(String[] args)
	{
		int[] arr={1,2,4,3,5};
		int k=6;
		String ans="";
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==k)
				{
					ans+=i+" "+j+" "+",";
					//ans+=j+" ";
				}
			}
		}	
		System.out.println(ans);
	}
}
