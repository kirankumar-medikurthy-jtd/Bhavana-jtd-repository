import java.util.*;
class mock1
{
	public static void main(String[]  args)
	{
	
	
		//......1.Accurance
	
		/*int[] arr={1,2,1,2,3,3,5};
		int[] res=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			res[arr[i]]+=1;
		}
		for(int i=0;i<res.length;i++)
		{
			if(res[i]>0)
			{
				System.out.println(i+":"+res[i]);
			}
		}*/
		
		
		
		//.............2.substrings
		
		
		/*String str="Bhavana";

		for(int i=0;i<str.length();i++)
		{
			String str1="";
			for(int j=i;j<str.length();j++)
			{
				str1+=str.charAt(j);
				System.out.println(str1);
			}
			
		}*/
		
		
		//...........3.polindromic String
		
		/*String str="bhavana";
		
		String str1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			str1+=str.charAt(i);
		}
		System.out.println(str1);*/
		
		
		
		//...........4.reversing a number without converting into String 
		
		
		/*int num=1222;
		int store=0;
		
		while(num>0)
		{
			int r=num%10;
			store=(store*10)+r;
			num=num/10;
		}
		System.out.println(store);*/
		
		
		//...........5.factorial Number
		
		/*int n1=0;
		int n2=1;
		int range=21;
		
		int n3;
		
		while(n1<=range)
		{
		   System.out.println(n1);
		    n3=n1+n2;
		    n1=n2;
		    n2=n3;
		}
		*/
		
		
		//............6.Amstrong
		
		/*int num=154;
		String str=""+num;
		int n=str.length();
		int store=0;
		for(int i=0;i<str.length();i++)
		{
			int c=str.charAt(i)-'0';
			
			store+=java.lang.Math.pow(c,n);
		}
		//System.out.println(store);
		if(num == store)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not an Armstong");
		}
		*/
		
		
		//..........7.Anagram
		
		
		
		/*String str="state";
		String str1="taste";
		
		int count=0;
		char[] str3=str1.toCharArray();
  		char[] str4=str.toCharArray();
  		
  		Arrays.sort(str3);
  		Arrays.sort(str4);
  		
  		if(Arrays.equals(str3,str4))
  		{
  			System.out.println("Anagram");
  		}
  		else
  		{
  			System.out.println("Not an Anagram");
  		}*/
  		
  		
	}
}
