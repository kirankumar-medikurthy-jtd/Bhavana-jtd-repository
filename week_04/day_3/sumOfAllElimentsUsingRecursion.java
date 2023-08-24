class sumOfAllElimentsUsingRecursion 
{
	public static void main(String[] args)
	{
		int[] x={1,2,3,4,5};
		arraySum(x,0,5,0);
	}
	public static void arraySum(int[] a,int i,int size,int sum)
	{
		if(i==size)
		{
			System.out.println("Total Sum of Array Elements: "+sum);
			return;
		}
		sum+=a[i];
		arraySum(a,++i,size,sum);
	}   
}
