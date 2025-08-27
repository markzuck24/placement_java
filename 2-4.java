// 1. Given 2 sorted arrays, create a single sorted array by combining both the arrays.

// a - Brute force. TC : (n+m)log(n+m), SC
// b - Optimised approach: HW

// 2. Give a string, count the number of distinct characters in it.

package Java.Lecture9;
// Question: Given a String, count number of distinct characters in it.

import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        String s="abcdabdef";
        int n=s.length();
        HashSet<Character> d = new HashSet<>();
        
        for(int i=0;i<n;i++){
            d.add(s.charAt(i));   
        }
        
        System.out.println(d.size());
    }
    
}


import java.util.*;
public class Main
{
 public static void main(String[] args) {
     
     
     
     String charString = " Hello EveryOne, Akshat This side, I hope you all are good";
     
     HashSet<Character> distinctChar = new HashSet<>();
     int n = charString.length();
     
     for(int i =0;i<n;i++)
     {
         distinctChar.add(charString.charAt(i));
     }
     
     System.out.println(distinctChar.size());
}}



/*


import java.util.*;

public class Lecture_8 {
     public static void main(String[] args) {
         int [] a ={1,3,5,7};
         int [] b ={2,4,6,8};
         int n = a.length;
         int m = b.length;
         
         int [] comb = new int[n+m];
         for(int i =0; i<n; i++)
         {
            comb[i] = a[i];
         }
         for(int i =0; i<m; i++)
         {
            comb[n+i] = b[i];
         }
         
         for(int arr: comb)
         {
            System.out.print(arr + " ");
         }
         
         
         Arrays.sort(comb);
         
         System.out.println();
         
         for(int arr: comb)
         {
            System.out.print(arr + " ");
         }
     }
 }
 

import java.util.*;
public class Main
{
 public static void main(String[] args) {
     
     
     HashSet<String> fruits = new HashSet<>();
     fruits.add("Apple");
     fruits.add("Banana");
     fruits.add("Papaya");
     fruits.add("Mango");
     
     int n = fruits.size();
     
     String [] fruitArray = new String[n];
     int i =0;
     
     for(String f:fruits)
     {
         fruitArray[i] = f;
         i++;
     }
     
     for(String elem:fruitArray)
     {
         System.out.print(elem + " ");
     }
}
}


import java.util.*;

public class Lecture_8 {
    public static void main(String[] args) {
        // No. of Employess in a company
        HashSet<String> employee = new HashSet<>();
        employee.add("Gulmohar");
        employee.add("Akash");
        employee.add("Abhilash");
        employee.add("Aditya");
        System.out.println("Number of Employees: "+employee.size());

    }
}





package Java.Lecture9;
import java.util.*;
public class Q2 {
    public static void main(String[] args){
        HashSet<String> IP = new HashSet<>();
        IP.add("225.192.108.1");
        IP.add("225.192.138.4");
        IP.add("125.192.108.1");
        IP.add("215.192.108.1");
        IP.add("225.192.108.1");
        IP.add("325.192.108.1");
        System.out.println(IP);
        System.out.println(IP.size());
        
    }
}


package Java.Lecture9;
import java.util.*;
public class Q1 {
    public static void main(String[] args){
        HashSet<String> c=new HashSet<>();
        
        c.add("Red");
        c.add("Green");
        c.add("Blue");
        c.add("Yellow");
        
        for(String color:c){
            System.out.println(color);
        }
    }
    
}


package Java.Lecture9;
import java.util.HashSet;
public class concept {
    public static void main(String[] args) {
        // Hint: Add elements using addO, duplicates are automatically discarded.
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);    // duplicate; will not be added numbers.
        numbers.add(10);
        numbers.add(40);
        numbers.add(50);
        numbers.add(10);
        numbers.add(60);    // duplicate numbers.
        System.out.println("HashSet:"+ numbers);
        System.out.println(numbers.contains(20));
        System.out.println(numbers.remove(10));
        System.out.println(numbers.remove(10));
        System.out.println(numbers.remove(80));
        System.out.println(numbers);
    }
}


*/
