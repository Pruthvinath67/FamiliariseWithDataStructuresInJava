package DataStructuresInJAva;

import java.util.HashSet;

public class UsingHashSetAndItsFunctions {
	public static void main (String Rgs[]){
		  // declaration
	      HashSet<String> hset = new HashSet<String>();
	      // Adding elements to the HashSet
	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Banana");
	      //Addition of duplicate elements
	      hset.add("Apple");
	      hset.add("Grapes");
	      //Addition of null values
	      hset.add(null);
	      hset.add(null);
	      //Display HashSet elements
	      System.out.println(hset);
	      Integer i= hset.size();
	      System.out.println("Size of hashset is "+i);
	}

}
