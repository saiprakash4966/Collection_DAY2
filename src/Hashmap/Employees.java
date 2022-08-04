package Hashmap;

import java.util.HashMap;

public class Employees
{
  
    // Main driver method
    public static void main(String[] args)
    {
        // Create an empty hash map by declaring object
        // of string and integer type
        HashMap<String, Integer> map = new HashMap<>();
  
        // Adding elements to the Map
        // using standard put() method
        map.put("Sai", 50);
        map.put("Raghu", 10);
        map.put("Srikanth", 30);
  
        // Print size and content of the Map
        System.out.println("Size of map is:- "
                           + map.size());
  
        // Printing elements in object of Map
        System.out.println(map);
  
        // Checking if a key is present and if
        // present, print value by passing
        // random element
        if (map.containsKey("Srikanth")) {
  
            // Mapping
            Integer a = map.get("Srikanth");
  
            // Printing value fr the corresponding key
            System.out.println("value for key"
                               + " \"Srikanth\" is:- " + a);
        }
    }
}