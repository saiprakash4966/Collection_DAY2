package Map;

import java.util.HashMap;
import java.util.Map;

public class Students 
{
	 
    public static void main(String args[])
    {
 
        // Creating object for Map.
        Map<Integer, String> map
            = new HashMap<Integer, String>();
 
        // Adding Elements using Map.
        map.put(20, "Sai");
        map.put(31, "Manoj");
        map.put(42, "Chandu");
 
        // Elements can traverse in any order
        for (Map.Entry m : map.entrySet()) 
        {
            System.out.println(m.getKey() + " "
                               + m.getValue());
        }
    }
}
