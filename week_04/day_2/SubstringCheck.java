public class SubstringCheck 
{
    public static void main(String[] args) 
    {
        String s1 = "Hello, World!";
        String s2 = "World";

        boolean result = isSubstring(s1, s2);

        System.out.println(result ? "s2 is a substring of s1." : "s2 is not a substring of s1.");
    }

    public static boolean isSubstring(String s1, String s2) 
    {
        int n = s1.length();
        int m = s2.length();

        for (int i = 0; i <= n - m; i++) 
        {
            if (s1.substring(i, i + m).equals(s2)) 
            {
                return true;
            }
        }

        return false;
    }
}

