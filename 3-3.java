// 1- Given an array of int, left rotate the array by x positions in circular order.

// A - [1,2,3,4,5,6] x=3

// A - [4,5,6,1,2,3]

// 1- Brute Force: o(n*x)
// 2- Optimsed:


// 1 2 3 4 5 6
// x = 3
// step1: 6 5 4 3 2 1
// step2: 4 5 6 3 2 1
// step3: 4 5 6 1 2 3


// 1 2 3 4 5 6
// x = 2
// step1: 6 5 4 3 2 1
// step2: 3 4 5 6 2 1
// step3: 3 4 5 6 1 2



// 2- Given a sqaure matrix, find the sum of the secondary diagonal elements.

// 1 2 3 4
// 5 6 7 8
// 1 2 3 4
// 5 6 7 8

// principal diagonal: 00 11 22 33
// secondary diagonal: 
// 03 -> 3
// 12 -> 3
// 21 -> 3
// 30 -> 3

// i+j = n-1
// j = n-1-i

package Java.Lecture14;
// Question: Given a square matrix find the sum of secondary diagonal elements.
public class Q1 {
    public static void main(String[] args) {
        int[][] a={{1,2,3,4},
                   {5,6,7,8},
                   {1,2,3,4},
                   {2,6,7,8}};
        int n=a.length;
        int m=a[0].length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i][n-1-i];
        }
        System.out.println(sum);
    }
}



/*


public class Main
{
 public static class SillyPrinter
 {
     String name;
     String type;
     int price;
     
     public SillyPrinter()
     {
         this.name= "Not Availabe";
         this.type = "Not Availabe";
         this.price = -1;
     }
     
     public static void printerDetails(String name, String type)
     {
        // this.name = name;
        // this.type = type;
        System.out.println("Name of the printer "+ name+ " and type is : "+ type);
     }
     
     public static void printerDetails(String name, String type, int price)
     {
      System.out.println("Name of the printer "+ name+ " and type is : "+ type+ " and its price is : "+ price);   
     }
     
     public void display()
     {
         System.out.println(this.name+ " "+ this.type + " "+ this.price);
     }
 }

 public static void main(String[] args) {
     
     
     SillyPrinter ap = new SillyPrinter();
     ap.display();
     ap.printerDetails("Canaon","Color Printer");
     ap.printerDetails("HP","Color",5000);
 }
}



package Java.Lecture14;
// Question: Create a class Printer with overloaded methods to print different types of data.
public class Q2DSA {
    
    public static class Printer{
        public int print(int a){
            System.out.println(a);
            return a;
        }
        
        public String print(String a){
            System.out.println(a);
            return a;
        }
        
        public double print(double a){
            System.out.println(a);
            return a;
        }
        public boolean print(boolean a){
            System.out.println(a);
            return a;
        }
    }
    public static void main(String[] args) {
        Printer p=new Printer();
        p.print(10);
        p.print(false);
        p.print(10.5);
        p.print(true);
        p.print("AJ");


    }
}

package Java.Lecture14;
// Question: An array of int, left rotate the array by x positions in circular order.

import java.util.*;
public class Q1DSA {
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        int x=3;
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        for(int i=1;i<=x;i++)
        {
            int t=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }  
            arr[n-1]=t;
            
            for(int j=0; j<n; j++)
            {
                System.out.print(arr[j] + " ");
            }
            
            System.out.println();
        }
        
        
    }
}



package Java.Lecture14;

public class concept {
    static class Animal {
        public void sound(){
            System.out.println("Some Genric animal sound");
        } 
    } 
    static class Dog extends Animal{
        // @Override
        // public void sound(){
        //     System.out.println("Bark");
        // }
        public void new_sound()
        {
             System.out.println("Bark");   
        }
    }
    public static void main(String[] args) {
        Animal a=new Animal();
        a.sound();
        
        Dog d=new Dog();
        d.sound();
        d.new_sound();
    }
}
*/
