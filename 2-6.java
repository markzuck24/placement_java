
// Create a linkedlist of characters, retrieve the first and the last elements, then update the first element.


// 1- Given a string of digits, convert it into an integer without using Integer.parseInt();
// a-> String represents a positive number.
// b-> String has sign in it -> 123 , -123



/*

import java.util.*;
public class Main
{
 public static void main(String[] args) {
     
     String digits = "-1234";
     int  num =0;
     int n = digits.length();
     int k=0, sign = 1;

     if(digits.charAt(0) == '-')
     {
         sign = -1;
         k++;
     }
     
      for(int i= ;i<n;i++)
     {
         num = num*10 + (digits.charAt(i) - '0');
         System.out.println(num);
     }
    System.out.println(sign*num);
 }
}



import java.util.*;
public class Main
{
 public static void main(String[] args) {
     
     String digits = "1234";
     int  num =0;
     int n = digits.length();
     
     //boolean neg = false;
     if(digits.charAt(0) == '-')
     {
         
          for(int i =1;i<n;i++)
         {
         
         int val = digits.charAt(i) - '0';
         num = num*10 + val;
         System.out.println(num);
         }
         
         num = (-1)*num;

         
     }
     else
     {
          for(int i =0;i<n;i++)
         {
         
         int val = digits.charAt(i) - '0';
         num = num*10 + val;
         System.out.println(num);
         }
     }

    System.out.println(num);
 }
}


import java.util.*;
public class Main
{
 public static void main(String[] args) {
     
     String digits = "1234";
     int  num =0;
     int n = digits.length();
     
     for(int i =0;i<n;i++)
     {
        //  int val = (int)digits.charAt(i) - 48;
        int val = (digits.charAt(i) - '0');
         num = num*10 + val;
         System.out.println(num);
     }
    
    System.out.println(num);
 }
}



public class Q2 {
    public static void main(String[] args) {
        String a="123";
        int n=a.length();
        int num=0;
        for(int i=0;i<n;i++){
            num = num*10+(a.charAt(i)-'0');
            System.out.println(num);
           
        }
        System.out.println(num);

    }
}


import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        LinkedList<Character> ch = new LinkedList<>();
        ch.add('a');
        ch.add('b');
        ch.add('c');
        ch.add('d');
        ch.add('e');
        
        
        System.out.println(ch);
        char b=ch.getFirst();
        System.out.println(b);
        char a=ch.getLast();
        System.out.println(a);
        ch.set(3,'f');
        System.out.println(ch);
        ch.removeFirst();
        System.out.println(ch);
        ch.removeLast();
        System.out.println(ch);
        ch.clear();
        System.out.println(ch);
    }
} 
    
public class Main{
    public static void main(String[] args)
    {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
        numbers.addFirst(40);
        System.out.println(numbers);
        numbers.addLast(50);
        System.out.println(numbers);
    }
}


import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
        numbers.addFirst(40);
        System.out.println(numbers);
        numbers.addLast(50);
        System.out.println(numbers);
    }
}


*/
