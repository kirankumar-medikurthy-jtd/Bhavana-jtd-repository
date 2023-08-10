/*

Problem 3: Check if a string is a
palindrome using recursion.

*/

class PolindromeOrNotInRecursion 
{
	public static void main(String[] args)
	{
		       String str="mams";
		       String reverse=polindrome(str,"",str.length()-1);
		
		
			if(str.equals(reverse))
			{
				System.out.println("Polindrome");
			}
			else
			{
				System.out.println("Not A Polindrome");
			}
		
	}
	public static String polindrome(String str,String newStr,int i)
	{
		if(i<0)
		{
			
			return newStr;
		}
		newStr+=str.charAt(i);
		return polindrome(str,newStr,--i);
	}
}
