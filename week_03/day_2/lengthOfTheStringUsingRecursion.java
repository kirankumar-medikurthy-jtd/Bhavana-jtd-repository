class lengthOfTheStringUsingRecursion
{
	public static void main(String[] args)
	{
		stringLength("abcd",0,0);
	}
	public static void stringLength(String str,int count,int i)
	{
		if(i == str.length())
		{
			System.out.println("The Length Of The String is : "+count);
			return;
		}
		else if(str.charAt(i) == str.charAt(i))
		{
			count = count+1;
			stringLength(str, count, ++i);
		}
	}
}
