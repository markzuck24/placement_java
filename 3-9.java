// 1. Given an array of int, find the max product of the subarray of it.
// a- Brute Force: O(n^2)
// b - Optimised : O(n)


// 2. Given an array of distinct int, print the count of the pairs that sum to a given target value.
// a[], sum = x
// a -Brute force. TC: o(n^2)
// b - Optimised:2 pointer appraoch TC: O(nlogn)


HW -> 
3. Find the longest palindromic substring in a given string.

abfcdcea --> cdc --> 3


1 - create a method that takes a string as an input and returns its length if it is palindrome else it returns 0.
2- find all possible substrings of the given string.
3- pass those substrings to this method and keep a track of the maximum length. 






/*

public class Main{
    public static void main(String[] args)
    {
        int [] a = {2, 1, 4, 5};
        int sum = 6;
        int n = a.length;
        int ans = 0;
        for(int i = 0; i<n ; i++)
        {
            for(int j= i+1; j<n; j++)
            {
                if(a[i] + a[j] == sum)
                {
                    ans++;
                }
            }
        }
        
        
        
        System.out.println("Answer is: " + ans);
    }
}
public class Main{
    public static void main(String[] args)
    {
        int [] a = {2, -3, 4, -2};
        int n = a.length;
        
        int mn = a[0];
        int mx = a[0];
        int curr, new_mx, ans = a[0];
        for(int i=1; i<n ; i++)
        {
            curr = a[i];
            new_mx = Math.max(curr, Math.max(mx*curr, mn*curr));
            mn = Math.min(curr, Math.min(mx*curr, mn*curr));
            mx = new_mx;
            // max(a,b,c) = max(a, max(b,c))
            
            ans = Math.max(ans, mx);
            
            System.out.println(mx + " " +  mn + " " + ans);
            
        }
        
        System.out.println("Answer is: " + ans);
    }
}


public class Lecture_19 {
    public static int maxProductBruteForce(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = i; j < n; j++) {
                product *= nums[j];
                System.out.println(product);
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }
        return maxProduct;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, -2};
        System.out.println("Max product is: " + maxProductBruteForce(arr));
        
    }
}
*/
