class GCDusingRecursion
{
	public static void main(String[] args)
	{
		GCD(10,120,0,1);
	}
	public static void GCD(int n1,int n2,int ans,int i)
	{
		
		/*int ans=0;
		for(int i=1;i<n1+n2;i++)
		{
			
			if(n1%i==0 && n2%i==0)
			{
				ans=i;
			}
		}
		System.out.println(ans);*/
		
		//Recursion..
		
		if(i<(n1+n2))
		{
			if(n1%i == 0 && n2%i == 0)
			{
				ans=i;
			}
			GCD(n1,n2,ans,++i);
			return;
		}
		System.out.println(ans);
		
		
		
	}
}
