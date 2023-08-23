public class AnagramCheck 
{
    public static void main(String[] args) 
    {
        String str1 = "listen";
        String str2 = "silent";

        boolean result = areAnagrams(str1, str2);

        System.out.println(result ? "The strings are anagrams." : "The strings are not anagrams.");
    }

    public static boolean areAnagrams(String str1, String str2) 
    {
        if (str1.length() != str2.length()) 
        {
            return false;
        }

        int[] charCount1 = new int[26];
        int[] charCount2 = new int[26];

        for (int i = 0; i < str1.length(); i++) 
        {
            char c = str1.charAt(i);
            charCount1[c - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) 
        {
            char c = str2.charAt(i);
            charCount2[c - 'a']--;
        }

        for (int i = 0; i < 26; i++) 
        {
            if (charCount1[i] != charCount2[i]) 
            {
                return false;
            }
        }

        return true;
    }
}

