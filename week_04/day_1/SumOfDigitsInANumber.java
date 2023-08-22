public class SumOfDigitsInANumber 
{
    public static void main(String[] args) 
    {
        int number = 12345;
        int sum = calculateSumOfDigits(number);
        
        System.out.println("The sum of digits in " + number + " is: " + sum);
    }
    
    public static int calculateSumOfDigits(int num) 
    {
        int sum = 0;
        
        while (num > 0) 
        {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        
        return sum;
    }
}

