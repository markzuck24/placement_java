
// 1- Given two sorted arrays, merge them into a single sorted array.
// a-Brute force: TC: (n+m)log(n+m)
// b-Optimised: 


import java.util.*;
public class Main
{
 public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        
        int n = arr1.length, m = arr2.length;
        
        int[] arr3 = new int[n + m];
        
        int i = 0, j = 0, k = 0;
        
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        
        while (i < n) 
        {
            arr3[k++] = arr1[i++];
        }
        
        while (j < m) 
        {
            arr3[k++] = arr2[j++];
        }
        
        
        for(int elem: arr3)
        {
            System.out.print(elem+ " ");
        }
    
 }
}




/*

import java.util.Stack;
public class Q2 {
    public static void main(String[] args) {
        Stack<Character> s=new Stack<>();
        s.push('+');
        s.push('-');
        s.push('*');
        s.push('/');
        s.push('%');    
        int n = s.size();
        
        // for(int i=0;i<n;i++){
        //     char ch=s.pop();
        //     System.out.println(ch);
        // }
        
        while(!s.empty())
        {
            System.out.println(s.pop());
        }
        
    }
}

import java.util.*;
public class Main
{
 public static void main(String[] args) {
     
     Stack<String> bookInventory =  new Stack<>();
     
     bookInventory.push("Physics");
     bookInventory.push("Chemistry");
     bookInventory.push("Mathematics");
     bookInventory.push("English");
     bookInventory.push("Hindi");
     bookInventory.push("Biology");
     bookInventory.push("Social Science");
     bookInventory.push("French");
     bookInventory.push("Computer Organization");
     
     for(String element:bookInventory)
     {
         System.out.println(element);
     }
}
}

import java.util.*;
public class Main
{
 public static void main(String[] args) {
     
     Stack<String> bookInventory =  new Stack<>();
     
     bookInventory.push("Physics");
     bookInventory.push("Chemistry");
     bookInventory.push("Mathematics");
     bookInventory.push("English");
     bookInventory.push("Hindi");
     bookInventory.push("Biology");
     bookInventory.push("Social Science");
     bookInventory.push("French");
     bookInventory.push("Computer Organization");
     bookInventory.push("Biology");
     
     
     
     System.out.println("Book for french is Present or Not: "+ bookInventory.search("French"));
     
     System.out.println("Book for Sanskrit is Present or Not: "+ bookInventory.search("Sanskrit"));
     
      System.out.println("Book for Biology is Present or Not: "+ bookInventory.search("Biology"));
      
      System.out.println("Book for Biology is Present or Not: "+ bookInventory.search("Biology"));
}
}



import java.util.Stack;
public class Q2 {
    public static void main(String[] args) {
        Stack<Character> s=new Stack<>();
        s.push('+');
        s.push('-');
        // s.push('*');
        s.push('/');
        s.push('%'); 
        s.push('='); 
        System.out.println("Stack " + s);

        System.out.println(s.search('*'));
        
    }
}


package Java.Lecture10;
// Question: Retrieve (without removing) the top element from a stack of character.


import java.util.Stack;
public class Q2 {
    public static void main(String[] args) {
        Stack<Character> s=new Stack<>();
        s.push('+');
        s.push('-');
        s.push('*');
        s.push('/');
        s.push('%');    
        System.out.println("Stack " + s);
        // System.out.println("Precedence: " + s.peek());
        System.out.println(s.empty());
        while(!s.empty()){
            System.out.println(s);
            s.pop();
        }
    }
}



import java.util.*;
public class Main
{
 public static void main(String[] args) {
     
     Stack<String> bookInventory =  new Stack<>();
     
     bookInventory.push("Physics");
     bookInventory.push("Chemistry");
     bookInventory.push("Mathematics");
     bookInventory.push("English");
     bookInventory.push("Hindi");
     bookInventory.push("Biology");
     bookInventory.push("Social Science");
     bookInventory.push("French");
     bookInventory.push("Computer Organization");
     System.out.println(bookInventory.isEmpty());
     
     while(!bookInventory.isEmpty())
     {
         System.out.println(bookInventory);
         bookInventory.pop();
     }
     
     System.out.println("All the books are sold");
}
}



import java.util.*;
public class Main
{
 public static void main(String[] args) {
     Stack<String> testStack = new Stack<>();
     
     testStack.push("Physics");
     testStack.push("Chemistry");
     testStack.push("Mathematics");
     testStack.push("English");
     testStack.push("Hindi");
     testStack.push("Biology");
     testStack.push("Social Science");
     testStack.push("French");
     testStack.push("Computer Organization");
     
     System.out.println("Elements of the Stack are : " + testStack);
     
    
     
     System.out.println("top Element of the stack is : " + testStack.peek());
     
     System.out.println("Stack after one peek operation : "+ testStack);
     
      System.out.println(testStack.pop());
      System.out.println("top Element of the stack is : " + testStack.peek());
     
     
  //System.out.println("Hello World");
 }
}

package Java.Lecture10;
// Question: Pop the top element from a stack of strings and print the element along with the updated stack.

import java.util.Stack;
public class Q1 {
    public static void main(String[] args){
        Stack<String> s = new Stack<>();
        s.push("Apple");
        s.push("Banana");
        s.push("Mango");
        System.out.println("Stack: " + s);
        String p=s.pop();
        System.out.println("Updated"+ s);
        System.out.println(p);
        
    }
}


package Java.Lecture10;
import java.util.Stack;
public class concept {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s);   
    }
}

*/
