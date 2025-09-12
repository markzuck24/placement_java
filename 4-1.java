// HW -> 
// 3. Find the longest palindromic substring in a given string.

// abfcdcea --> cdc --> 3


// 1 - create a method that takes a string as an input and returns its length if it is palindrome else it returns 0.
// 2- find all possible substrings of the given string.
// 3- pass those substrings to this method and keep a track of the maximum length. 


4- Given an array of int, find the first unique number in it.



/*



public class Lecture_19 {
    public static int isPalindrome(String s)
    {
        int left = 0 , right = s.length() - 1;
        while(left < right) 
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return 0;
            }
            
            left++;
            right--;
        }
        return s.length();
    }
    
    public static String longestSubstring (String s)
    {
        int n = s.length();
        String longest = "";
        int maxLength = 0;
        for(int i =0; i<n; i++)
        {
            for(int j = i; j< n; j++)
            {
                String sub = s.substring(i,j+1);
                int len = isPalindrome(sub);
                
                if ( len > maxLength) 
                {
                    longest = sub;
                    maxLength = len;
                }
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        String s ="abcdcbf";
        System.out.println("Longest palindromic substring in a given string is: "+longestSubstring(s));
    }
}


public class Lecture_19 {
    public static boolean isPalindrome(String s)
    {
        int left = 0 , right = s.length() - 1;
        while(left < right) 
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            
            left++;
            right--;
        }
        return true;
    }
    
    public static String longestSubstring (String s)
    {
        int n = s.length();
        String longest = "";
        int maxLength = 0;
        for(int i =0; i<n; i++)
        {
            for(int j = i; j< n; j++)
            {
                String sub = s.substring(i,j+1);
                if (isPalindrome(sub) && sub.length() > maxLength) 
                {
                    longest = sub;
                    maxLength = sub.length();
                }
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        String s ="abcdcbf";
        System.out.println("Longest palindromic substring in a given string is: "+longestSubstring(s));
    }
}

import java.util.regex.*;


public class Lecture_20 {
    public static void main(String[] args) {
        String s = "Abcd09_";
        Pattern p =Pattern.compile("^\\w+$");
        Matcher m =p.matcher(s);
        boolean isAlphaNumericOnly = p.matcher(s).matches();
        System.out.println(isAlphaNumericOnly);
    }
}


import java.util.regex.*;


public class Lecture_20 {
    public static void main(String[] args) {
        String s = "Abcd09_";
        Pattern p =Pattern.compile("^\\w+$");
        Matcher m =p.matcher(s);
        boolean isAlphaNumericOnly = p.matcher(s).matches();
        System.out.println(isAlphaNumericOnly);
    }
}

import java.util.regex.*;


public class Lecture_20 {
    public static void main(String[] args) {
        String s = "Abcd@09_";
    
        boolean isAlphaNumericOnly = 
                        Pattern.compile("^\\w+$").matcher(s).matches();
        System.out.println(isAlphaNumericOnly);
    }
}


public class Lecture_20 {
    public static void main(String[] args) {
        String s = "aBcD24";
        Pattern p =Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m =p.matcher(s);
        boolean isAlphabetOnly = m.matches();
        System.out.println(isAlphabetOnly);
    }
}


import java.util.regex.*;

public class Lecture_20 {
    public static void main(String[] args) {
        String s = "aBcD24";
        Pattern p =Pattern.compile("^[A-Za-z0-9]+$");
        Matcher m =p.matcher(s);
        boolean isAlphabetOnly = m.matches();
        System.out.println(isAlphabetOnly);
    }
}


import java.util.regex.*;

public class Lecture_20 {
    public static void main(String[] args) {
        String s = "AJ2025";
        Pattern p =Pattern.compile("^\\d+$");
        Matcher m =p.matcher(s);
        boolean isDigitOnly = m.matches();
        System.out.println(isDigitOnly);
    }
}
*/
