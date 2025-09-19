6. Question: Given a string, remove all adjacent duplicate characters.


class Solution {
    public String removeAdjacentDuplicates(String s) {
        if (s.length() < 2) {
            return s;
        }
        char[] arr = s.toCharArray();
        int j = 0;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return new String(arr, 0, j + 1);
    }
}


5. Question: Given an array of int, Find the largest sum of a contiguous subarray using the brute-force approach.

class Solution {
    public int maxSubArraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;
        int start = 0, end = 0;
        
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += arr[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start = i;
                    end = j;
                }
            }
        }
        
        
        return maxSum;
    }
}





4. Question: Find the length of the shortest word in a string.


class Solution {
    public int shortestWordLength(String s) {
        int minLength = Integer.MAX_VALUE;
        int currentLength = 0;
        int n = s.length();
        for (int i = 0; i < n ; i++) {
            if (s.charAt(i) == ' ') {
                if (currentLength > 0 && currentLength < minLength) {
                    minLength = currentLength;
                }
                currentLength = 0;
            } else {
                currentLength++;
            }
        }
        if (currentLength > 0 && currentLength < minLength) {
            minLength = currentLength;
        }
        return minLength;
    }
}



3. Question: Given a string, reverse the order of vowels in it.


class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            while (left < right && !isVowel(chars[left])) {
                left++;
            }
            while (left < right && !isVowel(chars[right])) {
                right--;
            }
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}

2. Question: Given a string, compress it by replacing consecutive repeating characters with the character and the count.

s = aabbbcccdd --> a2b3c2d2


class Solution {
    public String compressString(String s) {
        if (s.isEmpty()) return "";
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        int n = s.length();
        for (int i = 1; i < n ; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }
        compressed.append(s.charAt(s.length() - 1));
        compressed.append(count);
        String result = compressed.toString();
        return result.length() < s.length() ? result : s;
    }
}

/*


1. Given a string and a pattern, find the starting index of the first occurance of the pattern.

class Solution {
    public int findSubstringIndex(String text, String pattern) 
    {
        int n = text.length();
        int p = pattern.length();
        
        for (int i = 0; i <= n - p; i++) {
            int j;
            for (j = 0; j < p; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == p) {
                return i;
            }
        }
        return -1;
    }
    
    
*/
