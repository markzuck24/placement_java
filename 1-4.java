
// 1-Question: Write a Java Program to check if a number is palindrome or Not


// 2- Question: Write a program to calculate the power of a number (e.g., a^b).
// ip: a,b 


// 3 - Question: Write a program to print a multiplication table for a given number.
// n = 5, 
// first 10 
// 5*1 = 1
// 5*2 = 10

// 4- Question: Write a program to print all prime numbers up to a given number n.


import java.util.*;
public class Main
{
    
    public static boolean isPrime(int n1)
    {
        if(n1<2)
        {
            return false;
        }
        
        int count =0;
        
        for(int i =1;i<=n1/2;i++)
        {
            if(n1%i == 0)
            {
                count++;
            }
            
            if(count >1)
            {
                return false;
            }
        }
        
        
        return true;
    }
 public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      for(int i =1;i<=n;i++)
      {
          if(isPrime(i)){
              System.out.println(i);
          }
      }
     
      
      scn.close();
      
 }
}

/*

import java.util.*;
public class Main
{
 public static void main(String[] args) {
    //   Scanner scn = new Scanner(System.in);
    //   int n = scn.nextInt();
    int n = 5;
    
    for(int i =0; i<=10*n; i+=n)
    {
        if(i == 0)
        {
            continue;
        }
        System.out.println(i);
    }
      
 }
}

import java.util.*;
public class Main
{
 public static void main(String[] args) {
    //   Scanner scn = new Scanner(System.in);
    //   int n = scn.nextInt();
    int n = 5;
    int val = n;
      for (int i=1;i<=10;i++)
      {
          System.out.println(n+" * "+i+" = "+ val);
          val += n;
      }
      
 }
}

import java.util.*;
public class Main
{
 public static void main(String[] args) {
    //   Scanner scn = new Scanner(System.in);
    //   int n = scn.nextInt();
    int n = 5;
      for (int i=1;i<=10;i++)
      {
          System.out.println(n+" * "+i+" = "+ n*i);
      }
      
 }
}

public class Q9 {
    public static void main(String[] args) {
        
        int a=3;    // number
        int b=2;   // power
        int c=1;
        
        for (int i=0; i<b;i++){
            c=c*a;
        }
        
        System.out.println(c);
    }
    
}

// Question: Write a Java Program to check if a number is palindrome or Not
public class Q9 {
    public static void main(String[] args) {
        int n=40404;
        int t=n;
        int r=0;
        while(n>0){
            int d=n%10;
            r=r*10+d;
            n=n/10;
            // System.out.println("Hi");
        }

        System.out.println(r);
        if(t==r){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    
}

public class Q9 {
    public static void main(String[] args) {
        int n=40404;
        int t=n;
        int r=0;
        while(n>0){
            int d=n%10;
            r=r*10+d;
            n=n/10;
            // System.out.println("Hi");
        }

        System.out.println(r);
        if(t==r){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    
}

class Main{
    public static void main(String[] args)
    {
        int month =4;
        switch(month){
            case 3:
                System.out.println("Winter Season");
                break;
            case 4:
                System.out.println("Rainy Season");
            case 5:
                System.out.println("Spring Season");
            default:
                System.out.println("Not Spring");
        }
    }
}

class Main{
    public static void main(String[] args)
    {
        int month =4;
        switch(month){
            case 3:
                System.out.println("Winter Season");
                break;
            case 4:
                System.out.println("Rainy Season");
                break;
            case 5:
                System.out.println("Spring Season");
            default:
                System.out.println("Not Spring");
        }
    }
}

class Main{
    public static void main(String[] args)
    {
        int month =4;
        switch(month){
            case 3:
                System.out.println("Winter Season");
                break;
            case 4:
                System.out.println("Rainy Season");
                break;
            case 5:
                System.out.println("Spring Season");
                break;
            default:
                System.out.println("Not Spring");
        }
    }
}


class Main{
    public static void main(String[] args)
    {
        int month =4;
        switch(month){
            case 3:
            case 4:
                System.out.println("Rainy Season");
                break;
            case 5:
                System.out.println("Spring Season");
                break;
            default:
                System.out.println("Not Spring");
        }
    }
}

class Main{
    public static void main(String[] args)
    {
        int month =4;
        switch(month){
            case 3:
            case 4:
                System.out.println("Rainy Season");
            case 5:
                System.out.println("Spring Season");
                break;
            default:
                System.out.println("Not Spring");
        }
    }
}



class Main{
    public static void main(String[] args)
    {
        int month =4;
        switch(month){
            case 3:
            case 4:
            case 5:
                System.out.println("Spring Season");
                break;
            default:
                System.out.println("Not Spring");
        }
    }
}
*/

