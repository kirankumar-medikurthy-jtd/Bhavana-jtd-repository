class factorialOfPositiveNumbers
{
	public static void main(String[] args)
	{
		int num=5;
		int res=factorial(num);
		System.out.println(res);
	}
	public static int factorial(int num)
	{
		if(num==0)
		{
			return 1;
		}
		return num*factorial(num-1);
	}
}
