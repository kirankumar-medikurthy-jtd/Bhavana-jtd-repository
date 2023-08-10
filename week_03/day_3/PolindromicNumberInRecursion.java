class PolindromicNumberInRecursion 
{
	public static void main(String[] args)
	{
			int num=122;
		       String str=""+num;
		       String reverse=polindrome(str,"",str.length()-1);
		
		
			if(str.equals(reverse))
			{
				System.out.println("Polindromic Number");
			}
			else
			{
				System.out.println("Not A Polindromic Number");
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
