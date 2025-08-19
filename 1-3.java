// Online Java Compiler
// Use this editor to write, compile and run your Java code online


// 1. Question: Write a program to check if a number is positive, negative, or zero


// 2. Question: Write a program to find the largest of three numbers.


// 3. Given a value n, print all the numbers from 1 to n, each on a new line.
// a- using for loop
// b - using while loop



// 4. Question: Write a program to calculate the sum of natural numbers up to a given number n.



// 5 - Question: Write a program to print the Fibonacci series up to n terms.
// first = 0
// second = 1


// 6 - Write a program to reverse a given number.

7. Question: Write a program to check if a number is a palindrome.

1204 -> no
404 -> yes


class Main {
    public static void main(String[] args) {
    
    }
}





/*


class Main {
    public static void main(String[] args) {
       
    int number = 1204;
    
    int reversed = 0;
    while (number != 0) {
        int digit = number % 10;
        reversed = reversed * 10 + digit;
        number /= 10;
        System.out.println(reversed); 
    }
    
    
    System.out.println(reversed); 
    }
}



class Main {
    public static void main(String[] args) {
       
    int n = 10;
    
    int first = 0;
    int second = 1;
    System.out.print(first + " " + second + " ");
    
    for (int i = 12; i < n+10; i++) 
    {
        int next = first + second;
        System.out.print(next + " ");
        first = second;
        second = next;
    }
    
        
    }
}


class Main {
    public static void main(String[] args) {
       
    int sum = 0;
    int n = 10;
    
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
     System.out.println(sum);
    
        
    }
}


class Main {
    public static void main(String[] args) {
       
    int n = 10;
    
    for(int i=1; i<=n; i++)
    {
        System.out.println(i);
    }
    
    int j = 1;
    while(j <= n)
    {
        System.out.println(j);
        j++;
    }
    
        
    }
}


class Main {
    public static void main(String[] args) {
       
    int a = 1, b = 4, c= 12;

    int largest = a;
    
    if (b > largest) {
        largest = b;
    }
    
    if (c > largest) {
        largest = c;
    }
    
    System.out.println(largest);
        
    }
}


class Main {
    public static void main(String[] args) {
       
    int x = 10, y = 4;

    x = x + y; //x = 10+4 = 14
    y = x - y; // y = 14 - 4 = 10
    x = x - y; // x = 14 - 10 = 4
    
    System.out.println("x = "+ x);
    System.out.println("y = "+ y);
        
    }
}



class Main {
    public static void main(String[] args) {
       
       int number = 10;
       
        if (number > 0) {
            System.out.println("Positive");
        } 
        else if (number < 0) {
             System.out.println("Negative");
        } 
        else {
             System.out.println("Zero");
        }
        
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(10/3); // 3.333
        System.out.println(-10/3);//-3.333
        System.out.println(10%3);
        
        
        System.out.println(10<3);
        System.out.println(10>3);
    }
}


*/
