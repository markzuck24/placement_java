/*
 You are given an array of int with only 4 types of elements.(1,2,3,4)
 a --> Rearrange the array such that all 4s appear before all 3s and that
 appear before all 2s and that appear before all 1s.
    part1 - Brute force - O(nlogn)
    part2 - Optimised. - O(n)
 
 b-> print in circular fashion.
 1234123413434....
 Optimised way - O(n)
 */
 
 
 package Java.Lecture7;
// Question: You are given an of int with only four types of elements. (1,2,3,4).
// b--> print in circular fashion.
// 12341234234344


HW:
GCD -> greatest common divisor/ HCF -> highest common factor.

int a,b
gcd(a,b)



 


/*


public class Q1 {
    public static void main(String[] args) {
        int[] arr={1,2,4,3,4,2,1,3,4,1,2};
        int n=arr.length;
        int c1=0, c2=0, c3=0, c4=0;
        for(int elem:arr){
            switch (elem) {
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    c4++;
                    break;
                default:
                    break;
            }
        }
        while (n>0) {
            if(c1>0){
                System.out.print(1+" ");
                c1--;
                n--;
            }
            if(c2>0){
                System.out.print(2+" ");
                c2--;
                n--;
            }
            if(c3>0){
                System.out.print(3+" ");
                c3--;
                n--;
            }
            if(c4>0){
                System.out.print(4+" ");
                c4--;
                n--;
            }
        }
    }
}

public class Lecture_6 {
     public static void main(String[] args) {
       
        int [] a ={1,1,2,3,4,4,2,1,3,1,1};
        int n = a.length;

        for (int i = 0; i < n; i++) {
            System.out.print((i % 4) + 1);
        }
        System.out.println();
    
     }
 }
 
import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        int[] a = {3,1,3,2,4,4,1,2,4,3};

        int n = a.length;
        int c1=0,c2=0,c3=0,c4=0;
        
        
        for(int num: a)
        {
            if(num==1) c1++;
            else if(num == 2) c2++;
            else if(num == 3) c3++;
            else if (num == 4) c4++;
        }
        
        for(int i =0; i<c4; i++)
            System.out.print("4 ");
            
        for(int i =0; i<c3; i++)
            System.out.print("3 ");
            
        for(int i =0; i<c2; i++)
            System.out.print("2 ");
            
        for(int i =0; i<c1; i++)
            System.out.print("1 ");
    }
}


import java.util.Arrays;

public class Lecture_6 {
    public static void main(String[] args) {
       

int [] a ={1,1,1,2,2,2,3,3,4,4,4};
int n =a.length;
Arrays.sort(a);
for(int i = n-1; i >=0; i--)
{
    System.out.print(a[i] +" ");
}
System.out.println();


    }
}
*/
