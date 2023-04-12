/*
    str1.toCharArray() - converts the string into a char array
    Arrays.sort() - sorts both the char arrays
    Arrays.equal() - checks if the sorted char array are equal
*/

import java.util.Scanner;
class day2_10
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Your Firts String:");
		String str1=obj.nextLine();
		
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter Your Second String:");
		String str2=obj.nextLine();
		
		//System.out.println(Str2);
		int count=0;
		
		if(str1.length()==str2.length())
		{
			for(int i=0;i<str1.length();i++)
			{
				for(int j=0;j<str2.length();j++)
				{
					if(str1.charAt(i)==str2.charAt(j))
					{
						count++;
					}
				}	
			}
			//System.out.println(count);
			if(count>=str1.length())
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not An Anagram");
			}
		}
		
	}
}
