

public class Lecture_11 {
    public static class CrazyStudent {
        //Private attribbutes for encapsulation
        private String name;
        private int marks;
        //Constructor
        public CrazyStudent(String name , int marks){
            this.name = name;
            this.marks = marks;
        }
        //Getter and Setter for name
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        
        public int getMarks(){
            return marks;
        }
        public void setMarks(int marks){
            this.marks = marks;
        }
        
        public void displayInfo(){
            System.out.println("Name:"+name+", Marks:"+marks);
        }

    }
    public static void main(String[] args) {
        CrazyStudent s = new CrazyStudent("Mayank", 90);
        s.displayInfo();
        s.setMarks(85);
        System.out.println(s.getMarks());
        s.displayInfo();
        
    }
}



/*



public class Lecture_11 {
    public static class Vehicle {
        String brand;
        int year;
        public Vehicle(String b , int y){
            this.brand= b;
            this.year = y;
        }
        public void displayInfo(){
            System.out.println("Brand:"+brand+" ,Year:"+year);
        }
    }
    public static void main(String[] args) {
        Vehicle a1 = new Vehicle("Maruti", 2024);
        a1.displayInfo();
        
        
        Vehicle a2 = new Vehicle("Maruti", 2025);
        a2.displayInfo();
    }
}



package Java.Lecture12;

public class concept {
    public static class SillyAnimal {
        // Instance variables
        String type; 
        int age;
        // Method to display details
        public void displayInfo() {
            System.out.println ("Type: " + type + ",Age:" + age);
        }
    }
        public static void main(String[] args) {
        // Creating an object of Silly Animal
        SillyAnimal a = new SillyAnimal();
        a.type = "Cat";
        a.age = 3;
        a.displayInfo();
        }
    }
    
public class Lecture_11 {
    public static class SillyAnimal {
        //Instance Variable
        String type;
        int age;
        //Methods to diplay details
        public void displayInfo(){
            System.out.println("Type:"+type+" ,Age: "+age);
        }
      
    }
      public static void main(String[] args) {
            //Creating an object of SillyAnimal
            SillyAnimal a = new SillyAnimal();
            a.type="Cat";
            a.age =3;
            a.displayInfo();
        }
}//Modified

*/
