




// Question: Sort an array of positive integers such that odd numbers come before even numbers. 
// (relative position among the odd and the even numbers shall be maintained.)

// a = [3,6,2,4,5,9,7,10]
// op = [3, 5, 9, 7, 6, 2, 4, 10]

// even = [6, 2, 4, 10]
// odd = [3, 5, 9, 7]
// ans = [3, 5, ,9 , 7, 6, 2, 4, 10]

// ans = [3, 5, 9, 7, 10, 4,2, 6]
// ans = [3, 5, 9, 7, 6, 2, 4, 10]


package Java.Lecture18;
// Question: Sort an array of positive integers such that odd numbers come before even numbers.
import java.util.Arrays;
public class Q5 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int n=a.length;
        int left = 0;
        int right = n - 1;
        
        while (left < right) {
            while (left < right && a[left] % 2 != 0) {
                left++;
            }
            while (left < right && a[right] % 2 == 0) {
                right--;
            }
            if (left < right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
        
        // Print the sorted array
        System.out.println(Arrays.toString(a));
    }
}




// Before classes: x/10, After: y/10

/*



import java.util.*;
public class Main
{
 public static void main(String[] args) {
  int[] arr = {4, 3, 2, 7, 9, 6};

        List<Integer> oddNum = new ArrayList<>();
        List<Integer> evenNum = new ArrayList<>();
        
         for (int num : arr) {
            if (num % 2 != 0) {
                oddNum.add(num);
            } else {
                evenNum.add(num);
            }
        }
        
        int index = 0;
        for (int elem : oddNum) {
            arr[index++] = elem;
        }
        
        for (int elem : evenNum) {
            arr[index++] = elem;
        }
        
        for(int elem: arr)
        {
            System.out.print(elem+" ");
        }
 }
}



public class Lecture_16 {
    public static void main(String[] args) {
        int[] arr ={3,6,2,4,5,9,7,10};
        int n = arr.length;
        int[] comb = new int[n];
        int count = 0;
        for(int elem : arr)
        {
            if(elem % 2 !=0)
            {
                comb[count++]=elem;
            }
        }
        for (int elem : arr) {
            if(elem % 2 == 0)
            {
                comb[count++]=elem;
            }
        }
        for(int i = 0; i<n; i++)
        {
            arr[i]=comb[i];
        }
        
        for(int num:arr)
        {
            System.out.print(num + " ");
        }
    }
}


public class Lecture_17 {
    public static class Utility {
        public static int square(int n){
            return n*n;
        }
    }
    public static void main(String[] args) {
        System.out.println("Square of the integer: "+Utility.square(5));
    }
}



public class Main
{
    public static class SillyCalculator
    {
        double num1;
        double num2;
        
        public SillyCalculator(double n1,double n2)
        {
            this.num1= n1;
            this.num2 = n2;
        }
        public double multiply()
        {
            return num1*num2;
        }
        
        public double division()
        {
            if(num2!=0)
            {
                return num1/num2;
            }
            else
            {
                return 0.0;
            }
        }
    }
 public static void main(String[] args) {
     
     SillyCalculator calc = new SillyCalculator(5,0);
     
     System.out.println(calc.multiply());
     System.out.println(calc.division());
  
 }
}


public class Lecture_17 {
    public static class Person {
        double height;
        String name;
        public Person(){
            this.height=0;
            this.name="Not available";
        }
        public Person(double height,String name){
            this.height=height;
            this.name=name;
        }
        public void show(){
            System.out.println("Person Height: "+height+"cm");
            System.out.println("Name: "+name);
            System.out.println("=========================");
        }
    }
    public static void main(String[] args) {
        Person p1= new Person();
        Person p2 = new Person(185, "Mayank");
        p1.show();
        p2.show();
    }
}

public class Lecture_17 {
    public static class Account {
        int balance;
        public Account(int balance){
            this.balance=balance;
        }
        public void depositFunds(int amount){
            balance += amount;
        }
        public void show(){
            System.out.println("Current Balance: "+balance);
        }
    }
    public static void main(String[] args) {
        Account ac = new Account(200);
        ac.depositFunds(100);
        ac.show();
    }
}

*/
