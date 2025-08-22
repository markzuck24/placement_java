// 1 - Reverse an array of int, without using any additional array.
// 2- Reverse an array of int, can use an additional array, if needed.

// 3 - Question: Find the number of pairs in an array that sum to a given value.
// a[] , target

// 4 - Given an array of distinct elements, find the number of pairs that sum to a given value.
// a[], target.
// Efficient code than above.


// 5-Question: Check if the given number is a Perfect number or not. 
// A perfect number is a positive integer that is equal to the sum of its proper divisors.

6- Check if a number is a Duck number (a number that contains a zero)



/*



import java.util.*;
public class Main
{
 public static void main(String[] args) {
     int num = 7;
     //1,2,3
     int sum = 0;
     for(int i =1;i<=num/2;i++)
     {
         if(num%i == 0)
         {
             sum+=i;
         }
     }
     
     if(sum == num && num>0)
     {
         System.out.println("Yes");
     }
     else{
         System.out.println("No");
     }
 }
}


import java.util.*;

public class Main
{
 public static void main(String[] args) {

     int [] arr = {1,2,3,-1,4,5,6};
     int targetSum = 5;
     int n = arr.length;
     int count = 0;
     
     
     Arrays.sort(arr);
     
     int left = 0;
     int right = n-1;
     
     while(left<right)
     {
         int sum = arr[left]+arr[right];
         
         if(sum == targetSum)
         {
             count++;
             left++;
             right--;
         }
         else if(sum<targetSum)
         {
             left++;
         }
         else{
             
             right--;
         }
         
     }
     
     System.out.println("No of pairs : "+ count);
     
    }
}



package Java.Lecture6;
// Question: Find the number of pairs in an array that sum to a given value.
// a[]=target
public class Q1 {
    public static void main(String[] args) {
        int[]arr={1, 2, 1, 4, 3, 4, 5};
        int t=5; // target sum
        int c=0; // count of pairs
        int n=arr.length;
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==t)
                {
                    c++;
                }
            }
        }
        
        System.out.println(c);
    }
}

package Java.Lecture5;
// Question: Given an array of int reverse the array without using any extra space or additional array.
public class Q5 {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        int n=arr.length;
        int s=0;
        int e=n-1;
      while(s < e)
      {
        int t = arr[s];
        arr[s] = arr[e];
        arr[e] = t;
        s++;
        e--;
      }
            
        for(int elem:arr){
            System.out.print(elem+" ");
        }
        System.out.println();
    }
    
}


package Java.Lecture5;
import java.util.*;
public class Main
{
 public static void main(String[] args) {
     int []arr = {3,4,6,10,11,12};
    //  int []arr = {3,4,6,10,7,11,12};
     //12,11,10, 6, 4, 3
     int n = arr.length;
     
     for(int i =0;i<n/2;i++)
     {
         int temp = arr[i];
         arr[i] = arr[n-i-1];
         arr[n-i-1] = temp;
     }
    
 
  for(int elem:arr)
     {
         System.out.println(elem);
     }
 }
}
public class Q6 {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5};
        int n=arr.length;
        int[] a=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            System.out.println("i= " + i + ",  n-1-i = " + (n-1-i));
            a[n-1-i]=arr[i];
        }
        
        for(int elem:a){
            System.out.print(elem+" ");
        }
    }
    
}



*/
