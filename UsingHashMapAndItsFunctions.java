package DataStructuresInJAva;

import java.util.HashMap;

/**
 * @author pruthvi
 */

public class UsingHashMapAndItsFunctions {

	public static void main (String []args){
		/* This is how to declare HashMap */
		HashMap<String,Integer >hmap = new HashMap<String,Integer>();
		  /*Adding elements to HashMap*/
		  hmap.put("player1",21);
		  hmap.put("player2", 104);
		  hmap.put("player3", 0);
		  hmap.put("player4", 56);
		  System.out.println("Elements of hashmap are "+ hmap);
		  /* Get values based on key*/
	      Integer var= hmap.get("player2");
	      System.out.println("Value at index player2 is: "+var);
	      /* Remove values based on key*/
	      hmap.remove("player4");
	      System.out.println("Elements of hashmap are "+ hmap);
	      boolean key= hmap.containsKey("player3");
	      System.out.println(key);
	}

}
