import java.util.Scanner;
class day2_5
{
	//public static int count=0;
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Array size:");
		int num=obj.nextInt();
		int[] arr=new int[num];
		int count=0;
		System.out.println("Enter Array Elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=obj.nextInt();
		}
		System.out.println("target indises:");
	 	/*for(int i=0;i<arr.length;i++)
	 	{
	 		for(int j=0;j<arr.length;j++)
	 		{
	 			if(arr[i]==arr[j])
	 			{
	 				count++;
	 			}
	 		}
	 	}
	 	
	 	System.out.println(count-(arr.length));*/
	 	
	 	
		int target=4;
		int n1=arr.length;
		int num2=0;
		int num1=0;
		
		for(int i=0;i<n1;i++)
		{
		   for(int j=0;j<n1;j++)
		   {
		      if(arr[i]+arr[j]==target)
		      {
		          num2=i;
		          num1=j;
		      } 
		   }
	       }
		System.out.println(num2);
	       System.out.println(num1);
	 	
	}
}
