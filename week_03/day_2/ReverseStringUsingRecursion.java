class ReverseStringUsingRecursion
{
	public static void main(String[] args)
	{
		String str="Bhavana";
		reverseString(str,str.length()-1,"",7);
	}
	public static void reverseString(String str,int i,String bag,int size)
	{
		if(i<0)
		{
			System.out.println("Reverse String : "+bag);
			return;
		}
		bag+=str.charAt(i);
		reverseString(str,--i,bag,size);
	}
}
