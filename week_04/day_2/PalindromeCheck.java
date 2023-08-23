class PalindromeCheck 
{
    public static void main(String[] args) 
    {
        String input = "radar";
        boolean result = isPalindrome(input);

        System.out.println(result ? "The string is a palindrome." : "The string is not a palindrome.");
    }

    public static boolean isPalindrome(String str) 
    {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) 
        {
            if (str.charAt(left) != str.charAt(right)) 
            {
                return false;
            }
            
            left++;
            right--;
        }

        return true;
    }
}

