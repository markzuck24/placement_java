// Question: Check if a string is a valid palindrome, ignoring non-alphanumeric characters and case.

// Character.isLetterOrDigit(c)


//  2. Find the longest common prefix among a group of strings.
//  Given array of strings is given.
 
 
//  Question 3: Find all unique triplets in an array of unique elements that sum to zero.
// 1- Brute force
// [2, -1, 4,]
// 2, -1 , -1

Question 4: Find the length of the longest substring without repeating characters.



class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[256];
        for (int i = 0; i < 256; i++) {
            charIndex[i] = -1;
        }
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            char charAtRight = s.charAt(right);
            if (charIndex[charAtRight] != -1) {
                left = Math.max(left, charIndex[charAtRight] + 1);
            }
            charIndex[charAtRight] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}


class Solution {
    public String longestCommonPrefix(String[] strs) 
    {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}


public class Main
{
 public static class Movie
 {
   String title;
   String director;

  public Movie(String title,String director)
  {
   this.title = title;
   this.director = director;
  }

  @Override
  public String toString() {
   return "Movie Title: " + title + ", Director: " + director;
  }
 }
 public static void main(String[] args) {

  Movie movie1 = new Movie("Inception", "Christopher Nolan");
  
  System.out.println(movie1);
  // System.out.println("Hello World");
 }
}
*/
