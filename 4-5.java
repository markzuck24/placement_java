// 1. Question: Check if a string is a valid palindrome after deleting at most one character.


// abcba -> palindrome
// abccba--> palindrome


// abcdba--> not a palindrome.
// remove c: abdba --> palindrome
// remove d: abcba --> palindrome


2. Given a string, check if it contains all the unique characters in it.
TC : O(n), SC: O(1)

3. Question: Rotate a 2D matrix by 90 degrees.
4. Question: Rotate a 2D matrix by 180 degrees.


class Solution {
    public static void main(String[] args) 
    {
        String s = "abcdeghfi";
        
        if (s.length() > 256) 
            return false;
            
        boolean[] charSet = new boolean[256];
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            if (charSet[val]) {
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }
}

/*
class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return isPalindrome(s, l + 1, r) || isPalindrome(s, l, r - 1);
            }
            l++;
            r--;
        }
        return true;
    }
    private boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

*/
