// Question: Find the sum of principal diagonal elements of a 2D Square matrix.

// 1 2 3 4
// 5 6 7 8
// 1 2 3 4
// 5 6 7 8

// a-Brute Force -> O(n^2)


package Java.Lecture13;
// Question: Find the sum of principal diagonal elements of a 2D Square matrix.
public class Q4 {
    public static void main(String[] args) {
        int[][] a = {
                        {1,2,3,4},
                        {5,6,7,8},
                        {1,2,3,4},
                        {5,6,7,10}
                    };
        
        //  00
        //  11
        //  22
        //  33
         
        int n=a.length;
        
        int sum=0;
        
        for(int i=0;i<n;i++){

            sum += a[i][i];
        }
        
        System.out.println(sum);
    }
}


/*


package Java.Lecture13;
// Question: Find the sum of principal diagonal elements of a 2D Square matrix.
public class Q4 {
    public static void main(String[] args) {
        int[][] a = {
                        {1,2,3,4},
                        {5,6,7,8},
                        {1,2,3,4},
                        {5,6,7,8}
                    };
        
        //  00
        //  11
        //  22
        //  33
         
        int n=a.length;
        int m=a[0].length;
        
        int sum=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j)
                {
                    sum += a[i][j];
                }
            }
        }
        
        System.out.println(sum);
    }
}


public class Lecture_12 {
    public static class Calculator {
        
        public int addition(int a, int b) {
            return a+b;
        }

        public int subtraction(int a, int b) {
            return a-b;
        }
    }

    public static void main(String[] args) {
        Calculator s1 = new Calculator();
        System.out.println(s1.addition(5, 3));
        System.out.println(s1.subtraction(5, 2));
    }
}



package Java.Lecture13;
// Question: Create a class calculator with methods for addition and subtraction; then create objects and use them.
public class Q3 {
    public static class Calculator{
        public double n1;
        public Calculator(int v){
            this.n1=v;
        }
        public void add(double a){
            this.n1 += a;
        }
        public void sub(double a){
            this.n1 -= a;
        }           
        public void mul(double a){
            this.n1 *= a;
        }
    
    }
    public static void main(String[] args) {
        Calculator c = new Calculator(100);
        c.add(50);
        c.sub(50);
        c.mul(50);
        System.out.println(c.n1);
    }
    
}


package Java.Lecture13;
// Question: Create a class Book with overloaded constructor to initialize objects in different ways.
public class Q2 {
    public static class Book{
        int price;
        String title;
        
        public Book(int price){
            this.price = price;
        }
        
        public Book(String title){
            this.title = title;
        }
        
        public Book(int price,String title){
            this.price = price;
            this.title = title;
        }
        
        public void show(){
            System.out.println(price);
            System.out.println(title);
            System.out.println("======================");
        }

    }
    public static void main(String[] args) {
        Book b1=new Book(200);
        Book b2=new Book("Let us C");
        Book b3=new Book(1000,"Balagoswamy");  
        b1.show();
        b2.show();
        b3.show();
    }
}

*/
