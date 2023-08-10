/*

nth febonacci using recursion Fibonacci number using recursion.

*/

class nthFebonacciUsingRecursion
{
	public static void main(String[] args)
	{
		int number = 15;
		nthFebonacci(0,1,number,2);
	}
	public static void nthFebonacci(int n1,int n2,int num,int i)
	{
		if(n2>0)
		{
			if(num == 1)
			{
				System.out.println(0);
			}
			if(i == num)
			{
				
				System.out.println(i+" febonacci Number Is : "+n2);
			}
			int n3 = n1+n2;
			n1 = n2;
			n2 = n3;
	
		        nthFebonacci(n1, n2, num, ++i);
		}
		
	}
}
