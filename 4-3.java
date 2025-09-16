// 2. Question: Find the maximum difference between any two elements in an array
// a- Brute Force without sorting: TC: O(n^2)
// b- Using sorting: TC: O(nlogn)
// c- Optimised: HW : O(n)

// -1 -3 -5 
// -1- (-5) = 4

// 2. Question: Given two integer arrays, check if one array is a permutation of another array.
// a- Brute Force: O(nlogn)
// b - Avnish logic : TC & SC: O(max(max(a),max(b)))
//         arr = [1, 1000, 400000, 2]
// c - Optimised: 

// A = [2,5]
// B = [3,4]
// Logic: Length of both shall be same and the product as well as sum of all the elements shall match.

// 3. Given a 2D Array of int, check if a particular element is present in it.
// A[][], x


HW:

4. Given a row wise sorted 2D Array of int in which next row starts with element larger than the last elem of previous row, check if a particular element is present in it.
A[][], x

import java.util.*;
public class Lecture_21 {
    public static void main(String[] args) {
        
        int[][] a = {
                {2, 4, 3, 1},
                {5, 3, 1, 4},
                {4, 7, 8 ,1}
            };
        
        int x = 18;
        String ans = "no";
        int n = a.length;
        int m = a[0].length;
        
        for(int i=0;i<n; i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j] == x)
                {
                    System.out.println(i +" : " + j );
                    ans = "yes";
                    break;
                }
            }
        }
        
        System.out.println(ans);
    }
}

/*


import java.util.*;
public class Lecture_21 {
    public static void main(String[] args) {
        int[] a ={1,3,5,8,2};
        int[] b ={3,2, 8, 1, 5};
        String ans = "yes";
        
        int n = a.length;
        int m = b.length;
        
        if(n != m )
        {
            ans = "no";
        }
        else
        {
            int sum1 = 0, sum2= 0, prod1 =1, prod2 = 1;
            
            for(int elem: a)
            {
                sum1 += elem;
                prod1 *= elem;
            }
            
            for(int elem: b)
            {
                sum2 += elem;
                prod2 *= elem;
            }
            
           if((sum1!= sum2) || (prod1 != prod2))
           {
               ans = "no";
           }
        }
        
        System.out.println(ans);
    }
}

import java.util.*;
public class Lecture_21 {
    public static void main(String[] args) {
        int[] a ={1,3,5,8,2};
        int[] b ={3,2, 8, 5};
        String ans = "yes";
        
        int n = a.length;
        int m = b.length;
        
        if(n != m)
        {
            ans = "no";
        }
        else
        {
            Arrays.sort(a);
            Arrays.sort(b);
            
            for(int i =0; i<n ; i++)
            {
                if(a[i] != b[i])
                {
                    ans = "no";
                    break;
                }
            }
        }
        
        System.out.println(ans);
    }
}


import java.util.*;
public class Lecture_21 {
    public static void main(String[] args) {
        int[] a ={1,3,5,8,2};
        int n = a.length;
        int maxD = 0;
        
        int mn = a[0], mx = a[0];
        
        for(int i=1; i<n; i++)
        {
            if(a[i] > mx)
            {
                mx = a[i];
            }
            else if(a[i] < mn)
            {
                mn = a[i];
            }
        }
        
        maxD = mx-mn;
        
        System.out.println("Maximum difference is: "+ maxD);
    }
}

*/
