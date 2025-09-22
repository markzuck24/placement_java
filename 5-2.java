
2. Question: Find the maximum value in a bitonic array.
First few elements are in strictly increasing order and remaining elements are in strictly decreasing order.

1 3 8 12 6 4 2

public class Lecture_26 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 4, 2};
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Maximum element is: " + arr[low]);
    }
}


// 1. Question: Given an array, find the maximum sum of exactly k consecutive elements.

// a- Brute Force code
b - Optimised code - Sliding Window -> O(n)



class Solution {
    public int maxSum(int[] arr, int k) {
        if (arr.length < k) {
            return -1;
        }
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        
        int maxSum = windowSum;
        
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}



public class Lecture_26 {
    public static void main(String[] args) {
        int[] arr = {4, 9, 6, 8, 5};
        int k = 3;
        int n = arr.length;
        if (k > n) {
            System.out.println("k is larger than array length");
            return;
        }

        int maxSum = Integer.MIN_VALUE;

       
        for (int i = 0; i <= n - k; i++) {
            int currentSum = 0;
            for (int j = i; j < i + k; j++) {
                currentSum += arr[j];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        System.out.println("Maximum sum of " + k + " consecutive elements is: " + maxSum);
    }
}
