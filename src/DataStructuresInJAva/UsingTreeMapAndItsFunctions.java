package DataStructuresInJAva;

import java.util.TreeMap;

public class UsingTreeMapAndItsFunctions {
	public static void main(String []args){
		 //declaration
	      TreeMap<Integer, String> tmap =  new TreeMap<Integer, String>();
	      /*Adding elements to TreeMap*/
	      tmap.put(1, "player1");
	      tmap.put(101, "player2");
	      tmap.put(72, "player3");
	      tmap.put(4, "player4");
	      tmap.put(26, "player5");
	      //printing the TreeMap
	      System.out.println("Elements of treemap are "+ tmap);
	      /* Get values based on key*/
	      String var= tmap.get(72);
	      System.out.println("Value at index 2 is: "+var);
	      /* Remove values based on key*/
	      tmap.remove(101);
	      System.out.println("Elements of hashmap are "+ tmap);
	}

}
