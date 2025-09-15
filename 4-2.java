

// 1 - Question: Given a sorted array, remove duplicates in-place and print the new length.

// a- Extra space allowed. TC: O(n) , SC:O(n)
// b - Without any extra space.  TC: O(n), SC:O(1)


// 2. Question: Find the maximum difference between any two elements in an array
// a- Brute Force without sorting: TC: O(n^2)
// b- Using sorting: TC: O(nlogn)
// c- Optimised: HW



import java.util.*;
public class Lecture_21 {
    public static void main(String[] args) {
        int[] a ={1,3,5,8,2};
        int n = a.length;
        Arrays.sort(a);
       int maxD = a[n-1] - a[0];
        System.out.println("Maximum difference is: "+ maxD);
    }
}






/*


public class Lecture_21 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5};
        int n = arr.length;
        
        int j = 0;  
        for (int i = 1; i < n; i++) 
        {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        int newLength = j + 1;
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class Lecture_21 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5};
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
         for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
         for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


//Match either "color" or "colour" , but not "colr".
import java.util.regex.*;
public class Lecture_21 {
    public static void main(String[] args) {
       String s ="color colour colr";
       Pattern p =Pattern.compile("colou?r");
       Matcher m = p.matcher(s);
    
       while (m.find()) {
        System.out.println(m.group());
       } 
    }
}

import java.util.regex.*;
public class Lecture_21 {
    public static void main(String[] args) {
       String s ="Regular javajava Expression in java";
       Pattern p =Pattern.compile("\\bjava\\b");
       Matcher m = p.matcher(s);
     
       while (m.find()) {
        System.out.println(m.group());
       } 
    }
}

import java.util.regex.*;

public class Lecture_21 {
    public static void main(String[] args) {
       String s ="Regular Expression";
       Pattern p =Pattern.compile("[AEIOUaeiou]");
       Matcher m = p.matcher(s);
       System.out.println("Vowels in \""+s+"\":");
       while (m.find()) {
        System.out.println(m.group());
       } 
    }
}

import java.util.regex.*;
public class Lecture_21 {
    public static void main(String[] args) {
       String s ="A1B22C333";
       Pattern p =Pattern.compile("\\d+");
       Matcher m = p.matcher(s);
      while (m.find()) {
        System.out.println(m.group());
      } 
    
    
    }
}
*/
