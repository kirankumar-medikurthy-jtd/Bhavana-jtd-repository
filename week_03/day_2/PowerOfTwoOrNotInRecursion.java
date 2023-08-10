class PowerOfTwoOrNotInRecursion
{
	public static void main(String[] args)
	{
		int base=2;
		int power=5;
		powerOfANumber(base,power,1,1);
	}
	public static void powerOfANumber(int base, int power, int i, int product)
	{
		if(i > power)
		{
			System.out.println(product);
			return;
		}
		else
		{
			product *= base;
			powerOfANumber(base, power, ++i, product);
			return;
		}
	}
}
