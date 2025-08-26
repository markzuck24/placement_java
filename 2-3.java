package Java.Lecture8;
import java.util.HashMap;
import java.util.*;

public class concept {
    public static void main (String[] args) {
        // Hint: Add country-capital pairs with put
    HashMap<String, String> capitals = new HashMap<>();
    capitals.put ("USA", "Washington, D.C.");
    capitals.put ("France", "Paris"); 
    capitals.put ("Japan", "Tokyo"); 
    capitals.put ("Germany", "Berlin"); 
    capitals.put("India", "New Delhi");
    capitals.put ("Brazil","Brasília");
    capitals.put("Canada", "Ottawa");
    capitals.put("Japan", "Kyoto");
    capitals.put ("Australia", "Canberra");
     capitals.put("China", "Beijing");
    System.out.println("Country Capitals: " + capitals);
    System.out.println(capitals.size());
    capitals.clear();
    System.out.println(capitals);
    System.out.println(capitals.size());
    }
}



/*

public class concept {
    public static void main (String[] args) {
        // Hint: Add country-capital pairs with put
    HashMap<String, String> capitals = new HashMap<>();
    capitals.put ("USA", "Washington, D.C.");
    capitals.put ("France", "Paris"); 
    capitals.put ("Japan", "Tokyo"); 
    capitals.put ("Germany", "Berlin"); 
    capitals.put("India", "New Delhi");
    capitals.put ("Brazil","Brasilia");
    capitals.put("Canada", "Ottawa"); 
    capitals.put ("Australia", "Canberra");
    System.out.println("Country Capitals: " + capitals);
    
    for(var elem :capitals.entrySet()){
        System.out.println(elem.getKey() +"-->"+elem.getValue());
    }
    }
}


package Java.Lecture8;
import java.util.HashMap;
import java.util.*;

public class concept {
    public static void main (String[] args) {
        // Hint: Add country-capital pairs with put
    HashMap<String, String> capitals = new HashMap<>();
    capitals.put ("USA", "Washington, D.C.");
    capitals.put ("France", "Paris"); 
    capitals.put ("Japan", "Tokyo"); 
    capitals.put ("Germany", "Berlin"); 
    capitals.put("India", "New Delhi");
    capitals.put ("Brazil","Brasilia");
    capitals.put("Canada", "Ottawa"); 
    capitals.put ("Australia", "Canberra");
    System.out.println("Country Capitals: " + capitals);
    
    for(String i:capitals.keySet()){
        System.out.println(i+"-->"+capitals.get(i));
    }
    }
}



import java.util.*;
public class Main
{
 public static void main(String[] args) {
     
     HashMap<String,String> capitals = new HashMap<>();
     
     capitals.put("USA","Washington D.C");
     capitals.put("France","Paris");
     capitals.put("Japan","Tokyo");
     capitals.put("Germany","Berlin");
     capitals.put("India","New Delhi");
     capitals.put("Brazil","Brasalia");
     capitals.put("Cannada","Ottawa");
     capitals.put("Australia","Canabera");
 
    System.out.println(capitals.containsKey("China"));
    System.out.println(capitals.containsValue("Paris"));
  }
  
 }
 
 
public class concept {
    public static void main (String[] args) {
        // Hint: Add country-capital pairs with put
    HashMap<String, String> capitals = new HashMap<>();
    
    capitals.put ("USA", "Washington, D.C.");
    capitals.put ("France", "Paris"); 
    capitals.put ("Japan", "Tokyo"); 
    capitals.put ("Germany", "Berlin"); 
    capitals.put("India", "New Delhi");
    capitals.put ("Brazil","Brasília");
    capitals.put("Canada", "Ottawa"); 
    capitals.put ("Australia", "Canberra");
    System.out.println("Country Capitals: " + capitals);
    
    System.out.println(capitals.remove("USA"));
    System.out.println(capitals);
    }
}

import java.util.*;
public class Main
{
 public static void main(String[] args) {
     
     HashMap<String,String> capitals = new HashMap<>();
     
     capitals.put("USA","Washington D.C");
     capitals.put("France","Paris");
     capitals.put("Japan","Tokyo");
     capitals.put("Germany","Berlin");
     capitals.put("India","New Delhi");
     capitals.put("Brazil","Brasalia");
     capitals.put("Cannada","Ottawa");
     capitals.put("Australia","Canabera");
     
     
  System.out.println("Country and their Capitals : "+capitals);
  
  System.out.println("Capital of France is: "+ capitals.get("France"));
  
  capitals.put("Japan","Kyoto"); 
  
  System.out.println("Country and their Capitals : "+capitals);
 }
}



import java.util.HashMap;
public class HM {
    public static void main(String [] args ){
        //Hint : Add countery name and capital name 
        
        HashMap<String,String> capitals= new HashMap<>();
        
        capitals.put("France", "Paris");
        capitals.put("India","New Delhi");
        capitals.put("USA","Washington DC");
        capitals.put("UK","London");

        System.out.println("country capitals: " + capitals );
        
        String ans = capitals.get("France");
        
        System.out.println(ans);
        


    }
}
*/
