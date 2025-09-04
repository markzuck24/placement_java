
// Given an integer, you have to check if it is a Strong number or not.
// Strong number is a number whose sum of the factorial of the digits is equal to the number itself.

// Eg: 6! = 6x5x4x3x2x1 = 720 == 6? -> No
// Eg: 2! = 2x1 = 2 == 2? -> Yes

/*



public class Lecture_14 {
    public static class CrazyAnimal 
    {
        public void sound()
        {
            System.out.println("Animals ki awaaz saare gama paa");
        }
        
    }

    static class Dog extends CrazyAnimal 
    {
               
        @Override
        public void sound()
        {
            System.out.println("bhauuuu");
        }
    }
    
    public static void main(String[] args) 
    {
        CrazyAnimal a = new CrazyAnimal();
        Dog d = new Dog();
        a.sound();
        d.sound();
    }
}


package Java.Lecture15;
// Question: Create a class Phone with overloaded constructors: one with no parameters(default values)
// and one with parameters to set model and price. Display the phone details.
public class Q5 {
    public static class Phone{
        String model;
        int price;
        
        public Phone(){
            this.model="Not Available";
            this .price=0;
        }
        
        public Phone(String model,int price){
            this.model=model;
            this.price=price;
        }
        
        public void displayinfo(){
            System.out.println("Model: "+model);
            System.out.println("Price: "+price);
            System.out.println("===============================");
        }
    }
    public static void main(String[] args) {
        Phone p=new Phone();
        p.displayinfo();
        Phone p1=new Phone("Samsung",100000);
        p1.displayinfo();   
        
    }
    
}



public class Lecture_14 {
    public static class CrazyEmployee {
        private String name;
        private double salary;
        
        public CrazyEmployee (String name , double  salary){
            this.name=name;
            this.salary = salary;
        }
        
        
        public String getName(){
            return  name;
        }
        public void setName(String name){
            this.name=name;
        }
        
        
        public double getSalary(){
            return salary;
        }
        public void setSalary(double salary){
            this.salary=salary;
        }
        
        
        public void show(){
            System.out.println("Employee name: "+name+" Employee salary: $"+salary);
        }
        
    }
    public static void main(String[] args) {
        CrazyEmployee emp = new CrazyEmployee("Mayank",2700000);
        emp.show();
        emp.setSalary(9999999);
        emp.getSalary();
        emp.show();
       
    }
}


package Java.Lecture15;
// Question: Create a class Employee with private attributes name and salary. Provide public getters and setters and display the details
public class Q3 {
    public static class Employee{
        private String name;
        private int salary;
        
        public Employee(){
            this.name="No Employee Available";
            this.salary=0;
        }
        
        public Employee(String name){
            this.name=name;
            this.salary=0;
        }
        public Employee(int salary){
            this.name="No Employee Available";
            this.salary=salary;
        }
        public Employee(String name,int salary){
            this.name=name;
            this.salary=salary;
        }
        
        
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
        public void setSalary(int salary){
            this.salary=salary;
        }
        public int getSalary(){
            return salary;
        }
        public void displayinfo(){
            System.out.println("Name: "+name);
            System.out.println("Salary: "+salary);
            System.out.println("=========================================");
        }
    }
    public static void main(String[] args) {
        Employee e=new Employee();
        e.displayinfo();
        Employee e1=new Employee("Anubhav");
        e1.displayinfo();
        Employee e2=new Employee(10000);
        e2.displayinfo();
        Employee e3=new Employee("Anubhav",10000);
        e3.displayinfo();
        Employee e4=new Employee(10000,"Anubhav");
        e4.displayinfo();   
    }
}

package Java.Lecture15;
// Question: create a class Laptop with a constructor to initialize its attributes brand and price. Print the object details.

import java.util.Scanner;
public class Q2 {
    public static class Laptop{
        String brand;
        int price;

        public Laptop(){
            this.brand = "Not available";
            this.price=0;
        }
        public Laptop(String brand){
            this.brand=brand;
            this.price = 0;
        }
        public Laptop(int price){
            this.price=price;
            this.brand = "Not available";
        }
        public Laptop(String brand,int price){
            this.brand=brand;
            this.price=price;
        }
        public void displayinfo(){
            System.out.println("Brand: "+brand);
            System.out.println("Price: "+price);
            System.out.println("==========================");
        }
    }   
    public static void main(String[] args) {
        Laptop n=new Laptop();
        n.displayinfo();
        
        Laptop n1=new Laptop(70000);
        n1.displayinfo();
        Laptop n2=new Laptop("ASUS");
        n2.displayinfo();
        
        Laptop n3=new Laptop("Lenovo", 80000);
        n3.displayinfo();   
    }
}


package Java.Lecture15;
// Question: Create a class car with attributes model and year . Instantiate an object and print its details
public class Q1 {
    public static class Car{
        String model;
        int year;
        
        public Car(String model, int year){
            this.model = model;
            this.year = year;
        }
        public void displayinfo(){
            System.out.println("Model: "+model);
            System.out.println("Year: "+year);
        }
    }
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022);
        car.displayinfo();
    }
    
}
*/
