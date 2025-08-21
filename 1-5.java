// 1 - Given an array of int, find the sum of all the elements in it.

// 2 - Given an array of int, find the minimum and maximum element in it.

// 3 - Given an array of int, find the 2nd largest element in it.

// 4- Given an array of int, find the 3rd largest element in it.

5 - Given an array of int, reverse that array without using any additional array.





/*




package Java.Lecture5;
// Question: Given an array find the third largest element in the array.
public class Q4 {
    public static void main(String[] args){
        int[] arr={3, 4, 8, 6, 1, 9};
        //6
        
        int n=arr.length;
        int fm=Integer.MIN_VALUE;
        for(int elem:arr){
            if(elem>fm){
                fm=elem;
            }
        }
        
        int sm=Integer.MIN_VALUE;
        for(int elem:arr){
            if(elem>sm && elem<fm){
                sm=elem;
            }
        }
        int tm=Integer.MIN_VALUE;
        for(int elem:arr){
            if(elem>tm&&elem<sm){
                tm=elem;
            }
        }
        System.out.println(tm);
    }
}


package Java.Lecture5;
//Question: Given an array find the second largest array.
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={10,50,20,40,30};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        
        for(int elem:arr){
            if(elem>max){
                max=elem;
            }
        }
        
        int sm = Integer.MIN_VALUE;
        
        for(int elem:arr){
            if(elem>sm && elem<max){
                sm=elem;
            }
        }
        System.out.println(sm);
    }
    
}


public class Q2 {
    public static void main (String [] agrs){

         
        int[] arr = {3, 5, 1, 8, 2};
        int min = arr[0];
        int max = arr[0];
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}



public class Q2 {
    public static void main (String [] agrs){

         
        int[] arr = {3, 5, 1, 8, 2};
        int min = arr[0];
        int max = arr[0];
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}

public class Lecture_4 {
     public static void main(String[] args) {
         int [] a={10,20,30,40,50};
         int sum =0;
         int n = a.length;
         for(int i=0; i<n; i++)
         {
            sum += a[i];
            System.out.println(sum);
         }
         System.out.println("Sum of all the element in it: " +sum);
     }
 }
 
 

public class Lecture_4 {
     public static void main(String[] args) {
         int [] a={10,20,30,40,50};
         int sum =0;
         for(int elem: a)
         {
            sum += elem;
            System.out.println(sum);
         }
         System.out.println("Sum of all the element in it: " +sum);
     }
 }




public class Lecture_4 {
    public static void main(String[] args) 
    {
        int[] num = {10,20,30,40,50};
        int n = num.length;
        for(int elem: num)
        {
            System.out.println(elem);
        }

    }
}


public class Lecture_4 {
    public static void main(String[] args) 
    {
        int[] num = {10,20,30,40,50};
        int n = num.length;
        for(int elem: num)
        {
            System.out.println(elem);
        }

    }
}



public class Lecture_4 {
    public static void main(String[] args) 
    {
        int[] num = {10,20,30,40,50};
        int n = num.length;
        for(int elem: num)
        {
            System.out.println(elem);
        }

    }
}


package Java.Lecture5;
// Question: Write a program to print an array all elements.
import java.util.*;
public class concept {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}


public class Lecture_4 {
    public static void main(String[] args) 
    {
        int[] num = {10,20,30,40,50};
        int n = num.length;
        for(int i =0; i < n; i++)
        {
            System.out.println(num[i]);
        }

    }
}

*/
