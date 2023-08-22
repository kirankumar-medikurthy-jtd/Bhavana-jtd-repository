 class FrequencyOfElementsInArray
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 5, 5, 6};
        
        int maximum = max(arr);
        
        int[] newArr = new int[maximum + 1];
        
        for (int i = 0; i < arr.length; i++) {
            newArr[arr[i]] += 1;
        }
        
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] > 0) {
                System.out.println(i+":"+newArr[i]);
            }
        }
    }
    
    public static int max(int[] arr) {
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }
}

