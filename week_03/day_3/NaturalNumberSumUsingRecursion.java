class NaturalNumberSumUsingRecursion
{
	public static void main(String[] args)
	{
		naturalNumberSum(5,1,0);
	}
	public static void naturalNumberSum(int num,int i,int sum)
	{
		if(i==num+1)
		{
			System.out.println("The sum of natural Numbers upto " + num + " Is : " + sum);
			return;
		}
		sum+=i;
		naturalNumberSum(num,++i,sum);
	}
}
