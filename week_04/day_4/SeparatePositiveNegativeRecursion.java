class SeparatePositiveNegativeRecursion 
{
    public static void main(String[] args) 
    {
        int[] arr = {5, -3, 8, -1, 0, -2, 7};
        separatePosNeg(arr, 0, arr.length - 1);
        printArray(arr);
    }

    public static void separatePosNeg(int[] arr, int left, int right) 
    {
        if (left >= right) 
        {
            return;
        }

        if (arr[left] < 0 && arr[right] >= 0) 
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        if (arr[left] >= 0) 
        {
            separatePosNeg(arr, left + 1, right);
        }

        separatePosNeg(arr, left, right - 1);
    }

    public static void printArray(int[] arr) 
    {
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

