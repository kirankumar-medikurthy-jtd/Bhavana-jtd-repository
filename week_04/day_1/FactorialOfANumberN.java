class FactorialOfANumberN
{

public static void main(String[] args) {
        int range = 10;
        int n1 = 0;
        int n2 = 1;
        int sum = 0;
        int findfactorialNumber=3;

       for(int i=0;i<=n2;i++)
       {
        	if(n1 == findfactorialNumber)
        	{
        		System.out.println(i);
        	}
        	//System.out.println(n1);
        	sum = n1 + n2;
            	n1 = n2;
            	n2 = sum;
   
        }

      
    }
}
