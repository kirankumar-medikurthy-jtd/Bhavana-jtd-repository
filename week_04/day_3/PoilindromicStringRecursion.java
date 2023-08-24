class PoilindromicStringRecursion 
{
    public static void main(String[] args) 
    {
        String str = "ammaa";
        boolean isPalindrome = palindrome(str, 0, str.length() - 1);

        if (isPalindrome) 
        {
            System.out.println(str + " is a palindrome.");
        } 
        else 
        {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean palindrome(String str, int start, int end) 
    {
        if (start >= end) 
        {
            return true;  
        }

        if (str.charAt(start) != str.charAt(end)) 
        {
            return false;  
        }

        // Recur with the next characters
        return palindrome(str, start + 1, end - 1);
    }
}
