class separateOddEvenRecursion 
{
    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        separateOddEven(arr, 0, arr.length - 1);
        printArray(arr);
    }

    public static void separateOddEven(int[] arr, int left, int right) 
    {
        if (left >= right) 
        {
            return;
        }

        if (arr[left] % 2 == 0 && arr[right] % 2 == 1) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        if (arr[left] % 2 == 1 && arr[right] % 2 == 1) {
            separateOddEven(arr, left + 1, right);
        }
        if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
            separateOddEven(arr, left, right - 1);
        }
        if (arr[left] % 2 == 0 && arr[right] % 2 == 0) {
            separateOddEven(arr, left + 1, right - 1);
        }
    }

    public static void printArray(int[] arr) 
    {
        for (int i=0;i<arr.length;i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

