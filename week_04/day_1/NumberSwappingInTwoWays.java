public class NumberSwappingInTwoWays 
{
    public static void main(String[] args) 
    {
    
    	int number1=2;
    	int number2=8;
    	
    	System.out.println("Before Swap: number1 = "+ number1+", number2 = "+number2);
    	
    	int temp=number1;
    	number1=number2;
    	number2=temp;
    	
    	
    	System.out.println("After Swap: number1 = "+ number1+", number2 = "+number2);
    
    
        int num1 = 5;
        int num2 = 10;
        
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        
        // Swap without extra memory
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}

