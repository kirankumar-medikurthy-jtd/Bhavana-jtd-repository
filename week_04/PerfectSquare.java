class PerfectSquare 
{
    public static void main(String[] args) 
    {
        int number = 25;

        int sqrt = (int) Math.sqrt(number);
        
        if (sqrt * sqrt == number) 
        {
            System.out.println("Yes, " + number + " is a perfect square.");
        } 
        else 
        {
            System.out.println("No, " + number + " is not a perfect square.");
        }
    }
}

