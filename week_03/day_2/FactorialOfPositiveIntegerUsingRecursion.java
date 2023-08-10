/*

find the factorial of positive integerusing recursion

*/

class FactorialOfPositiveIntegerUsingRecursion
{
	public static void main(String[] str)
	{
		int num=0;
		int res=factorial(num,1,1);
		System.out.println(num+" Factorial Number Is : "+res);
	}
	public static int factorial(int num,int i,int fact)
	{
		if(i==num+1)
		{
			return fact;
		}
		fact *= i;
		return factorial(num,++i,fact);
	}
}
