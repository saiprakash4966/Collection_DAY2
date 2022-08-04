package List;

import java.util.ArrayList;
import java.util.List;

public class Vehicle
{
	
		 
	    public static void main(String args[])
	    {
	 
	        // Creating a List
	        List<String> c = new ArrayList<>();
	 
	        // Adding elements in the List
	        c.add("Blue");
	        c.add("Red");
	        c.add("White");
	 
	        // Iterating the List
	        // element using for-each loop
	        for (String colour : c)
	            System.out.println(colour);
	    }
}


