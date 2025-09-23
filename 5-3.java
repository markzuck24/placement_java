// 2. Question: Find a triplet with a given sum in a sorted array.

// a- Brute Force - o(n^3)

class Solution {
    public boolean findTriplet(int[] arr, int target) {
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == target) {
                    return true;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return false;
    }
}

/*
package Java.LastLecture;
// Question: Find the triplet with a given sum in a sorted array
public class Q1 {
    public static boolean findTriplet(int[] arr, int sum) {
        int n = arr.length;
        if (n < 3) {
            return false;
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        System.out.println("Triplet found: (" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
                        return true; 
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 10, 12, 15, 20};
        int targetSum = 30;
        System.out.println("Array: ");
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println("\nTarget Sum: " + targetSum);
        System.out.println("------------------------------------");
        findTriplet(arr, targetSum);
        int[] arr2 = {2, 3, 5, 9, 11};
        int targetSum2 = 25;
        for (int num : arr2){
            System.out.print(num + " ");
        }
        System.out.println( targetSum2);
        System.out.println("------------------------------------");
        findTriplet(arr2, targetSum2);
    }
}

*/

/*
// 1. Question: Given a string, find the length of the longest substring with at most two distinct characters.

// a- Brute Force

import java.util.*;

class Main{
    public static boolean is_valid(String s)
    {
        Set<Character> st = new HashSet<>();
        
        for(int i = 0; i< s.length(); i++)
        {
            st.add(s.charAt(i));
        }
        
        // if(st.size() > 2)
        // {
        //     return false;
        // }
        
        // return true;
        
        return (st.size() <= 2);
    }
    
    public static void main(String[] args)
    {
        String s = "abcbccabbcbadeab";
        //ans = 9
        int mx = 0;
        int n = s.length();
        
        for(int i =0; i<n ; i++)
        {
            for(int j = i+1; j<n ; j++)
            {
                String sub_s = s.substring(i, j);
                
                if(is_valid(sub_s) && mx < sub_s.length())
                {
                    mx = sub_s.length();
                }
            }
        }
        
        System.out.println(mx);
    }
}

*/
