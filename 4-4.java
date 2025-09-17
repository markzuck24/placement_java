// HW:

// 4. Given a row wise sorted 2D Array of int in which next row starts with element larger than the last elem of previous row, check if a particular element is present in it.
// A[][], x
a - Brute Force: O(n*m)
b - Optimised: O(m+n)


// 1 2 3
// 4 5 6
// 7 8 9

// x = 8


5. Given a string, check if it's pangram (contains all the lower case alphabets from 'a' to 'z')

class Solution {
    public boolean isPangram(String s) {
        boolean[] alphabet = new boolean[26];
        for (char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }
        for (boolean b : alphabet) {
            if (!b) return false;
        }
        return true;
    }
}


6. Find the number of words in the given sentence.
/*
import java.util.*;

class Main{
    public static void main(String[] args)
    {
        int x = 8;
        String ans = "no";
        int[][] a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        int n = a.length;
        int m = a[0].length;
        
        int row = 0, col = m-1;
        
        while(row < n && col >= 0)
        {
            if(a[row][col] == x)
            {
                ans = "yes";
                break;
            }
            else if(a[row][col] < x)
            {
                row++;
            }
            else
            {
                col--;
            }
        }
        
        System.out.println(ans);
    }
}
*/
