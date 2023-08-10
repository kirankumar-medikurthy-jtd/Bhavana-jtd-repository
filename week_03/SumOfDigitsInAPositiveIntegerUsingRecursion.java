/*

calculate sum of digits in a positive integer in Recursion

*/

class SumOfDigitsInAPositiveIntegerUsingRecursion
{
	public static void main(String[] str)
	{
		int num=1234;
		String number=""+num;
		int res=digitSum(number,0,0);
		System.out.println(res);
	}
	public static int digitSum(String num,int sum,int i)
	{
		if(i==num.length())
		{
			return sum;
		}
		sum=sum+num.charAt(i)-'0';
		return digitSum(num,sum,++i);
		
	}
}
