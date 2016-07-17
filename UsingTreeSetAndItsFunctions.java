package DataStructuresInJAva;

import java.util.TreeSet;

/**
 * @author pruthvi
 */

public class UsingTreeSetAndItsFunctions {
	public static void main(String []args){
		//declaration
		TreeSet<String> tset =new TreeSet<String>();
		//Adding elements to the TreeSet
		tset.add("pruthvi");
		tset.add("nath");
		tset.add("beta");
		tset.add("delta");
		tset.add("alpha");
		tset.add("gama");
		//Addition of duplicate elements
	      tset.add("pruthvi");
	      tset.add("beta");
	      //Display HashSet elements
	      System.out.println(tset);
	      Integer i= tset.size();
	      System.out.println("Size of hashset is "+i);
	      boolean key= tset.contains("nath");
	      System.out.println(key);		
	}

}
