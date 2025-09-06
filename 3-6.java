
// Given an integer, you have to check if it is a Strong number or not.
// Strong number is a number whose sum of the factorial of the digits is equal to the number itself.

// Eg: 6! = 6x5x4x3x2x1 = 720 == 6? -> No
// Eg: 2! = 2x1 = 2 == 2? -> Yes

// HW-2
// Given a matrix, find the largest element in each row.

// input:
// 1 2 3 4
// 5 3 2 1
// 6 8 4 1

// output:
// 1 2 3 4 -> 4
// 5 3 2 1 -> 5
// 6 8 4 1 -> 8

// 3. Given a matrix, find the largest element in each column.


Question: Sort an array of positive integers such that odd numbers come before even numbers. 
(relative position among the odd and the even numbers shall be maintained.)

a = [3,6,2,4,5,9,7,10]
op = [3, 5, 9, 7, 6, 2, 4, 10]

even = [6, 2, 4, 10]
odd = [3, 5, 9, 7]
ans = [3, 5, ,9 , 7, 6, 2, 4, 10]

ans = [3, 5, 9, 7, 10, 4,2, 6]
ans = [3, 5, 9, 7, 6, 2, 4, 10]


/*


import java.util.*;
import java.lang.Math;
public class Main
{
 public static void main(String[] args) {
  int [][] matrix1 = {{1,2,3,4,5},
                      {5,10,11,2,5},
                      {1,2,3,5,8},
                      {10,9,5,18,7}};
  
  int n = matrix1.length;
  int m = matrix1[0].length;
  
  int [] maxCol = new int[m];
  
  System.out.print("No of rows and column in the matrix are as follows : ");
  
  System.out.println(n+" "+m);

  int k =0;
  for(int j=0; j<m; j++)
  {
      int mx= matrix1[0][j];
      for(int i =0; i<n; i++)
      {
          mx = Math.max(mx, matrix1[i][j]);
      }
      
      maxCol[j] = mx;
  }
  
  ////Expected Output : 10 10 11 18 8
  
  System.out.print("Max Elements in each column are as follows: ");
  for(int elem : maxCol)
  {
      System.out.print(elem+" ");
  }
 }
}

import java.util.*;
import java.lang.Math;
public class Main
{
 public static void main(String[] args) {
  int [][] matrix1 = {{1,2,3,4,5},
                      {5,10,11,2,5},
                      {1,2,3,5,8},
                      {10,9,5,18,7}};
  
  int n= matrix1.length;
  int m = matrix1[0].length;
  
  int [] maxRow = new int[n];
  
  System.out.print("No of rows and column in the matrix are as follows : ");
  
  System.out.println(n+" "+m);
  
  int k =0;
  
  for(int i =0;i<n;i++)
  {
      int mx= matrix1[i][0];
      for(int j =0;j<m;j++)
      {
          mx = Math.max(mx, matrix1[i][j]);
      }
      
      maxRow[k++] = mx;
  }
  
  ////Expected Output : 5 11 8 18
  
  System.out.print("Max Elements in each row are as follows: ");
  for(int elem : maxRow)
  {
      System.out.print(elem+" ");
  }
 }
}


public class Lecture_16 {
    
    public static int factorial(int n)
    {
        int f = 1;
        for(int i = 1; i <= n; i++) 
        {
            f *= i;
        }
            
        return f;
    }
    
    public static void main(String[] args) {
        int number = 45; 
        int temp = number;
        int sum = 0;

        while (temp > 0) 
        {
            sum += factorial(temp % 10);
            temp /= 10;
            System.out.println(sum);
        }

        if (sum == number) {
            System.out.println(number + " is a Strong number");
        } else {
            System.out.println(number + " is not a Strong number");
        }
    }
}


public class Main
{
    
    public static class Rectangle
    {
        double length;
        double breadth;
        
        public Rectangle()
        {
            this.length = 0.0;
            this.breadth =0.0;
        }
        
        public Rectangle(double l, double b)
        {
            this.length = l;
            this.breadth = b;
        }
        
        public double area()
        {
            return length*breadth;
        }
        
        
    }
 public static void main(String[] args) {
     
     
     Rectangle ac = new Rectangle(2,20);
     System.out.println(ac.area());
 }
}


package Java.Lecture17;
// Question: Create a class Rectangle with attributes length and width and a method to compute the area .Instantiate a rectangle and print its area.


public class Q2 {
    public static class Rectangle{
        int length;
        int width;

        public Rectangle(int l, int w){
            this.length = l;
            this.width = w;
        }

        public int getArea(){
            return length * width;
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        System.out.println(r.getArea());
        
        Rectangle r1 = new Rectangle(12, 5);
        System.out.println(r1.getArea());
    }
}



public class Lecture_16 {
    public static class Rectangle {
        double length;
        double breadth;
        
        // public Rectangle()
        public void area(double l , double b){
            System.out.println("Area of rectangle is: "+(l * b));
        }
    }
    public static void main(String[] args) {
      Rectangle rt = new Rectangle();
      rt.area(4.5,5);   
    }
}


public class Main
{
    
    public static class Calculator
    {

        // int num1=0;
        // int num2=0;
        // //String operation;


        public void addition(int num1,int num2)
        {
            
            System.out.println(num1 + num2);
        }
        
        public void addition(double num1,double num2)
        {
            
            System.out.println(num1 + num2);
        }

        
    }
 public static void main(String[] args) {
     
     
     Calculator calc = new Calculator();
     calc.addition(5,6);
     calc.addition(5.06,10.59);
  System.out.println("Hello World");
 }
}



public class Lecture_16 {
public static class Calculator {
    int add(int a) {
        return a + 10;
    }
    double add(double a, double b) {
        return a + b;
    }
}
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2));
        System.out.println(calc.add(2.5, 3.5));
    }
}


package Java.Lecture17;
// Question: Create a class calculator with overloaded methods for addition; call the appropriate method based on parameter types.
public class Q1 {
    
    public static class calculator{
        public int add(int a, int b){
            return a + b;
        }

        public double add(double a, double b){
            return a + b;
        }

        public String add(String a, String b){
            return a + b;
        }
    }

    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println(calc.add(5, 10));
        System.out.println(calc.add(5.5, 10.5));
        System.out.println(calc.add(3, 10.5));
        System.out.println(calc.add("Hello", "World"));
    }
}
*/
