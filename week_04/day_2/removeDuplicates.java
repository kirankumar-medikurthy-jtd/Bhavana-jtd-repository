class removeDuplicates 
{

    static int removeDuplicates(int arr[], int n) 
    {
	    int j = 0;
	    for (int i = 0; i < n; i++) 
	    {
		if (i == 0 || arr[i] != arr[j - 1]) 
		{
		    arr[j] = arr[i];
		    j++;
		}
	    }
	    return j;
    }


    public static void main(String[] args) 
    {
        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int n = arr.length;

        n = removeDuplicates(arr, n);

        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
    	}
    	
    }
}

