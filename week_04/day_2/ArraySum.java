public class ArraySum 
{
    public static void main(String[] args) 
    {
        int[] array = { 5, 10, 15, 20 };
        int result = sumArrayElements(array);
        System.out.println("Sum of array elements: " + result);
    }

    public static int sumArrayElements(int[] arr) 
    {
        int totalSum = 0;
        for (int element : arr) 
        {
            totalSum += element;
        }
        return totalSum;
    }
}

